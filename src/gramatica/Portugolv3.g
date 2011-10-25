grammar Portugolv3;


options {
	output=AST;
	ASTLabelType=CommonTree;
	language=Java;
}

tokens{
ENTAO='ENTAO';
SENAO='SENAO';
SE='SE';
COMANDOS='COMANDOS';
VARIAVEIS='VARIAVEIS';
FUNCOES='FUNCOES';
LISTAPARAMETROS='LISTAPARAMETROS';
TIPORETORNO='TIPORETORNO';
CORPOFUNCAO='CORPOFUNCAO';
LEIA='LEIA';
FIM='FIM';
IMPRIMA='IMPRIMA';
ENQUANTO='ENQUANTO';
PASSO='PASSO';
CONDICAO='CONDICAO';
ATRIBUICAO='ATRIBUICAO';
PARA='PARA';
CHAMADAFUNCAO='CHAMADAFUNCAO';
}



@header {
package Gramatica;
	import java.util.HashMap;
	import java.util.Iterator;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.StringTokenizer;
	import java.util.Stack;
}

@lexer::header{
	package Gramatica;
	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.File;
	import java.io.FileWriter;
	import java.util.Scanner;
}



@members{
//Tabela de simbolos
	public HashMap<String,Simbolo> tabelaSimbolos = new HashMap<String,Simbolo>();
	Stack<Erros> meusErros = new Stack();
    	public String getErrorMessage(RecognitionException e,
        String[] tokenNames) {
        List stack = getRuleInvocationStack(e, this.getClass().getName());
        String msg = null;
        if (e instanceof NoViableAltException) {
            NoViableAltException nvae = (NoViableAltException) e;
            msg = " Sem alternativa Visivel; Linha=" + e.line + "Coluna: " + e.charPositionInLine;
            meusErros.push(new Erros(e.line,e.charPositionInLine,nvae.input.index(),msg));
        } else if (e instanceof MismatchedTokenException) {
            MismatchedTokenException nvae = (MismatchedTokenException) e;
            msg = " Linha: "+ e.line+":"+e.charPositionInLine+" Esperado " + tokenNames[nvae.expecting] + " Mas encontrado: " + tokenNames[nvae.c];
            meusErros.push(new Erros(e.line,e.charPositionInLine,nvae.input.index(),msg));      
        } else if (e instanceof RecognitionException) {
            RecognitionException nvae = (RecognitionException) e;
            meusErros.push(new Erros(e.line,e.charPositionInLine,nvae.input.index(),msg));            
        }
        else {
            msg = super.getErrorMessage(e, tokenNames);
            meusErros.push(new Erros(e.line,e.charPositionInLine,e.input.index(),msg));
        }
        //return stack+" "+msg;
        try {
                File erro = new File("erro.e");
                String conteudo = "";
                if (erro.exists()) {
                    Scanner input = new Scanner(erro);
                    while (input.hasNext()) {
                        conteudo = conteudo + input.nextLine() + "\n";
                    }
                    input.close();
                }
                BufferedWriter erros = new BufferedWriter(new FileWriter(erro));
                erros.write(msg+"\n"+conteudo);
                erros.flush();
                erros.close();
                
            } catch (Exception i) {
            }
        return msg;
    }
    // public String getTokenErrorDisplay(Token t) {
    // 	return t.toString();
    //}
}


prog	: COMMENT* 'PROGRAMA' nomePrograma=ID ';' declVars* declFuncoes* comandos* 'FIM' '.' -> ^($nomePrograma ^('VARIAVEIS' declVars*) ^('FUNCOES' declFuncoes*) ^('COMANDOS' comandos*) )
	;

declVars 

@after {
	//System.out.println($a.text);
	StringTokenizer st = new StringTokenizer($listaIDs.text);
	while(st.hasMoreElements()) {
		//Simbolo(tipo, nome);
		String nome = st.nextToken(",");
		Simbolo simbolo = new Simbolo($a.numeroTipo, nome);
		tabelaSimbolos.put(nome, simbolo);
		System.out.println("Adicionando a tabela de simbolos: "+$a.text+" - "+nome);
		
	
	}
}	
	: a=tipo listaIDs=listaIds';' -> ^(tipo listaIds)
	;


tipo	returns [int numeroTipo]
	:'INTEIRO' 	{$numeroTipo = 0;}
	|'STRING' 	{$numeroTipo = 1;}
	|'BOOLEANO'	{$numeroTipo = 2;}
	|'VOID'		{$numeroTipo = 3;}
	;

        	
listaIds returns [List<String> lista]
	:(ids+=ID) (',' ids+=ID)* {$lista = $ids;} -> ID+
	;

	
declFuncoes
	:'FUNCAO' nomeFuncao=ID '('(listaParametros*)')'':' tipo ';' corpoFuncao 'FIM' ';' -> ^($nomeFuncao ^('LISTAPARAMETROS' listaParametros*) ^('TIPORETORNO' tipo) ^('CORPOFUNCAO' corpoFuncao) )
	;

	
corpoFuncao
	: declVars* comandos* -> ^('VARIAVEIS' declVars*) ^('COMANDOS' comandos*)
	;

	
listaParametros
	:(ID ':' tipo) (',' ID ':' tipo)* -> ^(tipo ID)*
	;

		
comandos:	
	comando_se_senao -> comando_se_senao
	//Na linha abaixo mudei expr por comparacao, perguntar para o prof. dps...
	|comando_para -> comando_para
	|comando_imprimir -> comando_imprimir
	|comando_ler -> comando_ler
	|comando_enquanto -> comando_enquanto
	|'SAIR' ';' -> 'SAIR' 
	| chamadaFuncao ';' -> chamadaFuncao
	| comando_atribuicao -> comando_atribuicao
	;

	
comando_enquanto
	:'ENQUANTO' '(' exprBooleana ')' comandos* 'FIM' ';' -> ^(ENQUANTO exprBooleana comandos*)
	;

	
comando_para
	:'PARA' '(' ID '=' expr 'ATE' comparacao  ('PASSO' expr)? ')' comandos*  'FIM' ';' -> ^(PARA ^('ATRIBUICAO' ID expr) ^('CONDICAO' comparacao) ^('PASSO' expr)? ^('COMANDOS' comandos*))		
	;
	
	
comando_imprimir
	:'IMPRIMA' '(' a=expr (',' b=expr )* ')' ';' -> ^(IMPRIMA $a $b*)
	;
	
	
comando_ler	: 'LEIA' '(' listaIds ')' ';' -> ^(LEIA listaIds)
	;

	
comando_se_senao
	: SE '(' exprBooleana ')' comandos+ senao? 'FIM' ';' -> ^(SE exprBooleana ^(ENTAO comandos+) senao? )
	;

	
senao	: (SENAO senao_comando+) -> ^(SENAO senao_comando+)	
	;

	
senao_comando
	: comandos -> comandos
	;
	
	
	
chamadaFuncao
	: ID '(' (expr (',' expr)*)? ')' -> ^(CHAMADAFUNCAO ID ^(LISTAPARAMETROS expr expr*)? ) 
	;
	
	
comando_atribuicao 
	: ID '=' exprBooleana ';' -> ^('=' ID exprBooleana)
	;
	
	
exprBooleana	: (a=exprAnd) ('||'^ b=exprAnd)*
	;
	
	
exprAnd	:	(comparacao) ('&&'^ comparacao)*
	;
	
	
comparacao:	(rel) ('=='^ rel | '!='^ rel)*
	;
	
	
rel	:	expr (('>'^|'<'^|'>='^|'<='^) expr)?
	;
	

expr	:	termo ('+'^ termo | '-'^ termo)* 
    	;
	
	
termo	:	unario  ('*'^ unario | '/'^ unario )* 
    ;

unario
    	:('!'^|'-'^) unario
    	|fator ('^'^ fator)*
    	|chamadaFuncao;

fator 
    :   INT 
    |   ID
    |	string
    |   '(' exprBooleana ')' -> exprBooleana
    | 'true'
    | 'false'
    ;

string	:STRING
	;

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;
    
COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;
    
STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
//    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
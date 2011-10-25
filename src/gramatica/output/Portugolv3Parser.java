// $ANTLR 3.3 Nov 30, 2010 12:45:30 /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g 2011-10-17 15:46:17

package Gramatica;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Stack;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class Portugolv3Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ENTAO", "SENAO", "SE", "COMANDOS", "VARIAVEIS", "FUNCOES", "LISTAPARAMETROS", "TIPORETORNO", "CORPOFUNCAO", "LEIA", "FIM", "IMPRIMA", "ENQUANTO", "PASSO", "CONDICAO", "ATRIBUICAO", "PARA", "CHAMADAFUNCAO", "COMMENT", "ID", "INT", "STRING", "WS", "ESC_SEQ", "HEX_DIGIT", "OCTAL_ESC", "UNICODE_ESC", "'PROGRAMA'", "';'", "'.'", "'INTEIRO'", "'STRING'", "'BOOLEANO'", "'VOID'", "','", "'FUNCAO'", "'('", "')'", "':'", "'SAIR'", "'='", "'ATE'", "'||'", "'&&'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'!'", "'^'", "'true'", "'false'"
    };
    public static final int EOF=-1;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int ENTAO=4;
    public static final int SENAO=5;
    public static final int SE=6;
    public static final int COMANDOS=7;
    public static final int VARIAVEIS=8;
    public static final int FUNCOES=9;
    public static final int LISTAPARAMETROS=10;
    public static final int TIPORETORNO=11;
    public static final int CORPOFUNCAO=12;
    public static final int LEIA=13;
    public static final int FIM=14;
    public static final int IMPRIMA=15;
    public static final int ENQUANTO=16;
    public static final int PASSO=17;
    public static final int CONDICAO=18;
    public static final int ATRIBUICAO=19;
    public static final int PARA=20;
    public static final int CHAMADAFUNCAO=21;
    public static final int COMMENT=22;
    public static final int ID=23;
    public static final int INT=24;
    public static final int STRING=25;
    public static final int WS=26;
    public static final int ESC_SEQ=27;
    public static final int HEX_DIGIT=28;
    public static final int OCTAL_ESC=29;
    public static final int UNICODE_ESC=30;

    // delegates
    // delegators


        public Portugolv3Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public Portugolv3Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return Portugolv3Parser.tokenNames; }
    public String getGrammarFileName() { return "/Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g"; }


    //Tabela de simbolos
    public HashMap<String,Simbolo> tabelaSimbolos = new HashMap<String,Simbolo>();



    public static class prog_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:58:1: prog : ( COMMENT )* 'PROGRAMA' nomePrograma= ID ';' ( declVars )* ( declFuncoes )* ( comandos )* 'FIM' '.' -> ^( $nomePrograma ^( 'VARIAVEIS' ( declVars )* ) ^( 'FUNCOES' ( declFuncoes )* ) ^( 'COMANDOS' ( comandos )* ) ) ;
    public final Portugolv3Parser.prog_return prog() throws RecognitionException {
        Portugolv3Parser.prog_return retval = new Portugolv3Parser.prog_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token nomePrograma=null;
        Token COMMENT1=null;
        Token string_literal2=null;
        Token char_literal3=null;
        Token string_literal7=null;
        Token char_literal8=null;
        Portugolv3Parser.declVars_return declVars4 = null;

        Portugolv3Parser.declFuncoes_return declFuncoes5 = null;

        Portugolv3Parser.comandos_return comandos6 = null;


        CommonTree nomePrograma_tree=null;
        CommonTree COMMENT1_tree=null;
        CommonTree string_literal2_tree=null;
        CommonTree char_literal3_tree=null;
        CommonTree string_literal7_tree=null;
        CommonTree char_literal8_tree=null;
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_COMMENT=new RewriteRuleTokenStream(adaptor,"token COMMENT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_FIM=new RewriteRuleTokenStream(adaptor,"token FIM");
        RewriteRuleSubtreeStream stream_comandos=new RewriteRuleSubtreeStream(adaptor,"rule comandos");
        RewriteRuleSubtreeStream stream_declFuncoes=new RewriteRuleSubtreeStream(adaptor,"rule declFuncoes");
        RewriteRuleSubtreeStream stream_declVars=new RewriteRuleSubtreeStream(adaptor,"rule declVars");
        try {
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:58:6: ( ( COMMENT )* 'PROGRAMA' nomePrograma= ID ';' ( declVars )* ( declFuncoes )* ( comandos )* 'FIM' '.' -> ^( $nomePrograma ^( 'VARIAVEIS' ( declVars )* ) ^( 'FUNCOES' ( declFuncoes )* ) ^( 'COMANDOS' ( comandos )* ) ) )
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:58:8: ( COMMENT )* 'PROGRAMA' nomePrograma= ID ';' ( declVars )* ( declFuncoes )* ( comandos )* 'FIM' '.'
            {
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:58:8: ( COMMENT )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==COMMENT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:58:8: COMMENT
            	    {
            	    COMMENT1=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_prog153);  
            	    stream_COMMENT.add(COMMENT1);


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            string_literal2=(Token)match(input,31,FOLLOW_31_in_prog156);  
            stream_31.add(string_literal2);

            nomePrograma=(Token)match(input,ID,FOLLOW_ID_in_prog160);  
            stream_ID.add(nomePrograma);

            char_literal3=(Token)match(input,32,FOLLOW_32_in_prog162);  
            stream_32.add(char_literal3);

            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:58:48: ( declVars )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=34 && LA2_0<=37)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:58:48: declVars
            	    {
            	    pushFollow(FOLLOW_declVars_in_prog164);
            	    declVars4=declVars();

            	    state._fsp--;

            	    stream_declVars.add(declVars4.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:58:58: ( declFuncoes )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==39) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:58:58: declFuncoes
            	    {
            	    pushFollow(FOLLOW_declFuncoes_in_prog167);
            	    declFuncoes5=declFuncoes();

            	    state._fsp--;

            	    stream_declFuncoes.add(declFuncoes5.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:58:71: ( comandos )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==SE||LA4_0==LEIA||(LA4_0>=IMPRIMA && LA4_0<=ENQUANTO)||LA4_0==PARA||LA4_0==ID||LA4_0==43) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:58:71: comandos
            	    {
            	    pushFollow(FOLLOW_comandos_in_prog170);
            	    comandos6=comandos();

            	    state._fsp--;

            	    stream_comandos.add(comandos6.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            string_literal7=(Token)match(input,FIM,FOLLOW_FIM_in_prog173);  
            stream_FIM.add(string_literal7);

            char_literal8=(Token)match(input,33,FOLLOW_33_in_prog175);  
            stream_33.add(char_literal8);



            // AST REWRITE
            // elements: comandos, COMANDOS, VARIAVEIS, nomePrograma, declVars, declFuncoes, FUNCOES
            // token labels: nomePrograma
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_nomePrograma=new RewriteRuleTokenStream(adaptor,"token nomePrograma",nomePrograma);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 58:91: -> ^( $nomePrograma ^( 'VARIAVEIS' ( declVars )* ) ^( 'FUNCOES' ( declFuncoes )* ) ^( 'COMANDOS' ( comandos )* ) )
            {
                // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:58:94: ^( $nomePrograma ^( 'VARIAVEIS' ( declVars )* ) ^( 'FUNCOES' ( declFuncoes )* ) ^( 'COMANDOS' ( comandos )* ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_nomePrograma.nextNode(), root_1);

                // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:58:110: ^( 'VARIAVEIS' ( declVars )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARIAVEIS, "VARIAVEIS"), root_2);

                // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:58:124: ( declVars )*
                while ( stream_declVars.hasNext() ) {
                    adaptor.addChild(root_2, stream_declVars.nextTree());

                }
                stream_declVars.reset();

                adaptor.addChild(root_1, root_2);
                }
                // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:58:135: ^( 'FUNCOES' ( declFuncoes )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCOES, "FUNCOES"), root_2);

                // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:58:147: ( declFuncoes )*
                while ( stream_declFuncoes.hasNext() ) {
                    adaptor.addChild(root_2, stream_declFuncoes.nextTree());

                }
                stream_declFuncoes.reset();

                adaptor.addChild(root_1, root_2);
                }
                // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:58:161: ^( 'COMANDOS' ( comandos )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMANDOS, "COMANDOS"), root_2);

                // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:58:174: ( comandos )*
                while ( stream_comandos.hasNext() ) {
                    adaptor.addChild(root_2, stream_comandos.nextTree());

                }
                stream_comandos.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "prog"

    public static class declVars_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declVars"
    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:61:1: declVars : a= tipo listaIDs= listaIds ';' -> ^( tipo listaIds ) ;
    public final Portugolv3Parser.declVars_return declVars() throws RecognitionException {
        Portugolv3Parser.declVars_return retval = new Portugolv3Parser.declVars_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal9=null;
        Portugolv3Parser.tipo_return a = null;

        Portugolv3Parser.listaIds_return listaIDs = null;


        CommonTree char_literal9_tree=null;
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleSubtreeStream stream_listaIds=new RewriteRuleSubtreeStream(adaptor,"rule listaIds");
        RewriteRuleSubtreeStream stream_tipo=new RewriteRuleSubtreeStream(adaptor,"rule tipo");
        try {
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:76:2: (a= tipo listaIDs= listaIds ';' -> ^( tipo listaIds ) )
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:76:4: a= tipo listaIDs= listaIds ';'
            {
            pushFollow(FOLLOW_tipo_in_declVars225);
            a=tipo();

            state._fsp--;

            stream_tipo.add(a.getTree());
            pushFollow(FOLLOW_listaIds_in_declVars229);
            listaIDs=listaIds();

            state._fsp--;

            stream_listaIds.add(listaIDs.getTree());
            char_literal9=(Token)match(input,32,FOLLOW_32_in_declVars230);  
            stream_32.add(char_literal9);



            // AST REWRITE
            // elements: listaIds, tipo
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 76:32: -> ^( tipo listaIds )
            {
                // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:76:35: ^( tipo listaIds )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_tipo.nextNode(), root_1);

                adaptor.addChild(root_1, stream_listaIds.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);


            	//System.out.println((a!=null?input.toString(a.start,a.stop):null));
            	StringTokenizer st = new StringTokenizer((listaIDs!=null?input.toString(listaIDs.start,listaIDs.stop):null));
            	while(st.hasMoreElements()) {
            		//Simbolo(tipo, nome);
            		String nome = st.nextToken(",");
            		Simbolo simbolo = new Simbolo((a!=null?a.numeroTipo:0), nome);
            		tabelaSimbolos.put(nome, simbolo);
            		System.out.println("Adicionando a tabela de simbolos: "+(a!=null?input.toString(a.start,a.stop):null)+" - "+nome);
            		
            	
            	}

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declVars"

    public static class tipo_return extends ParserRuleReturnScope {
        public int numeroTipo;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tipo"
    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:80:1: tipo returns [int numeroTipo] : ( 'INTEIRO' | 'STRING' | 'BOOLEANO' | 'VOID' );
    public final Portugolv3Parser.tipo_return tipo() throws RecognitionException {
        Portugolv3Parser.tipo_return retval = new Portugolv3Parser.tipo_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal10=null;
        Token string_literal11=null;
        Token string_literal12=null;
        Token string_literal13=null;

        CommonTree string_literal10_tree=null;
        CommonTree string_literal11_tree=null;
        CommonTree string_literal12_tree=null;
        CommonTree string_literal13_tree=null;

        try {
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:81:2: ( 'INTEIRO' | 'STRING' | 'BOOLEANO' | 'VOID' )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt5=1;
                }
                break;
            case 35:
                {
                alt5=2;
                }
                break;
            case 36:
                {
                alt5=3;
                }
                break;
            case 37:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:81:3: 'INTEIRO'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal10=(Token)match(input,34,FOLLOW_34_in_tipo253); 
                    string_literal10_tree = (CommonTree)adaptor.create(string_literal10);
                    adaptor.addChild(root_0, string_literal10_tree);

                    retval.numeroTipo = 0;

                    }
                    break;
                case 2 :
                    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:82:3: 'STRING'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal11=(Token)match(input,35,FOLLOW_35_in_tipo260); 
                    string_literal11_tree = (CommonTree)adaptor.create(string_literal11);
                    adaptor.addChild(root_0, string_literal11_tree);

                    retval.numeroTipo = 1;

                    }
                    break;
                case 3 :
                    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:83:3: 'BOOLEANO'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal12=(Token)match(input,36,FOLLOW_36_in_tipo267); 
                    string_literal12_tree = (CommonTree)adaptor.create(string_literal12);
                    adaptor.addChild(root_0, string_literal12_tree);

                    retval.numeroTipo = 2;

                    }
                    break;
                case 4 :
                    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:84:3: 'VOID'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal13=(Token)match(input,37,FOLLOW_37_in_tipo273); 
                    string_literal13_tree = (CommonTree)adaptor.create(string_literal13);
                    adaptor.addChild(root_0, string_literal13_tree);

                    retval.numeroTipo = 3;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "tipo"

    public static class listaIds_return extends ParserRuleReturnScope {
        public List<String> lista;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "listaIds"
    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:88:1: listaIds returns [List<String> lista] : (ids+= ID ) ( ',' ids+= ID )* -> ( ID )+ ;
    public final Portugolv3Parser.listaIds_return listaIds() throws RecognitionException {
        Portugolv3Parser.listaIds_return retval = new Portugolv3Parser.listaIds_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal14=null;
        Token ids=null;
        List list_ids=null;

        CommonTree char_literal14_tree=null;
        CommonTree ids_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");

        try {
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:89:2: ( (ids+= ID ) ( ',' ids+= ID )* -> ( ID )+ )
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:89:3: (ids+= ID ) ( ',' ids+= ID )*
            {
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:89:3: (ids+= ID )
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:89:4: ids+= ID
            {
            ids=(Token)match(input,ID,FOLLOW_ID_in_listaIds303);  
            stream_ID.add(ids);

            if (list_ids==null) list_ids=new ArrayList();
            list_ids.add(ids);


            }

            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:89:13: ( ',' ids+= ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==38) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:89:14: ',' ids+= ID
            	    {
            	    char_literal14=(Token)match(input,38,FOLLOW_38_in_listaIds307);  
            	    stream_38.add(char_literal14);

            	    ids=(Token)match(input,ID,FOLLOW_ID_in_listaIds311);  
            	    stream_ID.add(ids);

            	    if (list_ids==null) list_ids=new ArrayList();
            	    list_ids.add(ids);


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            retval.lista = list_ids;


            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 89:45: -> ( ID )+
            {
                if ( !(stream_ID.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_0, stream_ID.nextNode());

                }
                stream_ID.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "listaIds"

    public static class declFuncoes_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declFuncoes"
    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:93:1: declFuncoes : 'FUNCAO' nomeFuncao= ID '(' ( ( listaParametros )* ) ')' ':' tipo ';' corpoFuncao 'FIM' ';' -> ^( $nomeFuncao ^( 'LISTAPARAMETROS' ( listaParametros )* ) ^( 'TIPORETORNO' tipo ) ^( 'CORPOFUNCAO' corpoFuncao ) ) ;
    public final Portugolv3Parser.declFuncoes_return declFuncoes() throws RecognitionException {
        Portugolv3Parser.declFuncoes_return retval = new Portugolv3Parser.declFuncoes_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token nomeFuncao=null;
        Token string_literal15=null;
        Token char_literal16=null;
        Token char_literal18=null;
        Token char_literal19=null;
        Token char_literal21=null;
        Token string_literal23=null;
        Token char_literal24=null;
        Portugolv3Parser.listaParametros_return listaParametros17 = null;

        Portugolv3Parser.tipo_return tipo20 = null;

        Portugolv3Parser.corpoFuncao_return corpoFuncao22 = null;


        CommonTree nomeFuncao_tree=null;
        CommonTree string_literal15_tree=null;
        CommonTree char_literal16_tree=null;
        CommonTree char_literal18_tree=null;
        CommonTree char_literal19_tree=null;
        CommonTree char_literal21_tree=null;
        CommonTree string_literal23_tree=null;
        CommonTree char_literal24_tree=null;
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_FIM=new RewriteRuleTokenStream(adaptor,"token FIM");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleSubtreeStream stream_listaParametros=new RewriteRuleSubtreeStream(adaptor,"rule listaParametros");
        RewriteRuleSubtreeStream stream_tipo=new RewriteRuleSubtreeStream(adaptor,"rule tipo");
        RewriteRuleSubtreeStream stream_corpoFuncao=new RewriteRuleSubtreeStream(adaptor,"rule corpoFuncao");
        try {
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:94:2: ( 'FUNCAO' nomeFuncao= ID '(' ( ( listaParametros )* ) ')' ':' tipo ';' corpoFuncao 'FIM' ';' -> ^( $nomeFuncao ^( 'LISTAPARAMETROS' ( listaParametros )* ) ^( 'TIPORETORNO' tipo ) ^( 'CORPOFUNCAO' corpoFuncao ) ) )
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:94:3: 'FUNCAO' nomeFuncao= ID '(' ( ( listaParametros )* ) ')' ':' tipo ';' corpoFuncao 'FIM' ';'
            {
            string_literal15=(Token)match(input,39,FOLLOW_39_in_declFuncoes332);  
            stream_39.add(string_literal15);

            nomeFuncao=(Token)match(input,ID,FOLLOW_ID_in_declFuncoes336);  
            stream_ID.add(nomeFuncao);

            char_literal16=(Token)match(input,40,FOLLOW_40_in_declFuncoes338);  
            stream_40.add(char_literal16);

            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:94:29: ( ( listaParametros )* )
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:94:30: ( listaParametros )*
            {
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:94:30: ( listaParametros )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:94:30: listaParametros
            	    {
            	    pushFollow(FOLLOW_listaParametros_in_declFuncoes340);
            	    listaParametros17=listaParametros();

            	    state._fsp--;

            	    stream_listaParametros.add(listaParametros17.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            char_literal18=(Token)match(input,41,FOLLOW_41_in_declFuncoes343);  
            stream_41.add(char_literal18);

            char_literal19=(Token)match(input,42,FOLLOW_42_in_declFuncoes344);  
            stream_42.add(char_literal19);

            pushFollow(FOLLOW_tipo_in_declFuncoes346);
            tipo20=tipo();

            state._fsp--;

            stream_tipo.add(tipo20.getTree());
            char_literal21=(Token)match(input,32,FOLLOW_32_in_declFuncoes348);  
            stream_32.add(char_literal21);

            pushFollow(FOLLOW_corpoFuncao_in_declFuncoes350);
            corpoFuncao22=corpoFuncao();

            state._fsp--;

            stream_corpoFuncao.add(corpoFuncao22.getTree());
            string_literal23=(Token)match(input,FIM,FOLLOW_FIM_in_declFuncoes352);  
            stream_FIM.add(string_literal23);

            char_literal24=(Token)match(input,32,FOLLOW_32_in_declFuncoes354);  
            stream_32.add(char_literal24);



            // AST REWRITE
            // elements: corpoFuncao, nomeFuncao, LISTAPARAMETROS, listaParametros, CORPOFUNCAO, tipo, TIPORETORNO
            // token labels: nomeFuncao
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_nomeFuncao=new RewriteRuleTokenStream(adaptor,"token nomeFuncao",nomeFuncao);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 94:85: -> ^( $nomeFuncao ^( 'LISTAPARAMETROS' ( listaParametros )* ) ^( 'TIPORETORNO' tipo ) ^( 'CORPOFUNCAO' corpoFuncao ) )
            {
                // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:94:88: ^( $nomeFuncao ^( 'LISTAPARAMETROS' ( listaParametros )* ) ^( 'TIPORETORNO' tipo ) ^( 'CORPOFUNCAO' corpoFuncao ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_nomeFuncao.nextNode(), root_1);

                // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:94:102: ^( 'LISTAPARAMETROS' ( listaParametros )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LISTAPARAMETROS, "LISTAPARAMETROS"), root_2);

                // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:94:122: ( listaParametros )*
                while ( stream_listaParametros.hasNext() ) {
                    adaptor.addChild(root_2, stream_listaParametros.nextTree());

                }
                stream_listaParametros.reset();

                adaptor.addChild(root_1, root_2);
                }
                // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:94:140: ^( 'TIPORETORNO' tipo )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TIPORETORNO, "TIPORETORNO"), root_2);

                adaptor.addChild(root_2, stream_tipo.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:94:162: ^( 'CORPOFUNCAO' corpoFuncao )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CORPOFUNCAO, "CORPOFUNCAO"), root_2);

                adaptor.addChild(root_2, stream_corpoFuncao.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declFuncoes"

    public static class corpoFuncao_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "corpoFuncao"
    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:98:1: corpoFuncao : ( declVars )* ( comandos )* -> ^( 'VARIAVEIS' ( declVars )* ) ^( 'COMANDOS' ( comandos )* ) ;
    public final Portugolv3Parser.corpoFuncao_return corpoFuncao() throws RecognitionException {
        Portugolv3Parser.corpoFuncao_return retval = new Portugolv3Parser.corpoFuncao_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Portugolv3Parser.declVars_return declVars25 = null;

        Portugolv3Parser.comandos_return comandos26 = null;


        RewriteRuleSubtreeStream stream_comandos=new RewriteRuleSubtreeStream(adaptor,"rule comandos");
        RewriteRuleSubtreeStream stream_declVars=new RewriteRuleSubtreeStream(adaptor,"rule declVars");
        try {
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:99:2: ( ( declVars )* ( comandos )* -> ^( 'VARIAVEIS' ( declVars )* ) ^( 'COMANDOS' ( comandos )* ) )
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:99:4: ( declVars )* ( comandos )*
            {
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:99:4: ( declVars )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=34 && LA8_0<=37)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:99:4: declVars
            	    {
            	    pushFollow(FOLLOW_declVars_in_corpoFuncao394);
            	    declVars25=declVars();

            	    state._fsp--;

            	    stream_declVars.add(declVars25.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:99:14: ( comandos )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==SE||LA9_0==LEIA||(LA9_0>=IMPRIMA && LA9_0<=ENQUANTO)||LA9_0==PARA||LA9_0==ID||LA9_0==43) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:99:14: comandos
            	    {
            	    pushFollow(FOLLOW_comandos_in_corpoFuncao397);
            	    comandos26=comandos();

            	    state._fsp--;

            	    stream_comandos.add(comandos26.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);



            // AST REWRITE
            // elements: comandos, COMANDOS, VARIAVEIS, declVars
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 99:24: -> ^( 'VARIAVEIS' ( declVars )* ) ^( 'COMANDOS' ( comandos )* )
            {
                // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:99:27: ^( 'VARIAVEIS' ( declVars )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARIAVEIS, "VARIAVEIS"), root_1);

                // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:99:41: ( declVars )*
                while ( stream_declVars.hasNext() ) {
                    adaptor.addChild(root_1, stream_declVars.nextTree());

                }
                stream_declVars.reset();

                adaptor.addChild(root_0, root_1);
                }
                // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:99:52: ^( 'COMANDOS' ( comandos )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMANDOS, "COMANDOS"), root_1);

                // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:99:65: ( comandos )*
                while ( stream_comandos.hasNext() ) {
                    adaptor.addChild(root_1, stream_comandos.nextTree());

                }
                stream_comandos.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "corpoFuncao"

    public static class listaParametros_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "listaParametros"
    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:103:1: listaParametros : ( ID ':' tipo ) ( ',' ID ':' tipo )* -> ( ^( tipo ID ) )* ;
    public final Portugolv3Parser.listaParametros_return listaParametros() throws RecognitionException {
        Portugolv3Parser.listaParametros_return retval = new Portugolv3Parser.listaParametros_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID27=null;
        Token char_literal28=null;
        Token char_literal30=null;
        Token ID31=null;
        Token char_literal32=null;
        Portugolv3Parser.tipo_return tipo29 = null;

        Portugolv3Parser.tipo_return tipo33 = null;


        CommonTree ID27_tree=null;
        CommonTree char_literal28_tree=null;
        CommonTree char_literal30_tree=null;
        CommonTree ID31_tree=null;
        CommonTree char_literal32_tree=null;
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_tipo=new RewriteRuleSubtreeStream(adaptor,"rule tipo");
        try {
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:104:2: ( ( ID ':' tipo ) ( ',' ID ':' tipo )* -> ( ^( tipo ID ) )* )
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:104:3: ( ID ':' tipo ) ( ',' ID ':' tipo )*
            {
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:104:3: ( ID ':' tipo )
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:104:4: ID ':' tipo
            {
            ID27=(Token)match(input,ID,FOLLOW_ID_in_listaParametros427);  
            stream_ID.add(ID27);

            char_literal28=(Token)match(input,42,FOLLOW_42_in_listaParametros429);  
            stream_42.add(char_literal28);

            pushFollow(FOLLOW_tipo_in_listaParametros431);
            tipo29=tipo();

            state._fsp--;

            stream_tipo.add(tipo29.getTree());

            }

            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:104:17: ( ',' ID ':' tipo )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==38) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:104:18: ',' ID ':' tipo
            	    {
            	    char_literal30=(Token)match(input,38,FOLLOW_38_in_listaParametros435);  
            	    stream_38.add(char_literal30);

            	    ID31=(Token)match(input,ID,FOLLOW_ID_in_listaParametros437);  
            	    stream_ID.add(ID31);

            	    char_literal32=(Token)match(input,42,FOLLOW_42_in_listaParametros439);  
            	    stream_42.add(char_literal32);

            	    pushFollow(FOLLOW_tipo_in_listaParametros441);
            	    tipo33=tipo();

            	    state._fsp--;

            	    stream_tipo.add(tipo33.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);



            // AST REWRITE
            // elements: ID, tipo
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 104:36: -> ( ^( tipo ID ) )*
            {
                // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:104:39: ( ^( tipo ID ) )*
                while ( stream_ID.hasNext()||stream_tipo.hasNext() ) {
                    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:104:39: ^( tipo ID )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot(stream_tipo.nextNode(), root_1);

                    adaptor.addChild(root_1, stream_ID.nextNode());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_ID.reset();
                stream_tipo.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "listaParametros"

    public static class comandos_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comandos"
    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:108:1: comandos : ( comando_se_senao -> comando_se_senao | comando_para -> comando_para | comando_imprimir -> comando_imprimir | comando_ler -> comando_ler | comando_enquanto -> comando_enquanto | 'SAIR' ';' -> 'SAIR' | chamadaFuncao ';' -> chamadaFuncao | comando_atribuicao -> comando_atribuicao );
    public final Portugolv3Parser.comandos_return comandos() throws RecognitionException {
        Portugolv3Parser.comandos_return retval = new Portugolv3Parser.comandos_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal39=null;
        Token char_literal40=null;
        Token char_literal42=null;
        Portugolv3Parser.comando_se_senao_return comando_se_senao34 = null;

        Portugolv3Parser.comando_para_return comando_para35 = null;

        Portugolv3Parser.comando_imprimir_return comando_imprimir36 = null;

        Portugolv3Parser.comando_ler_return comando_ler37 = null;

        Portugolv3Parser.comando_enquanto_return comando_enquanto38 = null;

        Portugolv3Parser.chamadaFuncao_return chamadaFuncao41 = null;

        Portugolv3Parser.comando_atribuicao_return comando_atribuicao43 = null;


        CommonTree string_literal39_tree=null;
        CommonTree char_literal40_tree=null;
        CommonTree char_literal42_tree=null;
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleSubtreeStream stream_comando_atribuicao=new RewriteRuleSubtreeStream(adaptor,"rule comando_atribuicao");
        RewriteRuleSubtreeStream stream_comando_enquanto=new RewriteRuleSubtreeStream(adaptor,"rule comando_enquanto");
        RewriteRuleSubtreeStream stream_comando_para=new RewriteRuleSubtreeStream(adaptor,"rule comando_para");
        RewriteRuleSubtreeStream stream_comando_se_senao=new RewriteRuleSubtreeStream(adaptor,"rule comando_se_senao");
        RewriteRuleSubtreeStream stream_comando_ler=new RewriteRuleSubtreeStream(adaptor,"rule comando_ler");
        RewriteRuleSubtreeStream stream_chamadaFuncao=new RewriteRuleSubtreeStream(adaptor,"rule chamadaFuncao");
        RewriteRuleSubtreeStream stream_comando_imprimir=new RewriteRuleSubtreeStream(adaptor,"rule comando_imprimir");
        try {
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:108:9: ( comando_se_senao -> comando_se_senao | comando_para -> comando_para | comando_imprimir -> comando_imprimir | comando_ler -> comando_ler | comando_enquanto -> comando_enquanto | 'SAIR' ';' -> 'SAIR' | chamadaFuncao ';' -> chamadaFuncao | comando_atribuicao -> comando_atribuicao )
            int alt11=8;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:109:2: comando_se_senao
                    {
                    pushFollow(FOLLOW_comando_se_senao_in_comandos466);
                    comando_se_senao34=comando_se_senao();

                    state._fsp--;

                    stream_comando_se_senao.add(comando_se_senao34.getTree());


                    // AST REWRITE
                    // elements: comando_se_senao
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 109:19: -> comando_se_senao
                    {
                        adaptor.addChild(root_0, stream_comando_se_senao.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:111:3: comando_para
                    {
                    pushFollow(FOLLOW_comando_para_in_comandos476);
                    comando_para35=comando_para();

                    state._fsp--;

                    stream_comando_para.add(comando_para35.getTree());


                    // AST REWRITE
                    // elements: comando_para
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 111:16: -> comando_para
                    {
                        adaptor.addChild(root_0, stream_comando_para.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:112:3: comando_imprimir
                    {
                    pushFollow(FOLLOW_comando_imprimir_in_comandos484);
                    comando_imprimir36=comando_imprimir();

                    state._fsp--;

                    stream_comando_imprimir.add(comando_imprimir36.getTree());


                    // AST REWRITE
                    // elements: comando_imprimir
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 112:20: -> comando_imprimir
                    {
                        adaptor.addChild(root_0, stream_comando_imprimir.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:113:3: comando_ler
                    {
                    pushFollow(FOLLOW_comando_ler_in_comandos492);
                    comando_ler37=comando_ler();

                    state._fsp--;

                    stream_comando_ler.add(comando_ler37.getTree());


                    // AST REWRITE
                    // elements: comando_ler
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 113:15: -> comando_ler
                    {
                        adaptor.addChild(root_0, stream_comando_ler.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:114:3: comando_enquanto
                    {
                    pushFollow(FOLLOW_comando_enquanto_in_comandos500);
                    comando_enquanto38=comando_enquanto();

                    state._fsp--;

                    stream_comando_enquanto.add(comando_enquanto38.getTree());


                    // AST REWRITE
                    // elements: comando_enquanto
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 114:20: -> comando_enquanto
                    {
                        adaptor.addChild(root_0, stream_comando_enquanto.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:115:3: 'SAIR' ';'
                    {
                    string_literal39=(Token)match(input,43,FOLLOW_43_in_comandos508);  
                    stream_43.add(string_literal39);

                    char_literal40=(Token)match(input,32,FOLLOW_32_in_comandos510);  
                    stream_32.add(char_literal40);



                    // AST REWRITE
                    // elements: 43
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 115:14: -> 'SAIR'
                    {
                        adaptor.addChild(root_0, stream_43.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:116:4: chamadaFuncao ';'
                    {
                    pushFollow(FOLLOW_chamadaFuncao_in_comandos520);
                    chamadaFuncao41=chamadaFuncao();

                    state._fsp--;

                    stream_chamadaFuncao.add(chamadaFuncao41.getTree());
                    char_literal42=(Token)match(input,32,FOLLOW_32_in_comandos522);  
                    stream_32.add(char_literal42);



                    // AST REWRITE
                    // elements: chamadaFuncao
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 116:22: -> chamadaFuncao
                    {
                        adaptor.addChild(root_0, stream_chamadaFuncao.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:117:4: comando_atribuicao
                    {
                    pushFollow(FOLLOW_comando_atribuicao_in_comandos531);
                    comando_atribuicao43=comando_atribuicao();

                    state._fsp--;

                    stream_comando_atribuicao.add(comando_atribuicao43.getTree());


                    // AST REWRITE
                    // elements: comando_atribuicao
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 117:23: -> comando_atribuicao
                    {
                        adaptor.addChild(root_0, stream_comando_atribuicao.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "comandos"

    public static class comando_enquanto_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comando_enquanto"
    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:121:1: comando_enquanto : 'ENQUANTO' '(' exprBooleana ')' ( comandos )* 'FIM' ';' -> ^( ENQUANTO exprBooleana ( comandos )* ) ;
    public final Portugolv3Parser.comando_enquanto_return comando_enquanto() throws RecognitionException {
        Portugolv3Parser.comando_enquanto_return retval = new Portugolv3Parser.comando_enquanto_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal44=null;
        Token char_literal45=null;
        Token char_literal47=null;
        Token string_literal49=null;
        Token char_literal50=null;
        Portugolv3Parser.exprBooleana_return exprBooleana46 = null;

        Portugolv3Parser.comandos_return comandos48 = null;


        CommonTree string_literal44_tree=null;
        CommonTree char_literal45_tree=null;
        CommonTree char_literal47_tree=null;
        CommonTree string_literal49_tree=null;
        CommonTree char_literal50_tree=null;
        RewriteRuleTokenStream stream_ENQUANTO=new RewriteRuleTokenStream(adaptor,"token ENQUANTO");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_FIM=new RewriteRuleTokenStream(adaptor,"token FIM");
        RewriteRuleSubtreeStream stream_comandos=new RewriteRuleSubtreeStream(adaptor,"rule comandos");
        RewriteRuleSubtreeStream stream_exprBooleana=new RewriteRuleSubtreeStream(adaptor,"rule exprBooleana");
        try {
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:122:2: ( 'ENQUANTO' '(' exprBooleana ')' ( comandos )* 'FIM' ';' -> ^( ENQUANTO exprBooleana ( comandos )* ) )
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:122:3: 'ENQUANTO' '(' exprBooleana ')' ( comandos )* 'FIM' ';'
            {
            string_literal44=(Token)match(input,ENQUANTO,FOLLOW_ENQUANTO_in_comando_enquanto547);  
            stream_ENQUANTO.add(string_literal44);

            char_literal45=(Token)match(input,40,FOLLOW_40_in_comando_enquanto549);  
            stream_40.add(char_literal45);

            pushFollow(FOLLOW_exprBooleana_in_comando_enquanto551);
            exprBooleana46=exprBooleana();

            state._fsp--;

            stream_exprBooleana.add(exprBooleana46.getTree());
            char_literal47=(Token)match(input,41,FOLLOW_41_in_comando_enquanto553);  
            stream_41.add(char_literal47);

            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:122:35: ( comandos )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==SE||LA12_0==LEIA||(LA12_0>=IMPRIMA && LA12_0<=ENQUANTO)||LA12_0==PARA||LA12_0==ID||LA12_0==43) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:122:35: comandos
            	    {
            	    pushFollow(FOLLOW_comandos_in_comando_enquanto555);
            	    comandos48=comandos();

            	    state._fsp--;

            	    stream_comandos.add(comandos48.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            string_literal49=(Token)match(input,FIM,FOLLOW_FIM_in_comando_enquanto558);  
            stream_FIM.add(string_literal49);

            char_literal50=(Token)match(input,32,FOLLOW_32_in_comando_enquanto560);  
            stream_32.add(char_literal50);



            // AST REWRITE
            // elements: exprBooleana, comandos
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 122:55: -> ^( ENQUANTO exprBooleana ( comandos )* )
            {
                // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:122:58: ^( ENQUANTO exprBooleana ( comandos )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ENQUANTO, "ENQUANTO"), root_1);

                adaptor.addChild(root_1, stream_exprBooleana.nextTree());
                // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:122:82: ( comandos )*
                while ( stream_comandos.hasNext() ) {
                    adaptor.addChild(root_1, stream_comandos.nextTree());

                }
                stream_comandos.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "comando_enquanto"

    public static class comando_para_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comando_para"
    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:126:1: comando_para : 'PARA' '(' ID '=' expr 'ATE' comparacao ( 'PASSO' expr )? ')' ( comandos )* 'FIM' ';' -> ^( PARA ^( 'ATRIBUICAO' ID expr ) ^( 'CONDICAO' comparacao ) ( ^( 'PASSO' expr ) )? ^( 'COMANDOS' ( comandos )* ) ) ;
    public final Portugolv3Parser.comando_para_return comando_para() throws RecognitionException {
        Portugolv3Parser.comando_para_return retval = new Portugolv3Parser.comando_para_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal51=null;
        Token char_literal52=null;
        Token ID53=null;
        Token char_literal54=null;
        Token string_literal56=null;
        Token string_literal58=null;
        Token char_literal60=null;
        Token string_literal62=null;
        Token char_literal63=null;
        Portugolv3Parser.expr_return expr55 = null;

        Portugolv3Parser.comparacao_return comparacao57 = null;

        Portugolv3Parser.expr_return expr59 = null;

        Portugolv3Parser.comandos_return comandos61 = null;


        CommonTree string_literal51_tree=null;
        CommonTree char_literal52_tree=null;
        CommonTree ID53_tree=null;
        CommonTree char_literal54_tree=null;
        CommonTree string_literal56_tree=null;
        CommonTree string_literal58_tree=null;
        CommonTree char_literal60_tree=null;
        CommonTree string_literal62_tree=null;
        CommonTree char_literal63_tree=null;
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_FIM=new RewriteRuleTokenStream(adaptor,"token FIM");
        RewriteRuleTokenStream stream_PARA=new RewriteRuleTokenStream(adaptor,"token PARA");
        RewriteRuleTokenStream stream_PASSO=new RewriteRuleTokenStream(adaptor,"token PASSO");
        RewriteRuleSubtreeStream stream_comandos=new RewriteRuleSubtreeStream(adaptor,"rule comandos");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_comparacao=new RewriteRuleSubtreeStream(adaptor,"rule comparacao");
        try {
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:127:2: ( 'PARA' '(' ID '=' expr 'ATE' comparacao ( 'PASSO' expr )? ')' ( comandos )* 'FIM' ';' -> ^( PARA ^( 'ATRIBUICAO' ID expr ) ^( 'CONDICAO' comparacao ) ( ^( 'PASSO' expr ) )? ^( 'COMANDOS' ( comandos )* ) ) )
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:127:3: 'PARA' '(' ID '=' expr 'ATE' comparacao ( 'PASSO' expr )? ')' ( comandos )* 'FIM' ';'
            {
            string_literal51=(Token)match(input,PARA,FOLLOW_PARA_in_comando_para583);  
            stream_PARA.add(string_literal51);

            char_literal52=(Token)match(input,40,FOLLOW_40_in_comando_para585);  
            stream_40.add(char_literal52);

            ID53=(Token)match(input,ID,FOLLOW_ID_in_comando_para587);  
            stream_ID.add(ID53);

            char_literal54=(Token)match(input,44,FOLLOW_44_in_comando_para589);  
            stream_44.add(char_literal54);

            pushFollow(FOLLOW_expr_in_comando_para591);
            expr55=expr();

            state._fsp--;

            stream_expr.add(expr55.getTree());
            string_literal56=(Token)match(input,45,FOLLOW_45_in_comando_para593);  
            stream_45.add(string_literal56);

            pushFollow(FOLLOW_comparacao_in_comando_para595);
            comparacao57=comparacao();

            state._fsp--;

            stream_comparacao.add(comparacao57.getTree());
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:127:44: ( 'PASSO' expr )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==PASSO) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:127:45: 'PASSO' expr
                    {
                    string_literal58=(Token)match(input,PASSO,FOLLOW_PASSO_in_comando_para599);  
                    stream_PASSO.add(string_literal58);

                    pushFollow(FOLLOW_expr_in_comando_para601);
                    expr59=expr();

                    state._fsp--;

                    stream_expr.add(expr59.getTree());

                    }
                    break;

            }

            char_literal60=(Token)match(input,41,FOLLOW_41_in_comando_para605);  
            stream_41.add(char_literal60);

            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:127:64: ( comandos )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==SE||LA14_0==LEIA||(LA14_0>=IMPRIMA && LA14_0<=ENQUANTO)||LA14_0==PARA||LA14_0==ID||LA14_0==43) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:127:64: comandos
            	    {
            	    pushFollow(FOLLOW_comandos_in_comando_para607);
            	    comandos61=comandos();

            	    state._fsp--;

            	    stream_comandos.add(comandos61.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            string_literal62=(Token)match(input,FIM,FOLLOW_FIM_in_comando_para611);  
            stream_FIM.add(string_literal62);

            char_literal63=(Token)match(input,32,FOLLOW_32_in_comando_para613);  
            stream_32.add(char_literal63);



            // AST REWRITE
            // elements: expr, comandos, comparacao, ID, ATRIBUICAO, COMANDOS, CONDICAO, expr, PASSO
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 127:85: -> ^( PARA ^( 'ATRIBUICAO' ID expr ) ^( 'CONDICAO' comparacao ) ( ^( 'PASSO' expr ) )? ^( 'COMANDOS' ( comandos )* ) )
            {
                // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:127:88: ^( PARA ^( 'ATRIBUICAO' ID expr ) ^( 'CONDICAO' comparacao ) ( ^( 'PASSO' expr ) )? ^( 'COMANDOS' ( comandos )* ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARA, "PARA"), root_1);

                // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:127:95: ^( 'ATRIBUICAO' ID expr )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ATRIBUICAO, "ATRIBUICAO"), root_2);

                adaptor.addChild(root_2, stream_ID.nextNode());
                adaptor.addChild(root_2, stream_expr.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:127:119: ^( 'CONDICAO' comparacao )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDICAO, "CONDICAO"), root_2);

                adaptor.addChild(root_2, stream_comparacao.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:127:144: ( ^( 'PASSO' expr ) )?
                if ( stream_expr.hasNext()||stream_PASSO.hasNext() ) {
                    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:127:144: ^( 'PASSO' expr )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot(stream_PASSO.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_expr.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_expr.reset();
                stream_PASSO.reset();
                // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:127:161: ^( 'COMANDOS' ( comandos )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMANDOS, "COMANDOS"), root_2);

                // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:127:174: ( comandos )*
                while ( stream_comandos.hasNext() ) {
                    adaptor.addChild(root_2, stream_comandos.nextTree());

                }
                stream_comandos.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "comando_para"

    public static class comando_imprimir_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comando_imprimir"
    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:131:1: comando_imprimir : 'IMPRIMA' '(' a= expr ( ',' b= expr )* ')' ';' -> ^( IMPRIMA $a ( $b)* ) ;
    public final Portugolv3Parser.comando_imprimir_return comando_imprimir() throws RecognitionException {
        Portugolv3Parser.comando_imprimir_return retval = new Portugolv3Parser.comando_imprimir_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal64=null;
        Token char_literal65=null;
        Token char_literal66=null;
        Token char_literal67=null;
        Token char_literal68=null;
        Portugolv3Parser.expr_return a = null;

        Portugolv3Parser.expr_return b = null;


        CommonTree string_literal64_tree=null;
        CommonTree char_literal65_tree=null;
        CommonTree char_literal66_tree=null;
        CommonTree char_literal67_tree=null;
        CommonTree char_literal68_tree=null;
        RewriteRuleTokenStream stream_IMPRIMA=new RewriteRuleTokenStream(adaptor,"token IMPRIMA");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:132:2: ( 'IMPRIMA' '(' a= expr ( ',' b= expr )* ')' ';' -> ^( IMPRIMA $a ( $b)* ) )
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:132:3: 'IMPRIMA' '(' a= expr ( ',' b= expr )* ')' ';'
            {
            string_literal64=(Token)match(input,IMPRIMA,FOLLOW_IMPRIMA_in_comando_imprimir662);  
            stream_IMPRIMA.add(string_literal64);

            char_literal65=(Token)match(input,40,FOLLOW_40_in_comando_imprimir664);  
            stream_40.add(char_literal65);

            pushFollow(FOLLOW_expr_in_comando_imprimir668);
            a=expr();

            state._fsp--;

            stream_expr.add(a.getTree());
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:132:24: ( ',' b= expr )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==38) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:132:25: ',' b= expr
            	    {
            	    char_literal66=(Token)match(input,38,FOLLOW_38_in_comando_imprimir671);  
            	    stream_38.add(char_literal66);

            	    pushFollow(FOLLOW_expr_in_comando_imprimir675);
            	    b=expr();

            	    state._fsp--;

            	    stream_expr.add(b.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            char_literal67=(Token)match(input,41,FOLLOW_41_in_comando_imprimir680);  
            stream_41.add(char_literal67);

            char_literal68=(Token)match(input,32,FOLLOW_32_in_comando_imprimir682);  
            stream_32.add(char_literal68);



            // AST REWRITE
            // elements: b, a
            // token labels: 
            // rule labels: retval, b, a
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);
            RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 132:47: -> ^( IMPRIMA $a ( $b)* )
            {
                // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:132:50: ^( IMPRIMA $a ( $b)* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IMPRIMA, "IMPRIMA"), root_1);

                adaptor.addChild(root_1, stream_a.nextTree());
                // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:132:63: ( $b)*
                while ( stream_b.hasNext() ) {
                    adaptor.addChild(root_1, stream_b.nextTree());

                }
                stream_b.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "comando_imprimir"

    public static class comando_ler_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comando_ler"
    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:136:1: comando_ler : 'LEIA' '(' listaIds ')' ';' -> ^( LEIA listaIds ) ;
    public final Portugolv3Parser.comando_ler_return comando_ler() throws RecognitionException {
        Portugolv3Parser.comando_ler_return retval = new Portugolv3Parser.comando_ler_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal69=null;
        Token char_literal70=null;
        Token char_literal72=null;
        Token char_literal73=null;
        Portugolv3Parser.listaIds_return listaIds71 = null;


        CommonTree string_literal69_tree=null;
        CommonTree char_literal70_tree=null;
        CommonTree char_literal72_tree=null;
        CommonTree char_literal73_tree=null;
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_LEIA=new RewriteRuleTokenStream(adaptor,"token LEIA");
        RewriteRuleSubtreeStream stream_listaIds=new RewriteRuleSubtreeStream(adaptor,"rule listaIds");
        try {
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:136:13: ( 'LEIA' '(' listaIds ')' ';' -> ^( LEIA listaIds ) )
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:136:15: 'LEIA' '(' listaIds ')' ';'
            {
            string_literal69=(Token)match(input,LEIA,FOLLOW_LEIA_in_comando_ler708);  
            stream_LEIA.add(string_literal69);

            char_literal70=(Token)match(input,40,FOLLOW_40_in_comando_ler710);  
            stream_40.add(char_literal70);

            pushFollow(FOLLOW_listaIds_in_comando_ler712);
            listaIds71=listaIds();

            state._fsp--;

            stream_listaIds.add(listaIds71.getTree());
            char_literal72=(Token)match(input,41,FOLLOW_41_in_comando_ler714);  
            stream_41.add(char_literal72);

            char_literal73=(Token)match(input,32,FOLLOW_32_in_comando_ler716);  
            stream_32.add(char_literal73);



            // AST REWRITE
            // elements: listaIds
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 136:43: -> ^( LEIA listaIds )
            {
                // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:136:46: ^( LEIA listaIds )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEIA, "LEIA"), root_1);

                adaptor.addChild(root_1, stream_listaIds.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "comando_ler"

    public static class comando_se_senao_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comando_se_senao"
    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:140:1: comando_se_senao : SE '(' exprBooleana ')' ( comandos )+ ( senao )? 'FIM' ';' -> ^( SE exprBooleana ^( ENTAO ( comandos )+ ) ( senao )? ) ;
    public final Portugolv3Parser.comando_se_senao_return comando_se_senao() throws RecognitionException {
        Portugolv3Parser.comando_se_senao_return retval = new Portugolv3Parser.comando_se_senao_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SE74=null;
        Token char_literal75=null;
        Token char_literal77=null;
        Token string_literal80=null;
        Token char_literal81=null;
        Portugolv3Parser.exprBooleana_return exprBooleana76 = null;

        Portugolv3Parser.comandos_return comandos78 = null;

        Portugolv3Parser.senao_return senao79 = null;


        CommonTree SE74_tree=null;
        CommonTree char_literal75_tree=null;
        CommonTree char_literal77_tree=null;
        CommonTree string_literal80_tree=null;
        CommonTree char_literal81_tree=null;
        RewriteRuleTokenStream stream_SE=new RewriteRuleTokenStream(adaptor,"token SE");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_FIM=new RewriteRuleTokenStream(adaptor,"token FIM");
        RewriteRuleSubtreeStream stream_comandos=new RewriteRuleSubtreeStream(adaptor,"rule comandos");
        RewriteRuleSubtreeStream stream_exprBooleana=new RewriteRuleSubtreeStream(adaptor,"rule exprBooleana");
        RewriteRuleSubtreeStream stream_senao=new RewriteRuleSubtreeStream(adaptor,"rule senao");
        try {
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:141:2: ( SE '(' exprBooleana ')' ( comandos )+ ( senao )? 'FIM' ';' -> ^( SE exprBooleana ^( ENTAO ( comandos )+ ) ( senao )? ) )
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:141:4: SE '(' exprBooleana ')' ( comandos )+ ( senao )? 'FIM' ';'
            {
            SE74=(Token)match(input,SE,FOLLOW_SE_in_comando_se_senao737);  
            stream_SE.add(SE74);

            char_literal75=(Token)match(input,40,FOLLOW_40_in_comando_se_senao739);  
            stream_40.add(char_literal75);

            pushFollow(FOLLOW_exprBooleana_in_comando_se_senao741);
            exprBooleana76=exprBooleana();

            state._fsp--;

            stream_exprBooleana.add(exprBooleana76.getTree());
            char_literal77=(Token)match(input,41,FOLLOW_41_in_comando_se_senao743);  
            stream_41.add(char_literal77);

            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:141:28: ( comandos )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==SE||LA16_0==LEIA||(LA16_0>=IMPRIMA && LA16_0<=ENQUANTO)||LA16_0==PARA||LA16_0==ID||LA16_0==43) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:141:28: comandos
            	    {
            	    pushFollow(FOLLOW_comandos_in_comando_se_senao745);
            	    comandos78=comandos();

            	    state._fsp--;

            	    stream_comandos.add(comandos78.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:141:38: ( senao )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==SENAO) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:141:38: senao
                    {
                    pushFollow(FOLLOW_senao_in_comando_se_senao748);
                    senao79=senao();

                    state._fsp--;

                    stream_senao.add(senao79.getTree());

                    }
                    break;

            }

            string_literal80=(Token)match(input,FIM,FOLLOW_FIM_in_comando_se_senao751);  
            stream_FIM.add(string_literal80);

            char_literal81=(Token)match(input,32,FOLLOW_32_in_comando_se_senao753);  
            stream_32.add(char_literal81);



            // AST REWRITE
            // elements: exprBooleana, comandos, SE, senao
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 141:55: -> ^( SE exprBooleana ^( ENTAO ( comandos )+ ) ( senao )? )
            {
                // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:141:58: ^( SE exprBooleana ^( ENTAO ( comandos )+ ) ( senao )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_SE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_exprBooleana.nextTree());
                // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:141:76: ^( ENTAO ( comandos )+ )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ENTAO, "ENTAO"), root_2);

                if ( !(stream_comandos.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_comandos.hasNext() ) {
                    adaptor.addChild(root_2, stream_comandos.nextTree());

                }
                stream_comandos.reset();

                adaptor.addChild(root_1, root_2);
                }
                // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:141:95: ( senao )?
                if ( stream_senao.hasNext() ) {
                    adaptor.addChild(root_1, stream_senao.nextTree());

                }
                stream_senao.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "comando_se_senao"

    public static class senao_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "senao"
    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:145:1: senao : ( SENAO ( senao_comando )+ ) -> ^( SENAO ( senao_comando )+ ) ;
    public final Portugolv3Parser.senao_return senao() throws RecognitionException {
        Portugolv3Parser.senao_return retval = new Portugolv3Parser.senao_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SENAO82=null;
        Portugolv3Parser.senao_comando_return senao_comando83 = null;


        CommonTree SENAO82_tree=null;
        RewriteRuleTokenStream stream_SENAO=new RewriteRuleTokenStream(adaptor,"token SENAO");
        RewriteRuleSubtreeStream stream_senao_comando=new RewriteRuleSubtreeStream(adaptor,"rule senao_comando");
        try {
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:145:7: ( ( SENAO ( senao_comando )+ ) -> ^( SENAO ( senao_comando )+ ) )
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:145:9: ( SENAO ( senao_comando )+ )
            {
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:145:9: ( SENAO ( senao_comando )+ )
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:145:10: SENAO ( senao_comando )+
            {
            SENAO82=(Token)match(input,SENAO,FOLLOW_SENAO_in_senao785);  
            stream_SENAO.add(SENAO82);

            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:145:16: ( senao_comando )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==SE||LA18_0==LEIA||(LA18_0>=IMPRIMA && LA18_0<=ENQUANTO)||LA18_0==PARA||LA18_0==ID||LA18_0==43) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:145:16: senao_comando
            	    {
            	    pushFollow(FOLLOW_senao_comando_in_senao787);
            	    senao_comando83=senao_comando();

            	    state._fsp--;

            	    stream_senao_comando.add(senao_comando83.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            }



            // AST REWRITE
            // elements: SENAO, senao_comando
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 145:32: -> ^( SENAO ( senao_comando )+ )
            {
                // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:145:35: ^( SENAO ( senao_comando )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_SENAO.nextNode(), root_1);

                if ( !(stream_senao_comando.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_senao_comando.hasNext() ) {
                    adaptor.addChild(root_1, stream_senao_comando.nextTree());

                }
                stream_senao_comando.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "senao"

    public static class senao_comando_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "senao_comando"
    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:149:1: senao_comando : comandos -> comandos ;
    public final Portugolv3Parser.senao_comando_return senao_comando() throws RecognitionException {
        Portugolv3Parser.senao_comando_return retval = new Portugolv3Parser.senao_comando_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Portugolv3Parser.comandos_return comandos84 = null;


        RewriteRuleSubtreeStream stream_comandos=new RewriteRuleSubtreeStream(adaptor,"rule comandos");
        try {
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:150:2: ( comandos -> comandos )
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:150:4: comandos
            {
            pushFollow(FOLLOW_comandos_in_senao_comando812);
            comandos84=comandos();

            state._fsp--;

            stream_comandos.add(comandos84.getTree());


            // AST REWRITE
            // elements: comandos
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 150:13: -> comandos
            {
                adaptor.addChild(root_0, stream_comandos.nextTree());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "senao_comando"

    public static class chamadaFuncao_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "chamadaFuncao"
    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:155:1: chamadaFuncao : ID '(' ( expr ( ',' expr )* )? ')' -> ^( CHAMADAFUNCAO ID ( ^( LISTAPARAMETROS expr ( expr )* ) )? ) ;
    public final Portugolv3Parser.chamadaFuncao_return chamadaFuncao() throws RecognitionException {
        Portugolv3Parser.chamadaFuncao_return retval = new Portugolv3Parser.chamadaFuncao_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID85=null;
        Token char_literal86=null;
        Token char_literal88=null;
        Token char_literal90=null;
        Portugolv3Parser.expr_return expr87 = null;

        Portugolv3Parser.expr_return expr89 = null;


        CommonTree ID85_tree=null;
        CommonTree char_literal86_tree=null;
        CommonTree char_literal88_tree=null;
        CommonTree char_literal90_tree=null;
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:156:2: ( ID '(' ( expr ( ',' expr )* )? ')' -> ^( CHAMADAFUNCAO ID ( ^( LISTAPARAMETROS expr ( expr )* ) )? ) )
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:156:4: ID '(' ( expr ( ',' expr )* )? ')'
            {
            ID85=(Token)match(input,ID,FOLLOW_ID_in_chamadaFuncao832);  
            stream_ID.add(ID85);

            char_literal86=(Token)match(input,40,FOLLOW_40_in_chamadaFuncao834);  
            stream_40.add(char_literal86);

            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:156:11: ( expr ( ',' expr )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=ID && LA20_0<=STRING)||LA20_0==40||LA20_0==55||LA20_0==58||(LA20_0>=60 && LA20_0<=61)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:156:12: expr ( ',' expr )*
                    {
                    pushFollow(FOLLOW_expr_in_chamadaFuncao837);
                    expr87=expr();

                    state._fsp--;

                    stream_expr.add(expr87.getTree());
                    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:156:17: ( ',' expr )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==38) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:156:18: ',' expr
                    	    {
                    	    char_literal88=(Token)match(input,38,FOLLOW_38_in_chamadaFuncao840);  
                    	    stream_38.add(char_literal88);

                    	    pushFollow(FOLLOW_expr_in_chamadaFuncao842);
                    	    expr89=expr();

                    	    state._fsp--;

                    	    stream_expr.add(expr89.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal90=(Token)match(input,41,FOLLOW_41_in_chamadaFuncao848);  
            stream_41.add(char_literal90);



            // AST REWRITE
            // elements: expr, expr, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 156:35: -> ^( CHAMADAFUNCAO ID ( ^( LISTAPARAMETROS expr ( expr )* ) )? )
            {
                // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:156:38: ^( CHAMADAFUNCAO ID ( ^( LISTAPARAMETROS expr ( expr )* ) )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CHAMADAFUNCAO, "CHAMADAFUNCAO"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:156:57: ( ^( LISTAPARAMETROS expr ( expr )* ) )?
                if ( stream_expr.hasNext()||stream_expr.hasNext() ) {
                    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:156:57: ^( LISTAPARAMETROS expr ( expr )* )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LISTAPARAMETROS, "LISTAPARAMETROS"), root_2);

                    adaptor.addChild(root_2, stream_expr.nextTree());
                    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:156:80: ( expr )*
                    while ( stream_expr.hasNext() ) {
                        adaptor.addChild(root_2, stream_expr.nextTree());

                    }
                    stream_expr.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_expr.reset();
                stream_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "chamadaFuncao"

    public static class comando_atribuicao_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comando_atribuicao"
    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:160:1: comando_atribuicao : ID '=' exprBooleana ';' -> ^( '=' ID exprBooleana ) ;
    public final Portugolv3Parser.comando_atribuicao_return comando_atribuicao() throws RecognitionException {
        Portugolv3Parser.comando_atribuicao_return retval = new Portugolv3Parser.comando_atribuicao_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID91=null;
        Token char_literal92=null;
        Token char_literal94=null;
        Portugolv3Parser.exprBooleana_return exprBooleana93 = null;


        CommonTree ID91_tree=null;
        CommonTree char_literal92_tree=null;
        CommonTree char_literal94_tree=null;
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_exprBooleana=new RewriteRuleSubtreeStream(adaptor,"rule exprBooleana");
        try {
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:161:2: ( ID '=' exprBooleana ';' -> ^( '=' ID exprBooleana ) )
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:161:4: ID '=' exprBooleana ';'
            {
            ID91=(Token)match(input,ID,FOLLOW_ID_in_comando_atribuicao883);  
            stream_ID.add(ID91);

            char_literal92=(Token)match(input,44,FOLLOW_44_in_comando_atribuicao885);  
            stream_44.add(char_literal92);

            pushFollow(FOLLOW_exprBooleana_in_comando_atribuicao887);
            exprBooleana93=exprBooleana();

            state._fsp--;

            stream_exprBooleana.add(exprBooleana93.getTree());
            char_literal94=(Token)match(input,32,FOLLOW_32_in_comando_atribuicao889);  
            stream_32.add(char_literal94);



            // AST REWRITE
            // elements: ID, exprBooleana, 44
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 161:28: -> ^( '=' ID exprBooleana )
            {
                // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:161:31: ^( '=' ID exprBooleana )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_44.nextNode(), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_exprBooleana.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "comando_atribuicao"

    public static class exprBooleana_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprBooleana"
    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:165:1: exprBooleana : (a= exprAnd ) ( '||' b= exprAnd )* ;
    public final Portugolv3Parser.exprBooleana_return exprBooleana() throws RecognitionException {
        Portugolv3Parser.exprBooleana_return retval = new Portugolv3Parser.exprBooleana_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal95=null;
        Portugolv3Parser.exprAnd_return a = null;

        Portugolv3Parser.exprAnd_return b = null;


        CommonTree string_literal95_tree=null;

        try {
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:165:14: ( (a= exprAnd ) ( '||' b= exprAnd )* )
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:165:16: (a= exprAnd ) ( '||' b= exprAnd )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:165:16: (a= exprAnd )
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:165:17: a= exprAnd
            {
            pushFollow(FOLLOW_exprAnd_in_exprBooleana915);
            a=exprAnd();

            state._fsp--;

            adaptor.addChild(root_0, a.getTree());

            }

            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:165:28: ( '||' b= exprAnd )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==46) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:165:29: '||' b= exprAnd
            	    {
            	    string_literal95=(Token)match(input,46,FOLLOW_46_in_exprBooleana919); 
            	    string_literal95_tree = (CommonTree)adaptor.create(string_literal95);
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal95_tree, root_0);

            	    pushFollow(FOLLOW_exprAnd_in_exprBooleana924);
            	    b=exprAnd();

            	    state._fsp--;

            	    adaptor.addChild(root_0, b.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exprBooleana"

    public static class exprAnd_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprAnd"
    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:169:1: exprAnd : ( comparacao ) ( '&&' comparacao )* ;
    public final Portugolv3Parser.exprAnd_return exprAnd() throws RecognitionException {
        Portugolv3Parser.exprAnd_return retval = new Portugolv3Parser.exprAnd_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal97=null;
        Portugolv3Parser.comparacao_return comparacao96 = null;

        Portugolv3Parser.comparacao_return comparacao98 = null;


        CommonTree string_literal97_tree=null;

        try {
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:169:9: ( ( comparacao ) ( '&&' comparacao )* )
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:169:11: ( comparacao ) ( '&&' comparacao )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:169:11: ( comparacao )
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:169:12: comparacao
            {
            pushFollow(FOLLOW_comparacao_in_exprAnd940);
            comparacao96=comparacao();

            state._fsp--;

            adaptor.addChild(root_0, comparacao96.getTree());

            }

            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:169:24: ( '&&' comparacao )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==47) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:169:25: '&&' comparacao
            	    {
            	    string_literal97=(Token)match(input,47,FOLLOW_47_in_exprAnd944); 
            	    string_literal97_tree = (CommonTree)adaptor.create(string_literal97);
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal97_tree, root_0);

            	    pushFollow(FOLLOW_comparacao_in_exprAnd947);
            	    comparacao98=comparacao();

            	    state._fsp--;

            	    adaptor.addChild(root_0, comparacao98.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exprAnd"

    public static class comparacao_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comparacao"
    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:173:1: comparacao : ( rel ) ( '==' rel | '!=' rel )* ;
    public final Portugolv3Parser.comparacao_return comparacao() throws RecognitionException {
        Portugolv3Parser.comparacao_return retval = new Portugolv3Parser.comparacao_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal100=null;
        Token string_literal102=null;
        Portugolv3Parser.rel_return rel99 = null;

        Portugolv3Parser.rel_return rel101 = null;

        Portugolv3Parser.rel_return rel103 = null;


        CommonTree string_literal100_tree=null;
        CommonTree string_literal102_tree=null;

        try {
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:173:11: ( ( rel ) ( '==' rel | '!=' rel )* )
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:173:13: ( rel ) ( '==' rel | '!=' rel )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:173:13: ( rel )
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:173:14: rel
            {
            pushFollow(FOLLOW_rel_in_comparacao962);
            rel99=rel();

            state._fsp--;

            adaptor.addChild(root_0, rel99.getTree());

            }

            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:173:19: ( '==' rel | '!=' rel )*
            loop23:
            do {
                int alt23=3;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==48) ) {
                    alt23=1;
                }
                else if ( (LA23_0==49) ) {
                    alt23=2;
                }


                switch (alt23) {
            	case 1 :
            	    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:173:20: '==' rel
            	    {
            	    string_literal100=(Token)match(input,48,FOLLOW_48_in_comparacao966); 
            	    string_literal100_tree = (CommonTree)adaptor.create(string_literal100);
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal100_tree, root_0);

            	    pushFollow(FOLLOW_rel_in_comparacao969);
            	    rel101=rel();

            	    state._fsp--;

            	    adaptor.addChild(root_0, rel101.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:173:32: '!=' rel
            	    {
            	    string_literal102=(Token)match(input,49,FOLLOW_49_in_comparacao973); 
            	    string_literal102_tree = (CommonTree)adaptor.create(string_literal102);
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal102_tree, root_0);

            	    pushFollow(FOLLOW_rel_in_comparacao976);
            	    rel103=rel();

            	    state._fsp--;

            	    adaptor.addChild(root_0, rel103.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "comparacao"

    public static class rel_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rel"
    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:177:1: rel : expr ( ( '>' | '<' | '>=' | '<=' ) expr )? ;
    public final Portugolv3Parser.rel_return rel() throws RecognitionException {
        Portugolv3Parser.rel_return retval = new Portugolv3Parser.rel_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal105=null;
        Token char_literal106=null;
        Token string_literal107=null;
        Token string_literal108=null;
        Portugolv3Parser.expr_return expr104 = null;

        Portugolv3Parser.expr_return expr109 = null;


        CommonTree char_literal105_tree=null;
        CommonTree char_literal106_tree=null;
        CommonTree string_literal107_tree=null;
        CommonTree string_literal108_tree=null;

        try {
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:177:5: ( expr ( ( '>' | '<' | '>=' | '<=' ) expr )? )
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:177:7: expr ( ( '>' | '<' | '>=' | '<=' ) expr )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expr_in_rel991);
            expr104=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr104.getTree());
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:177:12: ( ( '>' | '<' | '>=' | '<=' ) expr )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=50 && LA25_0<=53)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:177:13: ( '>' | '<' | '>=' | '<=' ) expr
                    {
                    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:177:13: ( '>' | '<' | '>=' | '<=' )
                    int alt24=4;
                    switch ( input.LA(1) ) {
                    case 50:
                        {
                        alt24=1;
                        }
                        break;
                    case 51:
                        {
                        alt24=2;
                        }
                        break;
                    case 52:
                        {
                        alt24=3;
                        }
                        break;
                    case 53:
                        {
                        alt24=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }

                    switch (alt24) {
                        case 1 :
                            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:177:14: '>'
                            {
                            char_literal105=(Token)match(input,50,FOLLOW_50_in_rel995); 
                            char_literal105_tree = (CommonTree)adaptor.create(char_literal105);
                            root_0 = (CommonTree)adaptor.becomeRoot(char_literal105_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:177:19: '<'
                            {
                            char_literal106=(Token)match(input,51,FOLLOW_51_in_rel998); 
                            char_literal106_tree = (CommonTree)adaptor.create(char_literal106);
                            root_0 = (CommonTree)adaptor.becomeRoot(char_literal106_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:177:24: '>='
                            {
                            string_literal107=(Token)match(input,52,FOLLOW_52_in_rel1001); 
                            string_literal107_tree = (CommonTree)adaptor.create(string_literal107);
                            root_0 = (CommonTree)adaptor.becomeRoot(string_literal107_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:177:30: '<='
                            {
                            string_literal108=(Token)match(input,53,FOLLOW_53_in_rel1004); 
                            string_literal108_tree = (CommonTree)adaptor.create(string_literal108);
                            root_0 = (CommonTree)adaptor.becomeRoot(string_literal108_tree, root_0);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expr_in_rel1008);
                    expr109=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr109.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rel"

    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:181:1: expr : termo ( '+' termo | '-' termo )* ;
    public final Portugolv3Parser.expr_return expr() throws RecognitionException {
        Portugolv3Parser.expr_return retval = new Portugolv3Parser.expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal111=null;
        Token char_literal113=null;
        Portugolv3Parser.termo_return termo110 = null;

        Portugolv3Parser.termo_return termo112 = null;

        Portugolv3Parser.termo_return termo114 = null;


        CommonTree char_literal111_tree=null;
        CommonTree char_literal113_tree=null;

        try {
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:181:6: ( termo ( '+' termo | '-' termo )* )
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:181:8: termo ( '+' termo | '-' termo )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_termo_in_expr1022);
            termo110=termo();

            state._fsp--;

            adaptor.addChild(root_0, termo110.getTree());
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:181:14: ( '+' termo | '-' termo )*
            loop26:
            do {
                int alt26=3;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==54) ) {
                    alt26=1;
                }
                else if ( (LA26_0==55) ) {
                    alt26=2;
                }


                switch (alt26) {
            	case 1 :
            	    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:181:15: '+' termo
            	    {
            	    char_literal111=(Token)match(input,54,FOLLOW_54_in_expr1025); 
            	    char_literal111_tree = (CommonTree)adaptor.create(char_literal111);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal111_tree, root_0);

            	    pushFollow(FOLLOW_termo_in_expr1028);
            	    termo112=termo();

            	    state._fsp--;

            	    adaptor.addChild(root_0, termo112.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:181:28: '-' termo
            	    {
            	    char_literal113=(Token)match(input,55,FOLLOW_55_in_expr1032); 
            	    char_literal113_tree = (CommonTree)adaptor.create(char_literal113);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal113_tree, root_0);

            	    pushFollow(FOLLOW_termo_in_expr1035);
            	    termo114=termo();

            	    state._fsp--;

            	    adaptor.addChild(root_0, termo114.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class termo_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "termo"
    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:185:1: termo : unario ( '*' unario | '/' unario )* ;
    public final Portugolv3Parser.termo_return termo() throws RecognitionException {
        Portugolv3Parser.termo_return retval = new Portugolv3Parser.termo_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal116=null;
        Token char_literal118=null;
        Portugolv3Parser.unario_return unario115 = null;

        Portugolv3Parser.unario_return unario117 = null;

        Portugolv3Parser.unario_return unario119 = null;


        CommonTree char_literal116_tree=null;
        CommonTree char_literal118_tree=null;

        try {
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:185:7: ( unario ( '*' unario | '/' unario )* )
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:185:9: unario ( '*' unario | '/' unario )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_unario_in_termo1055);
            unario115=unario();

            state._fsp--;

            adaptor.addChild(root_0, unario115.getTree());
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:185:17: ( '*' unario | '/' unario )*
            loop27:
            do {
                int alt27=3;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==56) ) {
                    alt27=1;
                }
                else if ( (LA27_0==57) ) {
                    alt27=2;
                }


                switch (alt27) {
            	case 1 :
            	    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:185:18: '*' unario
            	    {
            	    char_literal116=(Token)match(input,56,FOLLOW_56_in_termo1059); 
            	    char_literal116_tree = (CommonTree)adaptor.create(char_literal116);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal116_tree, root_0);

            	    pushFollow(FOLLOW_unario_in_termo1062);
            	    unario117=unario();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unario117.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:185:32: '/' unario
            	    {
            	    char_literal118=(Token)match(input,57,FOLLOW_57_in_termo1066); 
            	    char_literal118_tree = (CommonTree)adaptor.create(char_literal118);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal118_tree, root_0);

            	    pushFollow(FOLLOW_unario_in_termo1069);
            	    unario119=unario();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unario119.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "termo"

    public static class unario_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unario"
    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:188:1: unario : ( ( '!' | '-' ) unario | fator ( '^' fator )* | chamadaFuncao );
    public final Portugolv3Parser.unario_return unario() throws RecognitionException {
        Portugolv3Parser.unario_return retval = new Portugolv3Parser.unario_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal120=null;
        Token char_literal121=null;
        Token char_literal124=null;
        Portugolv3Parser.unario_return unario122 = null;

        Portugolv3Parser.fator_return fator123 = null;

        Portugolv3Parser.fator_return fator125 = null;

        Portugolv3Parser.chamadaFuncao_return chamadaFuncao126 = null;


        CommonTree char_literal120_tree=null;
        CommonTree char_literal121_tree=null;
        CommonTree char_literal124_tree=null;

        try {
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:189:6: ( ( '!' | '-' ) unario | fator ( '^' fator )* | chamadaFuncao )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 55:
            case 58:
                {
                alt30=1;
                }
                break;
            case INT:
            case STRING:
            case 40:
            case 60:
            case 61:
                {
                alt30=2;
                }
                break;
            case ID:
                {
                int LA30_3 = input.LA(2);

                if ( (LA30_3==40) ) {
                    alt30=3;
                }
                else if ( (LA30_3==PASSO||LA30_3==32||LA30_3==38||LA30_3==41||(LA30_3>=45 && LA30_3<=57)||LA30_3==59) ) {
                    alt30=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:189:7: ( '!' | '-' ) unario
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:189:7: ( '!' | '-' )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==58) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==55) ) {
                        alt28=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;
                    }
                    switch (alt28) {
                        case 1 :
                            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:189:8: '!'
                            {
                            char_literal120=(Token)match(input,58,FOLLOW_58_in_unario1091); 
                            char_literal120_tree = (CommonTree)adaptor.create(char_literal120);
                            root_0 = (CommonTree)adaptor.becomeRoot(char_literal120_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:189:13: '-'
                            {
                            char_literal121=(Token)match(input,55,FOLLOW_55_in_unario1094); 
                            char_literal121_tree = (CommonTree)adaptor.create(char_literal121);
                            root_0 = (CommonTree)adaptor.becomeRoot(char_literal121_tree, root_0);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_unario_in_unario1098);
                    unario122=unario();

                    state._fsp--;

                    adaptor.addChild(root_0, unario122.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:190:7: fator ( '^' fator )*
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_fator_in_unario1106);
                    fator123=fator();

                    state._fsp--;

                    adaptor.addChild(root_0, fator123.getTree());
                    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:190:13: ( '^' fator )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==59) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:190:14: '^' fator
                    	    {
                    	    char_literal124=(Token)match(input,59,FOLLOW_59_in_unario1109); 
                    	    char_literal124_tree = (CommonTree)adaptor.create(char_literal124);
                    	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal124_tree, root_0);

                    	    pushFollow(FOLLOW_fator_in_unario1112);
                    	    fator125=fator();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, fator125.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:191:7: chamadaFuncao
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_chamadaFuncao_in_unario1122);
                    chamadaFuncao126=chamadaFuncao();

                    state._fsp--;

                    adaptor.addChild(root_0, chamadaFuncao126.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unario"

    public static class fator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fator"
    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:193:1: fator : ( INT | ID | string | '(' exprBooleana ')' -> exprBooleana | 'true' | 'false' );
    public final Portugolv3Parser.fator_return fator() throws RecognitionException {
        Portugolv3Parser.fator_return retval = new Portugolv3Parser.fator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INT127=null;
        Token ID128=null;
        Token char_literal130=null;
        Token char_literal132=null;
        Token string_literal133=null;
        Token string_literal134=null;
        Portugolv3Parser.string_return string129 = null;

        Portugolv3Parser.exprBooleana_return exprBooleana131 = null;


        CommonTree INT127_tree=null;
        CommonTree ID128_tree=null;
        CommonTree char_literal130_tree=null;
        CommonTree char_literal132_tree=null;
        CommonTree string_literal133_tree=null;
        CommonTree string_literal134_tree=null;
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleSubtreeStream stream_exprBooleana=new RewriteRuleSubtreeStream(adaptor,"rule exprBooleana");
        try {
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:194:5: ( INT | ID | string | '(' exprBooleana ')' -> exprBooleana | 'true' | 'false' )
            int alt31=6;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt31=1;
                }
                break;
            case ID:
                {
                alt31=2;
                }
                break;
            case STRING:
                {
                alt31=3;
                }
                break;
            case 40:
                {
                alt31=4;
                }
                break;
            case 60:
                {
                alt31=5;
                }
                break;
            case 61:
                {
                alt31=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:194:9: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INT127=(Token)match(input,INT,FOLLOW_INT_in_fator1137); 
                    INT127_tree = (CommonTree)adaptor.create(INT127);
                    adaptor.addChild(root_0, INT127_tree);


                    }
                    break;
                case 2 :
                    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:195:9: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    ID128=(Token)match(input,ID,FOLLOW_ID_in_fator1148); 
                    ID128_tree = (CommonTree)adaptor.create(ID128);
                    adaptor.addChild(root_0, ID128_tree);


                    }
                    break;
                case 3 :
                    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:196:7: string
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_string_in_fator1156);
                    string129=string();

                    state._fsp--;

                    adaptor.addChild(root_0, string129.getTree());

                    }
                    break;
                case 4 :
                    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:197:9: '(' exprBooleana ')'
                    {
                    char_literal130=(Token)match(input,40,FOLLOW_40_in_fator1166);  
                    stream_40.add(char_literal130);

                    pushFollow(FOLLOW_exprBooleana_in_fator1168);
                    exprBooleana131=exprBooleana();

                    state._fsp--;

                    stream_exprBooleana.add(exprBooleana131.getTree());
                    char_literal132=(Token)match(input,41,FOLLOW_41_in_fator1170);  
                    stream_41.add(char_literal132);



                    // AST REWRITE
                    // elements: exprBooleana
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 197:30: -> exprBooleana
                    {
                        adaptor.addChild(root_0, stream_exprBooleana.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:198:7: 'true'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal133=(Token)match(input,60,FOLLOW_60_in_fator1182); 
                    string_literal133_tree = (CommonTree)adaptor.create(string_literal133);
                    adaptor.addChild(root_0, string_literal133_tree);


                    }
                    break;
                case 6 :
                    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:199:7: 'false'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal134=(Token)match(input,61,FOLLOW_61_in_fator1190); 
                    string_literal134_tree = (CommonTree)adaptor.create(string_literal134);
                    adaptor.addChild(root_0, string_literal134_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fator"

    public static class string_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "string"
    // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:202:1: string : STRING ;
    public final Portugolv3Parser.string_return string() throws RecognitionException {
        Portugolv3Parser.string_return retval = new Portugolv3Parser.string_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token STRING135=null;

        CommonTree STRING135_tree=null;

        try {
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:202:8: ( STRING )
            // /Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/Portugolv3.g:202:9: STRING
            {
            root_0 = (CommonTree)adaptor.nil();

            STRING135=(Token)match(input,STRING,FOLLOW_STRING_in_string1202); 
            STRING135_tree = (CommonTree)adaptor.create(STRING135);
            adaptor.addChild(root_0, STRING135_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "string"

    // Delegated rules


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\12\uffff";
    static final String DFA11_eofS =
        "\12\uffff";
    static final String DFA11_minS =
        "\1\6\6\uffff\1\50\2\uffff";
    static final String DFA11_maxS =
        "\1\53\6\uffff\1\54\2\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\7\1\10";
    static final String DFA11_specialS =
        "\12\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\1\6\uffff\1\4\1\uffff\1\3\1\5\3\uffff\1\2\2\uffff\1\7\23"+
            "\uffff\1\6",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\10\3\uffff\1\11",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "108:1: comandos : ( comando_se_senao -> comando_se_senao | comando_para -> comando_para | comando_imprimir -> comando_imprimir | comando_ler -> comando_ler | comando_enquanto -> comando_enquanto | 'SAIR' ';' -> 'SAIR' | chamadaFuncao ';' -> chamadaFuncao | comando_atribuicao -> comando_atribuicao );";
        }
    }
 

    public static final BitSet FOLLOW_COMMENT_in_prog153 = new BitSet(new long[]{0x0000000080400000L});
    public static final BitSet FOLLOW_31_in_prog156 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ID_in_prog160 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_prog162 = new BitSet(new long[]{0x000008BC0091E040L});
    public static final BitSet FOLLOW_declVars_in_prog164 = new BitSet(new long[]{0x000008BC0091E040L});
    public static final BitSet FOLLOW_declFuncoes_in_prog167 = new BitSet(new long[]{0x000008800091E040L});
    public static final BitSet FOLLOW_comandos_in_prog170 = new BitSet(new long[]{0x000008000091E040L});
    public static final BitSet FOLLOW_FIM_in_prog173 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_prog175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tipo_in_declVars225 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_listaIds_in_declVars229 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_declVars230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_tipo253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_tipo260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_tipo267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_tipo273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_listaIds303 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_listaIds307 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ID_in_listaIds311 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_39_in_declFuncoes332 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ID_in_declFuncoes336 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_declFuncoes338 = new BitSet(new long[]{0x0000020000800000L});
    public static final BitSet FOLLOW_listaParametros_in_declFuncoes340 = new BitSet(new long[]{0x0000020000800000L});
    public static final BitSet FOLLOW_41_in_declFuncoes343 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_declFuncoes344 = new BitSet(new long[]{0x0000003C00000000L});
    public static final BitSet FOLLOW_tipo_in_declFuncoes346 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_declFuncoes348 = new BitSet(new long[]{0x0000083C0091E040L});
    public static final BitSet FOLLOW_corpoFuncao_in_declFuncoes350 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FIM_in_declFuncoes352 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_declFuncoes354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declVars_in_corpoFuncao394 = new BitSet(new long[]{0x0000083C0091A042L});
    public static final BitSet FOLLOW_comandos_in_corpoFuncao397 = new BitSet(new long[]{0x000008000091A042L});
    public static final BitSet FOLLOW_ID_in_listaParametros427 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_listaParametros429 = new BitSet(new long[]{0x0000003C00000000L});
    public static final BitSet FOLLOW_tipo_in_listaParametros431 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_listaParametros435 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ID_in_listaParametros437 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_listaParametros439 = new BitSet(new long[]{0x0000003C00000000L});
    public static final BitSet FOLLOW_tipo_in_listaParametros441 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_comando_se_senao_in_comandos466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comando_para_in_comandos476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comando_imprimir_in_comandos484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comando_ler_in_comandos492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comando_enquanto_in_comandos500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_comandos508 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_comandos510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chamadaFuncao_in_comandos520 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_comandos522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comando_atribuicao_in_comandos531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENQUANTO_in_comando_enquanto547 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_comando_enquanto549 = new BitSet(new long[]{0x3480010003800000L});
    public static final BitSet FOLLOW_exprBooleana_in_comando_enquanto551 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_comando_enquanto553 = new BitSet(new long[]{0x000008000091E040L});
    public static final BitSet FOLLOW_comandos_in_comando_enquanto555 = new BitSet(new long[]{0x000008000091E040L});
    public static final BitSet FOLLOW_FIM_in_comando_enquanto558 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_comando_enquanto560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARA_in_comando_para583 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_comando_para585 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ID_in_comando_para587 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_comando_para589 = new BitSet(new long[]{0x3480010003800000L});
    public static final BitSet FOLLOW_expr_in_comando_para591 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_comando_para593 = new BitSet(new long[]{0x3480010003800000L});
    public static final BitSet FOLLOW_comparacao_in_comando_para595 = new BitSet(new long[]{0x0000020000020000L});
    public static final BitSet FOLLOW_PASSO_in_comando_para599 = new BitSet(new long[]{0x3480010003800000L});
    public static final BitSet FOLLOW_expr_in_comando_para601 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_comando_para605 = new BitSet(new long[]{0x000008000091E040L});
    public static final BitSet FOLLOW_comandos_in_comando_para607 = new BitSet(new long[]{0x000008000091E040L});
    public static final BitSet FOLLOW_FIM_in_comando_para611 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_comando_para613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPRIMA_in_comando_imprimir662 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_comando_imprimir664 = new BitSet(new long[]{0x3480010003800000L});
    public static final BitSet FOLLOW_expr_in_comando_imprimir668 = new BitSet(new long[]{0x0000024000000000L});
    public static final BitSet FOLLOW_38_in_comando_imprimir671 = new BitSet(new long[]{0x3480010003800000L});
    public static final BitSet FOLLOW_expr_in_comando_imprimir675 = new BitSet(new long[]{0x0000024000000000L});
    public static final BitSet FOLLOW_41_in_comando_imprimir680 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_comando_imprimir682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEIA_in_comando_ler708 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_comando_ler710 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_listaIds_in_comando_ler712 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_comando_ler714 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_comando_ler716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SE_in_comando_se_senao737 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_comando_se_senao739 = new BitSet(new long[]{0x3480010003800000L});
    public static final BitSet FOLLOW_exprBooleana_in_comando_se_senao741 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_comando_se_senao743 = new BitSet(new long[]{0x000008000091A040L});
    public static final BitSet FOLLOW_comandos_in_comando_se_senao745 = new BitSet(new long[]{0x000008000091E060L});
    public static final BitSet FOLLOW_senao_in_comando_se_senao748 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FIM_in_comando_se_senao751 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_comando_se_senao753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SENAO_in_senao785 = new BitSet(new long[]{0x000008000091A040L});
    public static final BitSet FOLLOW_senao_comando_in_senao787 = new BitSet(new long[]{0x000008000091A042L});
    public static final BitSet FOLLOW_comandos_in_senao_comando812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_chamadaFuncao832 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_chamadaFuncao834 = new BitSet(new long[]{0x3480030003800000L});
    public static final BitSet FOLLOW_expr_in_chamadaFuncao837 = new BitSet(new long[]{0x0000024000000000L});
    public static final BitSet FOLLOW_38_in_chamadaFuncao840 = new BitSet(new long[]{0x3480010003800000L});
    public static final BitSet FOLLOW_expr_in_chamadaFuncao842 = new BitSet(new long[]{0x0000024000000000L});
    public static final BitSet FOLLOW_41_in_chamadaFuncao848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_comando_atribuicao883 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_comando_atribuicao885 = new BitSet(new long[]{0x3480010003800000L});
    public static final BitSet FOLLOW_exprBooleana_in_comando_atribuicao887 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_comando_atribuicao889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprAnd_in_exprBooleana915 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_exprBooleana919 = new BitSet(new long[]{0x3480010003800000L});
    public static final BitSet FOLLOW_exprAnd_in_exprBooleana924 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_comparacao_in_exprAnd940 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_exprAnd944 = new BitSet(new long[]{0x3480010003800000L});
    public static final BitSet FOLLOW_comparacao_in_exprAnd947 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rel_in_comparacao962 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_48_in_comparacao966 = new BitSet(new long[]{0x3480010003800000L});
    public static final BitSet FOLLOW_rel_in_comparacao969 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_49_in_comparacao973 = new BitSet(new long[]{0x3480010003800000L});
    public static final BitSet FOLLOW_rel_in_comparacao976 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_expr_in_rel991 = new BitSet(new long[]{0x003C000000000002L});
    public static final BitSet FOLLOW_50_in_rel995 = new BitSet(new long[]{0x3480010003800000L});
    public static final BitSet FOLLOW_51_in_rel998 = new BitSet(new long[]{0x3480010003800000L});
    public static final BitSet FOLLOW_52_in_rel1001 = new BitSet(new long[]{0x3480010003800000L});
    public static final BitSet FOLLOW_53_in_rel1004 = new BitSet(new long[]{0x3480010003800000L});
    public static final BitSet FOLLOW_expr_in_rel1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termo_in_expr1022 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_54_in_expr1025 = new BitSet(new long[]{0x3480010003800000L});
    public static final BitSet FOLLOW_termo_in_expr1028 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_55_in_expr1032 = new BitSet(new long[]{0x3480010003800000L});
    public static final BitSet FOLLOW_termo_in_expr1035 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_unario_in_termo1055 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_56_in_termo1059 = new BitSet(new long[]{0x3480010003800000L});
    public static final BitSet FOLLOW_unario_in_termo1062 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_57_in_termo1066 = new BitSet(new long[]{0x3480010003800000L});
    public static final BitSet FOLLOW_unario_in_termo1069 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_58_in_unario1091 = new BitSet(new long[]{0x3480010003800000L});
    public static final BitSet FOLLOW_55_in_unario1094 = new BitSet(new long[]{0x3480010003800000L});
    public static final BitSet FOLLOW_unario_in_unario1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fator_in_unario1106 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_unario1109 = new BitSet(new long[]{0x3000010003800000L});
    public static final BitSet FOLLOW_fator_in_unario1112 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_chamadaFuncao_in_unario1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_fator1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fator1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_fator1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_fator1166 = new BitSet(new long[]{0x3480010003800000L});
    public static final BitSet FOLLOW_exprBooleana_in_fator1168 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_fator1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_fator1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_fator1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_string1202 = new BitSet(new long[]{0x0000000000000002L});

}
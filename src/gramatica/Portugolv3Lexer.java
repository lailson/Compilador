// $ANTLR 3.3 Nov 30, 2010 12:45:30 /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g 2011-10-05 11:36:39

package Gramatica;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Portugolv3Lexer extends Lexer {
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

    public Portugolv3Lexer() {;} 
    public Portugolv3Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Portugolv3Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g"; }

    // $ANTLR start "ENTAO"
    public final void mENTAO() throws RecognitionException {
        try {
            int _type = ENTAO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:11:7: ( 'ENTAO' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:11:9: 'ENTAO'
            {
            match("ENTAO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENTAO"

    // $ANTLR start "SENAO"
    public final void mSENAO() throws RecognitionException {
        try {
            int _type = SENAO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:12:7: ( 'SENAO' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:12:9: 'SENAO'
            {
            match("SENAO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SENAO"

    // $ANTLR start "SE"
    public final void mSE() throws RecognitionException {
        try {
            int _type = SE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:13:4: ( 'SE' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:13:6: 'SE'
            {
            match("SE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SE"

    // $ANTLR start "COMANDOS"
    public final void mCOMANDOS() throws RecognitionException {
        try {
            int _type = COMANDOS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:14:10: ( 'COMANDOS' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:14:12: 'COMANDOS'
            {
            match("COMANDOS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMANDOS"

    // $ANTLR start "VARIAVEIS"
    public final void mVARIAVEIS() throws RecognitionException {
        try {
            int _type = VARIAVEIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:15:11: ( 'VARIAVEIS' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:15:13: 'VARIAVEIS'
            {
            match("VARIAVEIS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VARIAVEIS"

    // $ANTLR start "FUNCOES"
    public final void mFUNCOES() throws RecognitionException {
        try {
            int _type = FUNCOES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:16:9: ( 'FUNCOES' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:16:11: 'FUNCOES'
            {
            match("FUNCOES"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCOES"

    // $ANTLR start "LISTAPARAMETROS"
    public final void mLISTAPARAMETROS() throws RecognitionException {
        try {
            int _type = LISTAPARAMETROS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:17:17: ( 'LISTAPARAMETROS' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:17:19: 'LISTAPARAMETROS'
            {
            match("LISTAPARAMETROS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LISTAPARAMETROS"

    // $ANTLR start "TIPORETORNO"
    public final void mTIPORETORNO() throws RecognitionException {
        try {
            int _type = TIPORETORNO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:18:13: ( 'TIPORETORNO' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:18:15: 'TIPORETORNO'
            {
            match("TIPORETORNO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIPORETORNO"

    // $ANTLR start "CORPOFUNCAO"
    public final void mCORPOFUNCAO() throws RecognitionException {
        try {
            int _type = CORPOFUNCAO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:19:13: ( 'CORPOFUNCAO' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:19:15: 'CORPOFUNCAO'
            {
            match("CORPOFUNCAO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CORPOFUNCAO"

    // $ANTLR start "LEIA"
    public final void mLEIA() throws RecognitionException {
        try {
            int _type = LEIA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:20:6: ( 'LEIA' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:20:8: 'LEIA'
            {
            match("LEIA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEIA"

    // $ANTLR start "FIM"
    public final void mFIM() throws RecognitionException {
        try {
            int _type = FIM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:21:5: ( 'FIM' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:21:7: 'FIM'
            {
            match("FIM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FIM"

    // $ANTLR start "IMPRIMA"
    public final void mIMPRIMA() throws RecognitionException {
        try {
            int _type = IMPRIMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:22:9: ( 'IMPRIMA' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:22:11: 'IMPRIMA'
            {
            match("IMPRIMA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IMPRIMA"

    // $ANTLR start "ENQUANTO"
    public final void mENQUANTO() throws RecognitionException {
        try {
            int _type = ENQUANTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:23:10: ( 'ENQUANTO' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:23:12: 'ENQUANTO'
            {
            match("ENQUANTO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENQUANTO"

    // $ANTLR start "PASSO"
    public final void mPASSO() throws RecognitionException {
        try {
            int _type = PASSO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:24:7: ( 'PASSO' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:24:9: 'PASSO'
            {
            match("PASSO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PASSO"

    // $ANTLR start "CONDICAO"
    public final void mCONDICAO() throws RecognitionException {
        try {
            int _type = CONDICAO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:25:10: ( 'CONDICAO' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:25:12: 'CONDICAO'
            {
            match("CONDICAO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONDICAO"

    // $ANTLR start "ATRIBUICAO"
    public final void mATRIBUICAO() throws RecognitionException {
        try {
            int _type = ATRIBUICAO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:26:12: ( 'ATRIBUICAO' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:26:14: 'ATRIBUICAO'
            {
            match("ATRIBUICAO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ATRIBUICAO"

    // $ANTLR start "PARA"
    public final void mPARA() throws RecognitionException {
        try {
            int _type = PARA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:27:6: ( 'PARA' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:27:8: 'PARA'
            {
            match("PARA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PARA"

    // $ANTLR start "CHAMADAFUNCAO"
    public final void mCHAMADAFUNCAO() throws RecognitionException {
        try {
            int _type = CHAMADAFUNCAO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:28:15: ( 'CHAMADAFUNCAO' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:28:17: 'CHAMADAFUNCAO'
            {
            match("CHAMADAFUNCAO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHAMADAFUNCAO"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:29:7: ( 'PROGRAMA' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:29:9: 'PROGRAMA'
            {
            match("PROGRAMA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:30:7: ( ';' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:30:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:31:7: ( '.' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:31:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:32:7: ( 'INTEIRO' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:32:9: 'INTEIRO'
            {
            match("INTEIRO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:33:7: ( 'STRING' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:33:9: 'STRING'
            {
            match("STRING"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:34:7: ( 'BOOLEANO' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:34:9: 'BOOLEANO'
            {
            match("BOOLEANO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:35:7: ( 'VOID' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:35:9: 'VOID'
            {
            match("VOID"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:36:7: ( ',' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:36:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:37:7: ( 'FUNCAO' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:37:9: 'FUNCAO'
            {
            match("FUNCAO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:38:7: ( '(' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:38:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:39:7: ( ')' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:39:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:40:7: ( ':' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:40:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:41:7: ( 'SAIR' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:41:9: 'SAIR'
            {
            match("SAIR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:42:7: ( '=' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:42:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:43:7: ( 'ATE' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:43:9: 'ATE'
            {
            match("ATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:44:7: ( '||' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:44:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:45:7: ( '&&' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:45:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:46:7: ( '==' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:46:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:47:7: ( '!=' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:47:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:48:7: ( '>' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:48:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:49:7: ( '<' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:49:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:50:7: ( '>=' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:50:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:51:7: ( '<=' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:51:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:52:7: ( '+' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:52:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:53:7: ( '-' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:53:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:54:7: ( '*' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:54:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:55:7: ( '/' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:55:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:56:7: ( '!' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:56:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:57:7: ( '^' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:57:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:58:7: ( 'true' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:58:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:59:7: ( 'false' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:59:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:203:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:203:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:203:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:206:5: ( ( '0' .. '9' )+ )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:206:7: ( '0' .. '9' )+
            {
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:206:7: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:206:7: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:209:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:209:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:217:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='/') ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1=='/') ) {
                    alt6=1;
                }
                else if ( (LA6_1=='*') ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:217:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 

                    // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:217:14: (~ ( '\\n' | '\\r' ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFF')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:217:14: ~ ( '\\n' | '\\r' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:217:28: ( '\\r' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='\r') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:217:28: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:218:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:218:14: ( options {greedy=false; } : . )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='*') ) {
                            int LA5_1 = input.LA(2);

                            if ( (LA5_1=='/') ) {
                                alt5=2;
                            }
                            else if ( ((LA5_1>='\u0000' && LA5_1<='.')||(LA5_1>='0' && LA5_1<='\uFFFF')) ) {
                                alt5=1;
                            }


                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<=')')||(LA5_0>='+' && LA5_0<='\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:218:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match("*/"); 

                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:222:5: ( '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"' )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:222:8: '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:222:12: ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\\') ) {
                    alt7=1;
                }
                else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:222:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 

            	    }
            	    break;
            	case 2 :
            	    // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:222:24: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:226:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:226:13: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:230:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | OCTAL_ESC )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\\') ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1=='\"'||LA8_1=='\''||LA8_1=='\\'||LA8_1=='b'||LA8_1=='f'||LA8_1=='n'||LA8_1=='r'||LA8_1=='t') ) {
                    alt8=1;
                }
                else if ( ((LA8_1>='0' && LA8_1<='7')) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:230:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:232:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:237:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\\') ) {
                int LA9_1 = input.LA(2);

                if ( ((LA9_1>='0' && LA9_1<='3')) ) {
                    int LA9_2 = input.LA(3);

                    if ( ((LA9_2>='0' && LA9_2<='7')) ) {
                        int LA9_4 = input.LA(4);

                        if ( ((LA9_4>='0' && LA9_4<='7')) ) {
                            alt9=1;
                        }
                        else {
                            alt9=2;}
                    }
                    else {
                        alt9=3;}
                }
                else if ( ((LA9_1>='4' && LA9_1<='7')) ) {
                    int LA9_3 = input.LA(3);

                    if ( ((LA9_3>='0' && LA9_3<='7')) ) {
                        alt9=2;
                    }
                    else {
                        alt9=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:237:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:237:14: ( '0' .. '3' )
                    // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:237:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:237:25: ( '0' .. '7' )
                    // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:237:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:237:36: ( '0' .. '7' )
                    // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:237:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:238:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:238:14: ( '0' .. '7' )
                    // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:238:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:238:25: ( '0' .. '7' )
                    // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:238:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:239:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:239:14: ( '0' .. '7' )
                    // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:239:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:244:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:244:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 
            match('u'); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UNICODE_ESC"

    public void mTokens() throws RecognitionException {
        // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:8: ( ENTAO | SENAO | SE | COMANDOS | VARIAVEIS | FUNCOES | LISTAPARAMETROS | TIPORETORNO | CORPOFUNCAO | LEIA | FIM | IMPRIMA | ENQUANTO | PASSO | CONDICAO | ATRIBUICAO | PARA | CHAMADAFUNCAO | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | ID | INT | WS | COMMENT | STRING )
        int alt10=54;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:10: ENTAO
                {
                mENTAO(); 

                }
                break;
            case 2 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:16: SENAO
                {
                mSENAO(); 

                }
                break;
            case 3 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:22: SE
                {
                mSE(); 

                }
                break;
            case 4 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:25: COMANDOS
                {
                mCOMANDOS(); 

                }
                break;
            case 5 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:34: VARIAVEIS
                {
                mVARIAVEIS(); 

                }
                break;
            case 6 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:44: FUNCOES
                {
                mFUNCOES(); 

                }
                break;
            case 7 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:52: LISTAPARAMETROS
                {
                mLISTAPARAMETROS(); 

                }
                break;
            case 8 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:68: TIPORETORNO
                {
                mTIPORETORNO(); 

                }
                break;
            case 9 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:80: CORPOFUNCAO
                {
                mCORPOFUNCAO(); 

                }
                break;
            case 10 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:92: LEIA
                {
                mLEIA(); 

                }
                break;
            case 11 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:97: FIM
                {
                mFIM(); 

                }
                break;
            case 12 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:101: IMPRIMA
                {
                mIMPRIMA(); 

                }
                break;
            case 13 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:109: ENQUANTO
                {
                mENQUANTO(); 

                }
                break;
            case 14 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:118: PASSO
                {
                mPASSO(); 

                }
                break;
            case 15 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:124: CONDICAO
                {
                mCONDICAO(); 

                }
                break;
            case 16 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:133: ATRIBUICAO
                {
                mATRIBUICAO(); 

                }
                break;
            case 17 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:144: PARA
                {
                mPARA(); 

                }
                break;
            case 18 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:149: CHAMADAFUNCAO
                {
                mCHAMADAFUNCAO(); 

                }
                break;
            case 19 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:163: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:169: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:175: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:181: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:187: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:193: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:199: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:205: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:211: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:217: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:223: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:229: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:235: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:241: T__44
                {
                mT__44(); 

                }
                break;
            case 33 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:247: T__45
                {
                mT__45(); 

                }
                break;
            case 34 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:253: T__46
                {
                mT__46(); 

                }
                break;
            case 35 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:259: T__47
                {
                mT__47(); 

                }
                break;
            case 36 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:265: T__48
                {
                mT__48(); 

                }
                break;
            case 37 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:271: T__49
                {
                mT__49(); 

                }
                break;
            case 38 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:277: T__50
                {
                mT__50(); 

                }
                break;
            case 39 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:283: T__51
                {
                mT__51(); 

                }
                break;
            case 40 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:289: T__52
                {
                mT__52(); 

                }
                break;
            case 41 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:295: T__53
                {
                mT__53(); 

                }
                break;
            case 42 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:301: T__54
                {
                mT__54(); 

                }
                break;
            case 43 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:307: T__55
                {
                mT__55(); 

                }
                break;
            case 44 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:313: T__56
                {
                mT__56(); 

                }
                break;
            case 45 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:319: T__57
                {
                mT__57(); 

                }
                break;
            case 46 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:325: T__58
                {
                mT__58(); 

                }
                break;
            case 47 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:331: T__59
                {
                mT__59(); 

                }
                break;
            case 48 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:337: T__60
                {
                mT__60(); 

                }
                break;
            case 49 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:343: T__61
                {
                mT__61(); 

                }
                break;
            case 50 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:349: ID
                {
                mID(); 

                }
                break;
            case 51 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:352: INT
                {
                mINT(); 

                }
                break;
            case 52 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:356: WS
                {
                mWS(); 

                }
                break;
            case 53 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:359: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 54 :
                // /Users/lailson/Documents/UFPI/Compilador/gramatica/Portugolv3.g:1:367: STRING
                {
                mSTRING(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\1\uffff\12\37\2\uffff\1\37\4\uffff\1\67\2\uffff\1\71\1\73\1\75"+
        "\3\uffff\1\77\1\uffff\2\37\4\uffff\1\37\1\105\21\37\12\uffff\5\37"+
        "\1\uffff\11\37\1\151\11\37\1\163\7\37\1\173\5\37\1\u0081\1\37\1"+
        "\uffff\1\37\1\u0085\4\37\1\u008a\2\37\1\uffff\1\37\1\u008e\1\37"+
        "\1\u0090\1\37\1\u0092\1\37\1\uffff\5\37\1\uffff\3\37\1\uffff\3\37"+
        "\1\u009f\1\uffff\3\37\1\uffff\1\u00a3\1\uffff\1\37\1\uffff\1\u00a5"+
        "\6\37\1\u00ac\4\37\1\uffff\3\37\1\uffff\1\37\1\uffff\5\37\1\u00ba"+
        "\1\uffff\2\37\1\u00bd\1\u00be\3\37\1\u00c2\1\u00c3\1\37\1\u00c5"+
        "\2\37\1\uffff\2\37\2\uffff\1\u00ca\1\37\1\u00cc\2\uffff\1\37\1\uffff"+
        "\1\37\1\u00cf\2\37\1\uffff\1\37\1\uffff\2\37\1\uffff\2\37\1\u00d7"+
        "\1\u00d8\2\37\1\u00db\2\uffff\2\37\1\uffff\1\u00de\1\37\1\uffff"+
        "\1\37\1\u00e1\1\uffff";
    static final String DFA10_eofS =
        "\u00e2\uffff";
    static final String DFA10_minS =
        "\1\11\1\116\1\101\1\110\1\101\1\111\1\105\1\111\1\115\1\101\1\124"+
        "\2\uffff\1\117\4\uffff\1\75\2\uffff\3\75\3\uffff\1\52\1\uffff\1"+
        "\162\1\141\4\uffff\1\121\1\60\1\122\1\111\1\115\1\101\1\122\1\111"+
        "\1\116\1\115\1\123\1\111\2\120\1\124\1\122\1\117\1\105\1\117\12"+
        "\uffff\1\165\1\154\1\101\1\125\1\101\1\uffff\1\111\1\122\1\101\1"+
        "\120\1\104\1\115\1\111\1\104\1\103\1\60\1\124\1\101\1\117\1\122"+
        "\1\105\1\123\1\101\1\107\1\111\1\60\1\114\1\145\1\163\1\117\1\101"+
        "\1\117\1\116\1\60\1\116\1\117\1\111\2\101\1\60\1\101\1\uffff\1\101"+
        "\1\60\1\122\2\111\1\117\1\60\1\122\1\102\1\uffff\1\105\1\60\1\145"+
        "\1\60\1\116\1\60\1\107\1\uffff\1\104\1\106\1\103\1\104\1\126\1\uffff"+
        "\1\105\1\117\1\120\1\uffff\1\105\1\115\1\122\1\60\1\uffff\1\101"+
        "\1\125\1\101\1\uffff\1\60\1\uffff\1\124\1\uffff\1\60\1\117\1\125"+
        "\2\101\1\105\1\123\1\60\1\101\1\124\1\101\1\117\1\uffff\1\115\1"+
        "\111\1\116\1\uffff\1\117\1\uffff\1\123\1\116\1\117\1\106\1\111\1"+
        "\60\1\uffff\1\122\1\117\2\60\1\101\1\103\1\117\2\60\1\103\1\60\1"+
        "\125\1\123\1\uffff\1\101\1\122\2\uffff\1\60\1\101\1\60\2\uffff\1"+
        "\101\1\uffff\1\116\1\60\1\115\1\116\1\uffff\1\117\1\uffff\1\117"+
        "\1\103\1\uffff\1\105\1\117\2\60\1\101\1\124\1\60\2\uffff\1\117\1"+
        "\122\1\uffff\1\60\1\117\1\uffff\1\123\1\60\1\uffff";
    static final String DFA10_maxS =
        "\1\174\1\116\1\124\2\117\1\125\2\111\1\116\1\122\1\124\2\uffff\1"+
        "\117\4\uffff\1\75\2\uffff\3\75\3\uffff\1\57\1\uffff\1\162\1\141"+
        "\4\uffff\1\124\1\172\1\122\1\111\1\122\1\101\1\122\1\111\1\116\1"+
        "\115\1\123\1\111\2\120\1\124\1\123\1\117\1\122\1\117\12\uffff\1"+
        "\165\1\154\1\101\1\125\1\101\1\uffff\1\111\1\122\1\101\1\120\1\104"+
        "\1\115\1\111\1\104\1\103\1\172\1\124\1\101\1\117\1\122\1\105\1\123"+
        "\1\101\1\107\1\111\1\172\1\114\1\145\1\163\1\117\1\101\1\117\1\116"+
        "\1\172\1\116\1\117\1\111\2\101\1\172\1\117\1\uffff\1\101\1\172\1"+
        "\122\2\111\1\117\1\172\1\122\1\102\1\uffff\1\105\1\172\1\145\1\172"+
        "\1\116\1\172\1\107\1\uffff\1\104\1\106\1\103\1\104\1\126\1\uffff"+
        "\1\105\1\117\1\120\1\uffff\1\105\1\115\1\122\1\172\1\uffff\1\101"+
        "\1\125\1\101\1\uffff\1\172\1\uffff\1\124\1\uffff\1\172\1\117\1\125"+
        "\2\101\1\105\1\123\1\172\1\101\1\124\1\101\1\117\1\uffff\1\115\1"+
        "\111\1\116\1\uffff\1\117\1\uffff\1\123\1\116\1\117\1\106\1\111\1"+
        "\172\1\uffff\1\122\1\117\2\172\1\101\1\103\1\117\2\172\1\103\1\172"+
        "\1\125\1\123\1\uffff\1\101\1\122\2\uffff\1\172\1\101\1\172\2\uffff"+
        "\1\101\1\uffff\1\116\1\172\1\115\1\116\1\uffff\1\117\1\uffff\1\117"+
        "\1\103\1\uffff\1\105\1\117\2\172\1\101\1\124\1\172\2\uffff\1\117"+
        "\1\122\1\uffff\1\172\1\117\1\uffff\1\123\1\172\1\uffff";
    static final String DFA10_acceptS =
        "\13\uffff\1\24\1\25\1\uffff\1\32\1\34\1\35\1\36\1\uffff\1\42\1\43"+
        "\3\uffff\1\52\1\53\1\54\1\uffff\1\57\2\uffff\1\62\1\63\1\64\1\66"+
        "\23\uffff\1\44\1\40\1\45\1\56\1\50\1\46\1\51\1\47\1\65\1\55\5\uffff"+
        "\1\3\43\uffff\1\13\11\uffff\1\41\7\uffff\1\37\5\uffff\1\31\3\uffff"+
        "\1\12\4\uffff\1\21\3\uffff\1\60\1\uffff\1\1\1\uffff\1\2\14\uffff"+
        "\1\16\3\uffff\1\61\1\uffff\1\27\6\uffff\1\33\15\uffff\1\6\2\uffff"+
        "\1\14\1\26\3\uffff\1\15\1\4\1\uffff\1\17\4\uffff\1\23\1\uffff\1"+
        "\30\2\uffff\1\5\7\uffff\1\20\1\11\2\uffff\1\10\2\uffff\1\22\2\uffff"+
        "\1\7";
    static final String DFA10_specialS =
        "\u00e2\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\41\2\uffff\1\41\22\uffff\1\41\1\25\1\42\3\uffff\1\24\1\uffff"+
            "\1\17\1\20\1\32\1\30\1\16\1\31\1\14\1\33\12\40\1\21\1\13\1\27"+
            "\1\22\1\26\2\uffff\1\12\1\15\1\3\1\37\1\1\1\5\2\37\1\10\2\37"+
            "\1\6\3\37\1\11\2\37\1\2\1\7\1\37\1\4\4\37\3\uffff\1\34\1\37"+
            "\1\uffff\5\37\1\36\15\37\1\35\6\37\1\uffff\1\23",
            "\1\43",
            "\1\46\3\uffff\1\44\16\uffff\1\45",
            "\1\50\6\uffff\1\47",
            "\1\51\15\uffff\1\52",
            "\1\54\13\uffff\1\53",
            "\1\56\3\uffff\1\55",
            "\1\57",
            "\1\60\1\61",
            "\1\62\20\uffff\1\63",
            "\1\64",
            "",
            "",
            "\1\65",
            "",
            "",
            "",
            "",
            "\1\66",
            "",
            "",
            "\1\70",
            "\1\72",
            "\1\74",
            "",
            "",
            "",
            "\1\76\4\uffff\1\76",
            "",
            "\1\100",
            "\1\101",
            "",
            "",
            "",
            "",
            "\1\103\2\uffff\1\102",
            "\12\37\7\uffff\15\37\1\104\14\37\4\uffff\1\37\1\uffff\32\37",
            "\1\106",
            "\1\107",
            "\1\110\1\112\3\uffff\1\111",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\126\1\125",
            "\1\127",
            "\1\131\14\uffff\1\130",
            "\1\132",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u0083\15\uffff\1\u0082",
            "",
            "\1\u0084",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u008b",
            "\1\u008c",
            "",
            "\1\u008d",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u008f",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u0091",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u0093",
            "",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\u00a4",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "",
            "\1\u00b4",
            "",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\u00bb",
            "\1\u00bc",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00c4",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00c6",
            "\1\u00c7",
            "",
            "\1\u00c8",
            "\1\u00c9",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00cb",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\1\u00cd",
            "",
            "\1\u00ce",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00d0",
            "\1\u00d1",
            "",
            "\1\u00d2",
            "",
            "\1\u00d3",
            "\1\u00d4",
            "",
            "\1\u00d5",
            "\1\u00d6",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00d9",
            "\1\u00da",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\1\u00dc",
            "\1\u00dd",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00df",
            "",
            "\1\u00e0",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( ENTAO | SENAO | SE | COMANDOS | VARIAVEIS | FUNCOES | LISTAPARAMETROS | TIPORETORNO | CORPOFUNCAO | LEIA | FIM | IMPRIMA | ENQUANTO | PASSO | CONDICAO | ATRIBUICAO | PARA | CHAMADAFUNCAO | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | ID | INT | WS | COMMENT | STRING );";
        }
    }
 

}
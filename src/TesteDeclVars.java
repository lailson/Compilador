import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import Gramatica.ANTLRNoCaseFileStream;
import Gramatica.Portugolv3Lexer;
import Gramatica.Portugolv3Parser;
import Gramatica.Simbolo;


public class TesteDeclVars {

    public static void main(String args[]) throws IOException {
        
        Portugolv3Lexer lex;

        ANTLRNoCaseFileStream entrada = new ANTLRNoCaseFileStream("TesteDeclVars.txt", "UTF8");
        //ANTLRInputStream entrada = new ANTLRInputStream(System.in);
        lex = new Portugolv3Lexer(entrada);

        CommonTokenStream tokens = new CommonTokenStream(lex);
        Portugolv3Parser g = new Portugolv3Parser(tokens);
        
        try {
            Portugolv3Parser.prog_return resultado = g.prog();
            HashMap<String, Simbolo> tabelaSimbolos = g.tabelaSimbolos;
            System.out.println(tabelaSimbolos.toString());
            
            System.out.println("\n\nGramatica analisada e sem erros...");
        } catch (RecognitionException ex) {
            
        }
                
            
        
        
    }
}
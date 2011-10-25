//import java.io.*;
//import org.antlr.runtime.*;
//import org.antlr.runtime.debug.DebugEventSocketProxy;
//
//import Gramatica.*;
//
//
//public class __Test__ {
//
//    public static void main(String args[]) throws Exception {
//        Portugolv3Lexer lex = new Portugolv3Lexer(new ANTLRFileStream("/Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/output/__Test___input.txt", "UTF8"));
//        CommonTokenStream tokens = new CommonTokenStream(lex);
//
//        Portugolv3Parser g = new Portugolv3Parser(tokens, 49100, null);
//        try {
//            g.prog();
//        } catch (RecognitionException e) {
//            e.printStackTrace();
//        }
//    }
//}
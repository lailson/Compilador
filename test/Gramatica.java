/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.RecognitionException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Gramatica.*;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;

/**
 *
 * @author lailson
 */
public class Gramatica {
    
    public Gramatica() {
    }

//    @BeforeClass
//    public static void setUpClass() throws Exception {
//    }
//
//    @AfterClass
//    public static void tearDownClass() throws Exception {
//    }
//    
//    @Before
//    public void setUp() {
//    }
    
    @Test
    public void testarGramatica() throws IOException, RecognitionException {
        //Portugolv3Lexer lex;

        Portugolv3Lexer lex = new Portugolv3Lexer(new ANTLRFileStream("/Volumes/Lailson HD/Users/lailson/NetBeansProjects/Compilador/src/gramatica/output/__Test___input.txt", "UTF8"));
        //ANTLRInputStream entrada = new ANTLRInputStream(System.in);
        //lex = new Portugolv3Lexer(entrada);

        CommonTokenStream tokens = new CommonTokenStream(lex);
        Portugolv3Parser g = new Portugolv3Parser(tokens);
        
        g.prog();
    }
    
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}

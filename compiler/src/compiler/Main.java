package compiler;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import pdl.*;

public class Main {

	public static void main(String[] args) throws Exception {

        String inputFile = "./ifelse.pdl";
        InputStream is = System.in;

        if (inputFile != null) {
            System.out.println("// source file is "+ inputFile);
            is = new FileInputStream(inputFile);

            ANTLRInputStream input = new ANTLRInputStream(is);

            pdlLexer lexer = new pdlLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            pdlParser parser = new pdlParser(tokens);

            ParseTree tree = parser.program();
            Worker worker = new Worker();

            ParseTreeWalker walker = new ParseTreeWalker(); 
            walker.walk(worker, tree);
            //System.out.println(worker.toString());
            
            FileWriter writer = new FileWriter("output.js");
            writer.write(worker.toString());
            writer.close();

        } else {
            System.out.println("Usage: java pdl.pdl <source>");
        }


	}

}

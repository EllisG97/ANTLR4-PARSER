package generator;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import assignmentLexPar.*;


public class Main {
	
	

 static String inputFile = "";
 static InputStream is = System.in;

  
	public static void main(String[] args) throws Exception {

	
		changeExampleProgram();
		
		//do {
		try {
			File file = new File("german.xml");
			System.out.println(file);
			DocumentBuilder dBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document doc = dBuilder.parse(file);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

			
			
			System.out.println("Enter an element to be found (input q to quit)");
			Scanner reader = new Scanner(System.in);
		    String element = reader.next();
		    boolean notFound = true;
			
			
			
			
				
            //while (element != "Q" | element != "q") {
			NodeList nList = doc.getElementsByTagName(element);

			for (int i = 0; i < nList.getLength(); i++) {
				Node nNode = nList.item(i);
				System.out.println("\nCurrent Element :" + nNode.getNodeName());

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					System.out.println("Element is type: " + eElement.getNodeType());

					Node child = eElement.getFirstChild();;
					System.out.println("\t\n" + child.getTextContent());
					if (nNode != null) notFound = false;
					                       
					
				     for (int j = 0; j < eElement.getChildNodes().getLength(); j++)
	                    {
	                    	Node children = eElement.getChildNodes().item(j);
	                    	System.out.print("the sub tree is as follows: " + children.getTextContent() + "\n");
	                    }
				     
				     
	                }

				
				 
				
			reader.close();


				} // if
			if (notFound == true) System.out.println("\n no result matching your search criteria were found");
			} // for
			
			
		catch (Exception e) {
            e.printStackTrace();
        }
		
	//	}while(element != "q" | element != "Q");
	
			
	            	
	            	
	                
	                System.out.println("\nEnd of program");
	                
	         
	               
	            }
		
	
	

public static void changeExampleProgram()
{
	int response = 0;
	boolean validResponse = false;
	Scanner in = new Scanner(System.in);
	do {
    	System.out.println("Which program would you like to run? (1, 2 or 3)");
    	response = in.nextInt();
    	switch(response)
    	{
    	case 1:
    		inputFile = "./helloWorld.txt";
    		validResponse = true;
    		break;
    	case 2:
    		inputFile = "./simpleMaths.txt";
    		validResponse = true;
    		break;
    	case 3:
    		inputFile = "./calculations.txt";
    		validResponse = true;
    		break;
    	default:
    		System.out.println("Invalid input, please try again.");
    	}
	} while (validResponse == false);
	if (inputFile != null) {
        System.out.println("// source file is "+ inputFile + "\n");
        try {
        	InputStream is = System.in;

				if (inputFile != null) {
					System.out.println(" source file is " + inputFile);
					is = new FileInputStream(inputFile);
        }
        	

	
			try {
				
					ANTLRInputStream input = new ANTLRInputStream(is);

					foplGramLexer lexer = new foplGramLexer(input);
					CommonTokenStream tokens = new CommonTokenStream(lexer);
					foplGramParser parser = new foplGramParser(tokens);

					ParseTree tree = parser.prog();
					TreeWalkerWorker worker = new TreeWalkerWorker();
					JsWorker jsWorker = new JsWorker();

					ParseTreeWalker walker = new ParseTreeWalker();
					walker.walk(worker, tree);
					// System.out.println(worker.toString());
					System.out.println();

					FileWriter writer = new FileWriter("german.xml");
					writer.write(worker.sb.toString());
					writer.close();
					
					
					
					
					
					walker.walk(jsWorker, tree);
					FileWriter JSwriter = new FileWriter("assignment.js");
		            JSwriter.write(jsWorker.stringBuild.toString());
		            JSwriter.close();
		            
		            	//System.out.println(tree.toStringTree(parser));
		            
					System.out.println(worker.sb);
					System.out.println(jsWorker.stringBuild);
					
					
					File jsFile = new File("assignment.js");
					System.out.println(jsFile);
		            
			}catch (IOException e) {
				e.printStackTrace();
			}
		           	
					
			} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
			
		} 
	} 
	
	{
         System.out.println("Usage: java <source>");
     }
}

            

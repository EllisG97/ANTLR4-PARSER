package generator;

import java.util.ArrayDeque;
import org.stringtemplate.v4.*;



import java.io.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.*;
import java.util.List;
import java.util.ArrayList;
import assignmentLexPar.*;











public class JsWorker extends foplGramBaseListener {

	StringBuilder stringBuild = new StringBuilder();
	STGroup stg = new STGroupFile("./German.stg");
	String programName;

	
	   
    @Override
    public void enterFuncDeclare(foplGramParser.FuncDeclareContext ctx) { 
    	String varName = ctx.getChild(1).getText();
        ST st = stg.getInstanceOf("enterProgram");
        st.add("v", varName);
        stringBuild.append("\n" + st.render().trim());
    }
    
    @Override
    public void exitFuncDeclare(foplGramParser.FuncDeclareContext ctx) { 
        stringBuild.append("\n}\n");
    }

    @Override
    public void exitGlobals(foplGramParser.GlobalsContext ctx) { 
        ST st = stg.getInstanceOf("globals");
        st.add("values", ctx.getChild(1));
        stringBuild.append(st.render());
    }


    @Override
    public void exitOutput(foplGramParser.OutputContext ctx) {
        ArrayList<String> valueNames = new ArrayList<String>();

        for(int i=0; i<ctx.getChild(1).getChildCount(); i++)
        valueNames.add(ctx.getChild(1).getChild(i).getText().replaceAll("#", "\""));
        ST st = stg.getInstanceOf("output");
        st.add("v", valueNames);
        stringBuild.append("\n" + st.render());
   }
    
    @Override
    public void exitVarDec(foplGramParser.VarDecContext ctx) { 
    	String varName = ctx.getChild(1).getText();
        ST st = stg.getInstanceOf("varDec");
        st.add("values", varName);
        stringBuild.append("\n" + st.render().trim());
    }
    

    
    @Override
    public void exitRtn(foplGramParser.RtnContext ctx) { 
    	String varName = ctx.getChild(1).getText();
        ST st = stg.getInstanceOf("return");
        st.add("v", varName);
        stringBuild.append("\n" + st.render().trim());
    }

   @Override 
    public void exitInput(foplGramParser.InputContext ctx) { 
        String varName = ctx.getChild(1).getText();
        ST st = stg.getInstanceOf("input");
        st.add("v", varName);
        stringBuild.append("\n" + st.render().trim());
}


  
   public void enterArrayAssign(foplGramParser.ArrayAssignContext ctx) { 
       ST st = stg.getInstanceOf("arrayAssignment");
       st.add("operand1", ctx.getChild(0).getText());
       st.add("index", ctx.getChild(2).getText());
       st.add("value", ctx.getChild(4).getText());
       stringBuild.append("\n" + st.render().trim());
   }

   @Override
   public void enterArrayDec(foplGramParser.ArrayDecContext ctx) { 
   	String varName = ctx.getChild(1).getText();
       ST st = stg.getInstanceOf("arrayDec");
       st.add("operand", varName);
       stringBuild.append("\n" + st.render().trim());
   }
    
     

    @Override 
    public void enterIfState(foplGramParser.IfStateContext ctx) { 
        String comp = ctx.getChild(1).getChild(1).getText();
        if (comp.compareTo("^") == 0) comp = "<";
        else if (comp.compareTo("^=") == 0) comp = "<=";
        else if (comp.compareTo("=$") == 0) comp = ">=";
        else if (comp.compareTo("$") == 0) comp = ">";
        ST st = stg.getInstanceOf("ifClause");
        st.add("operand1", ctx.getChild(1).getChild(0).getText());
        st.add("comparator", comp);
        st.add("operand2", ctx.getChild(1).getChild(2).getText());
        stringBuild.append("\n" + st.render().trim());
    }


    @Override 
    public void enterWhileLoop(foplGramParser.WhileLoopContext ctx) { 
    	String comp = ctx.getChild(1).getChild(1).getText();
        if (comp.compareTo("^") == 0) comp = "<";
        else if (comp.compareTo("^=") == 0) comp = "<=";
        else if (comp.compareTo("=$") == 0) comp = ">=";
        else if (comp.compareTo("$") == 0) comp = ">";
        ST st = stg.getInstanceOf("whileLoop");
        st.add("operand1", ctx.getChild(1).getChild(0).getText());
        st.add("comparator", comp);
        st.add("operand2", ctx.getChild(1).getChild(2).getText());
        stringBuild.append("\n" + st.render().trim());
    }
    
 
   

    @Override public void enterElseState(foplGramParser.ElseStateContext ctx) { 
        ST st = stg.getInstanceOf("elseClause");
        stringBuild.append("\n" + st.render().trim());
    }
    
    public void enterElseif(foplGramParser.ElseifContext ctx) { 
   	 String comp = ctx.getChild(1).getChild(1).getText();   
   	 if (comp.compareTo("=~") == 0) comp = ">=";
     else if (comp.compareTo("~") == 0) comp = ">";
   	 else if (comp.compareTo("^") == 0) comp = "<";
     else if (comp.compareTo("^=") == 0) comp = "<=";
      
        ST st = stg.getInstanceOf("ifClause");
        stringBuild.append("\nelse ");
        st.add("operand1", ctx.getChild(1).getChild(0).getText());
        st.add("comparator", comp);
        st.add("operand2", ctx.getChild(1).getChild(2).getText());
        stringBuild.append(st.render().trim());
   }
    
 public void enterAssignment(foplGramParser.AssignmentContext ctx) { 
    	ST st;
    	if (ctx.getChildCount() < 5)
    	{
    		st = stg.getInstanceOf("singleAssignment");
            st.add("operand1", ctx.getChild(0).getText());
            st.add("value", ctx.getChild(2).getText());
    	}
    	else {
    		st = stg.getInstanceOf("doubleAssignment");
            st.add("operand1", ctx.getChild(0).getText());
            st.add("value1", ctx.getChild(2).getText());
            st.add("operator", ctx.getChild(3).getText());
            st.add("value2", ctx.getChild(4).getText());
    	}
        
        stringBuild.append("\n" + st.render().trim());
    }

    @Override 
    public void exitElseif(foplGramParser.ElseifContext ctx) { stringBuild.append("\n}"); }
    @Override 
    public void exitIfState(foplGramParser.IfStateContext ctx) { stringBuild.append("\n}"); }
    @Override 
    public void exitElseState(foplGramParser.ElseStateContext ctx) { stringBuild.append("\n}"); }
    @Override 
    public void exitWhileLoop(foplGramParser.WhileLoopContext ctx) { stringBuild.append("\n}"); }

    public String toString() { return stringBuild.toString(); }



} // class worker

package compiler;

import org.stringtemplate.v4.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.ArrayList;

import pdl.*;

public class Worker extends pdlBaseListener {
    
	StringBuilder sb = new StringBuilder();
	STGroup stg = new STGroupFile("./pdl.stg"); 
	String programName;

	@Override
	public void exitGlobals(pdlParser.GlobalsContext ctx) { 
		List<ParseTree> values = ctx.children;
		ArrayList<String> valueNames = new ArrayList<String>();

		for(int i=1; i<ctx.getChildCount(); i+=2)
			valueNames.add(values.get(i).getText());

		ST st = stg.getInstanceOf("globals");
		st.add("values", valueNames);
		sb.append(st.render());
	}


	@Override 
    public void enterProgramHeader(pdlParser.ProgramHeaderContext ctx) { 
        //System.out.println("enter program "+ ctx.getChild(1).getText());
    	programName= ctx.getChild(1).getText();
    	ST st = stg.getInstanceOf("enterProgram");
    	st.add("v", programName);
    	sb.append(st.render());
    }
    

    @Override 
    public void exitProgram(pdlParser.ProgramContext ctx) { 
		ST st = stg.getInstanceOf("exitProgram");
    	st.add("v", programName);
    	sb.append(st.render());
    }


    @Override
    public void exitOutputStatement(pdlParser.OutputStatementContext ctx) {
		List<ParseTree> values = ctx.children;
		ArrayList<String> valueNames = new ArrayList<String>();

		for(int i=2; i<ctx.getChildCount(); i+=2)
			valueNames.add(values.get(i).getText());
    	ST st = stg.getInstanceOf("output");
    	st.add("v", valueNames);
    	sb.append(st.render());
    }


	@Override 
	public void enterProcedureCall(pdlParser.ProcedureCallContext ctx) { 
		String procName = ctx.getChild(1).getText();

		List<ParseTree> values = ctx.children;
		ArrayList<String> params = new ArrayList<String>();
		ST st = stg.getInstanceOf("procCall");

		for(int i=3; i<ctx.getChildCount(); i+=2)
			params.add(values.get(i).getText());

     	st.add("v", procName);
     	st.add("values", params);
     	sb.append(st.render());
	}


	@Override 
	public void enterInputStatement(pdlParser.InputStatementContext ctx) { 
		String varName = ctx.getChild(2).getText();
		ST st = stg.getInstanceOf("input");
		st.add("v", varName);
		sb.append(st.render());
	}


    @Override 
    public void enterExpr(pdlParser.ExprContext ctx) { 
        ST st = stg.getInstanceOf("expr");
        int type = ctx.getChildCount();
        if (type > 1) {
            st.add("i", ctx.getChild(1).getText());
            st.add("m", ctx.getChild(2).getText());
            st.add("v", ctx.getChild(3).getText());
        } else {
            st.add("v", ctx.getText());
        }
        sb.append(st.render().trim());
    }


    @Override
    public void enterAssignment(pdlParser.AssignmentContext ctx) { 
        ST st = stg.getInstanceOf("assignment");
        st.add("ident", ctx.getChild(1).getText());

        sb.append(st.render().trim() + " ");
    }


    @Override 
    public void enterIfElse(pdlParser.IfElseContext ctx) { 
        String comp = ctx.getChild(3).getText();
        if (comp.compareTo("=") == 0) comp = "==";

        ST st = stg.getInstanceOf("ifClause");
        st.add("operand1", ctx.getChild(2).getText());
        st.add("comparator", comp);
        st.add("operand2", ctx.getChild(4).getText());

        sb.append(st.render().trim());
    }


    @Override 
    public void enterProcDefun(pdlParser.ProcDefunContext ctx) { 
        ST st = stg.getInstanceOf("enterProcedure");
        st.add("v", ctx.getChild(1).getText());
        sb.append(st.render().trim());
    }


    @Override 
    public void enterWhileLoop(pdlParser.WhileLoopContext ctx) { 
        String comp = ctx.getChild(3).getText();
        if (comp.compareTo("=") == 0) comp = "==";

        ST st = stg.getInstanceOf("whileLoop");
        st.add("operand1", ctx.getChild(2).getText());
        st.add("comparator", comp);
        st.add("operand2", ctx.getChild(4).getText()); 
        
        sb.append(st.render().trim());
    }


    @Override public void enterElseBlock(pdlParser.ElseBlockContext ctx) { 
        ST st = stg.getInstanceOf("elseClause");
        sb.append(st.render().trim());
    }



    //@Override 
    //public void exitElseBlock(pdlParser.ElseBlockContext ctx) { sb.append("}"); }
    @Override 
    public void exitIfElse(pdlParser.IfElseContext ctx) { sb.append(" }"); }
    @Override 
    public void exitWhileLoop(pdlParser.WhileLoopContext ctx) { sb.append("}"); }
    @Override 
    public void exitProcDefun(pdlParser.ProcDefunContext ctx) { sb.append("}"); }
    @Override
    public void exitAssignment(pdlParser.AssignmentContext ctx) { sb.append(" ;"); }

    public String toString() { return sb.toString(); }

} // class Worker
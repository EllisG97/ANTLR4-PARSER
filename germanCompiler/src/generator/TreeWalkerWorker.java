package generator;

import assignmentLexPar.foplGramParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import assignmentLexPar.*;

public class TreeWalkerWorker extends foplGramBaseListener {

	int tabCount = 0;

	public String tabFormat() {

		String temp = "";
		for (int i = 0; i < tabCount; i++)
			temp = temp + "\t";
		return temp;

	}

	StringBuilder sb = new StringBuilder();
	STGroup stg = new STGroupFile("./German.stg");
	String programName;

	@Override
	public void enterOutput(foplGramParser.OutputContext ctx) {
		sb.append("<output>");
		for (int i = 0; i < ctx.getChildCount(); i++) {

			sb.append(ctx.getChild(i).getText() + " ");

		}
		
	}

	@Override
	public void exitOutput(foplGramParser.OutputContext ctx) {
		--tabCount;
		sb.append("</output>" + "\n");
	}

	@Override
	public void enterInput(foplGramParser.InputContext ctx) {
		sb.append("<input>");
		for (int i = 0; i < ctx.getChildCount(); i++) {

			sb.append(ctx.getChild(i).getText() + " ");

		}
	}

	@Override
	public void exitInput(foplGramParser.InputContext ctx) {
		sb.append("</input>" + "\n");
	}


	@Override
	public void enterWhileLoop(foplGramParser.WhileLoopContext ctx) {
		sb.append("<whileLoop");
	}

	@Override
	public void exitWhileLoop(foplGramParser.WhileLoopContext ctx) {
		sb.append("</whileLoop");
	}

	@Override
	public void enterForLoop(foplGramParser.ForLoopContext ctx) {
		sb.append("<forLoop>");
	}

	@Override
	public void exitForLoop(foplGramParser.ForLoopContext ctx) {
		sb.append("</forLoop>");
	}

	@Override
	public void enterIfState(foplGramParser.IfStateContext ctx) {
		sb.append("<ifState>");
		
		for (int i = 0; i < ctx.getChildCount(); i++) {

            sb.append(ctx.getChild(i).getText());

        }
	}

	@Override
	public void exitIfState(foplGramParser.IfStateContext ctx) {
		sb.append("</ifState>");
	}

	@Override
	public void enterElseif(foplGramParser.ElseifContext ctx) {
		sb.append("<elseIf>");
	}

	@Override
	public void exitElseif(foplGramParser.ElseifContext ctx) {
		sb.append("</elseIf>");
	}

	@Override
	public void enterElseState(foplGramParser.ElseStateContext ctx) {
		  sb.append("\n" + "<elseif>");
	        for(int i=0; i<ctx.getChildCount(); i++) 
	        {
	        	if (ctx.getChild(i).getText().contains("("))
	        	{
	        		sb.append("\n" +  ctx.getChild(i).getText());
	        		break;
	        	}
	        	else {
	        		sb.append(ctx.getChild(i).getText() + " ");
	        	}
	        		
	        };
	}

	@Override
	public void exitElseState(foplGramParser.ElseStateContext ctx) {
		sb.append("</elseif>");
	}


	@Override
	public void enterStatement(foplGramParser.StatementContext ctx) {
		sb.append("\n" + "<statement>");
	}

	@Override
	public void exitStatement(foplGramParser.StatementContext ctx) {
		sb.append("</statement>");
	}

	@Override
	public void enterProg(foplGramParser.ProgContext ctx) {

		sb.append("<program>" + "\n");

	}

	@Override
	public void exitProg(foplGramParser.ProgContext ctx) {
		sb.append("\n" + "</program>");
	}

	@Override
	public void enterString(foplGramParser.StringContext ctx) {
		sb.append("<string>");
		for (int i = 0; i < ctx.getChildCount(); i++) {

            sb.append(ctx.getChild(i).getText());

        }
	}

	@Override
	public void exitString(foplGramParser.StringContext ctx) {
		sb.append("</string>");
	}

	@Override
	public void enterValue(foplGramParser.ValueContext ctx) {
		sb.append("<value>");

		for (int i = 0; i < ctx.getChildCount(); i++) {

			sb.append(ctx.getChild(i).getText() + "  ");

		}

	}

	@Override
	public void exitValue(foplGramParser.ValueContext ctx) {
		sb.append("</value>");
	}

	@Override
	public void enterRtn(foplGramParser.RtnContext ctx) {
		sb.append("<ret>");

		sb.append("return ");

	}

	@Override
	public void exitRtn(foplGramParser.RtnContext ctx) {
		sb.append("</ret>" + "\n");
	}

	@Override
	public void enterGlobals(foplGramParser.GlobalsContext ctx) {
		sb.append("<globals>");
		
		for (int i = 0; i < ctx.getChildCount(); i++) {
		
		sb.append(ctx.getChild(i).getText() + " ");
		}
		
		
	}

	@Override
	public void exitGlobals(foplGramParser.GlobalsContext ctx) {
		sb.append("</globals>");
	}

	@Override
	public void enterFuncDeclare(foplGramParser.FuncDeclareContext ctx) {

		sb.append("\n" + "<funcDeclare>");
		boolean isFin = false;
		for (int i = 0; i < ctx.getChildCount(); i++) {
			if (isFin == false) {

				sb.append(ctx.getChild(i).getText() + " ");

			}
			if (ctx.getChild(i).getText().contains(")")) {
				tabCount++;
				isFin = true;
			}

		}

	}

	@Override
	public void exitFuncDeclare(foplGramParser.FuncDeclareContext ctx) {

		sb.append("</funcDeclare>" + "\n");
	}

	@Override
	public void enterFuncCall(foplGramParser.FuncCallContext ctx) {
		sb.append("funcCall>");

	}

	@Override
	public void exitFuncCall(foplGramParser.FuncCallContext ctx) {
		sb.append("/funcCall>");
	}

	@Override
	public void enterVarDec(foplGramParser.VarDecContext ctx) {
		sb.append("<varDec>");

		boolean isFin = false;
		for (int i = 0; i < ctx.getChildCount(); i++) {
			if (isFin == false) {

				sb.append(ctx.getChild(i).getText() + " ");

			}
			if (ctx.getChild(i).getText().contains(">")) {
				isFin = true;
			}
		}
	}

	@Override
	public void exitVarDec(foplGramParser.VarDecContext ctx) {
		sb.append("</varDec>");
		tabCount--;

	}

	@Override
	public void enterComparison(foplGramParser.ComparisonContext ctx) {
		sb.append("<comparison>");
		
		
		for (int i = 0; i < ctx.getChildCount(); i++) {
		
		sb.append(ctx.getChild(i).getText() + " ");
		}
		
	}

	@Override
	public void exitComparison(foplGramParser.ComparisonContext ctx) {
		sb.append("</comparison>");
	}

}

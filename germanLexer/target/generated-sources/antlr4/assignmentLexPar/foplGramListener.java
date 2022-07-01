// Generated from foplGram.g4 by ANTLR 4.4

package assignmentLexPar;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link foplGramParser}.
 */
public interface foplGramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link foplGramParser#arrayMid}.
	 * @param ctx the parse tree
	 */
	void enterArrayMid(@NotNull foplGramParser.ArrayMidContext ctx);
	/**
	 * Exit a parse tree produced by {@link foplGramParser#arrayMid}.
	 * @param ctx the parse tree
	 */
	void exitArrayMid(@NotNull foplGramParser.ArrayMidContext ctx);
	/**
	 * Enter a parse tree produced by {@link foplGramParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(@NotNull foplGramParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link foplGramParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(@NotNull foplGramParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link foplGramParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(@NotNull foplGramParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link foplGramParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(@NotNull foplGramParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link foplGramParser#def}.
	 * @param ctx the parse tree
	 */
	void enterDef(@NotNull foplGramParser.DefContext ctx);
	/**
	 * Exit a parse tree produced by {@link foplGramParser#def}.
	 * @param ctx the parse tree
	 */
	void exitDef(@NotNull foplGramParser.DefContext ctx);
	/**
	 * Enter a parse tree produced by {@link foplGramParser#arrayDec}.
	 * @param ctx the parse tree
	 */
	void enterArrayDec(@NotNull foplGramParser.ArrayDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link foplGramParser#arrayDec}.
	 * @param ctx the parse tree
	 */
	void exitArrayDec(@NotNull foplGramParser.ArrayDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link foplGramParser#arrayAssign}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssign(@NotNull foplGramParser.ArrayAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link foplGramParser#arrayAssign}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssign(@NotNull foplGramParser.ArrayAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link foplGramParser#globals}.
	 * @param ctx the parse tree
	 */
	void enterGlobals(@NotNull foplGramParser.GlobalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link foplGramParser#globals}.
	 * @param ctx the parse tree
	 */
	void exitGlobals(@NotNull foplGramParser.GlobalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link foplGramParser#routeCaseroute}.
	 * @param ctx the parse tree
	 */
	void enterRouteCaseroute(@NotNull foplGramParser.RouteCaserouteContext ctx);
	/**
	 * Exit a parse tree produced by {@link foplGramParser#routeCaseroute}.
	 * @param ctx the parse tree
	 */
	void exitRouteCaseroute(@NotNull foplGramParser.RouteCaserouteContext ctx);
	/**
	 * Enter a parse tree produced by {@link foplGramParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(@NotNull foplGramParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link foplGramParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(@NotNull foplGramParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link foplGramParser#funcDeclare}.
	 * @param ctx the parse tree
	 */
	void enterFuncDeclare(@NotNull foplGramParser.FuncDeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link foplGramParser#funcDeclare}.
	 * @param ctx the parse tree
	 */
	void exitFuncDeclare(@NotNull foplGramParser.FuncDeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link foplGramParser#elseState}.
	 * @param ctx the parse tree
	 */
	void enterElseState(@NotNull foplGramParser.ElseStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link foplGramParser#elseState}.
	 * @param ctx the parse tree
	 */
	void exitElseState(@NotNull foplGramParser.ElseStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link foplGramParser#elseif}.
	 * @param ctx the parse tree
	 */
	void enterElseif(@NotNull foplGramParser.ElseifContext ctx);
	/**
	 * Exit a parse tree produced by {@link foplGramParser#elseif}.
	 * @param ctx the parse tree
	 */
	void exitElseif(@NotNull foplGramParser.ElseifContext ctx);
	/**
	 * Enter a parse tree produced by {@link foplGramParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull foplGramParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link foplGramParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull foplGramParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link foplGramParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull foplGramParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link foplGramParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull foplGramParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link foplGramParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(@NotNull foplGramParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link foplGramParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(@NotNull foplGramParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link foplGramParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(@NotNull foplGramParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link foplGramParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(@NotNull foplGramParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link foplGramParser#rCase}.
	 * @param ctx the parse tree
	 */
	void enterRCase(@NotNull foplGramParser.RCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link foplGramParser#rCase}.
	 * @param ctx the parse tree
	 */
	void exitRCase(@NotNull foplGramParser.RCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link foplGramParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull foplGramParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link foplGramParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull foplGramParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link foplGramParser#rtn}.
	 * @param ctx the parse tree
	 */
	void enterRtn(@NotNull foplGramParser.RtnContext ctx);
	/**
	 * Exit a parse tree produced by {@link foplGramParser#rtn}.
	 * @param ctx the parse tree
	 */
	void exitRtn(@NotNull foplGramParser.RtnContext ctx);
	/**
	 * Enter a parse tree produced by {@link foplGramParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull foplGramParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link foplGramParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull foplGramParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link foplGramParser#ifState}.
	 * @param ctx the parse tree
	 */
	void enterIfState(@NotNull foplGramParser.IfStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link foplGramParser#ifState}.
	 * @param ctx the parse tree
	 */
	void exitIfState(@NotNull foplGramParser.IfStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link foplGramParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(@NotNull foplGramParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link foplGramParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(@NotNull foplGramParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link foplGramParser#doWhile}.
	 * @param ctx the parse tree
	 */
	void enterDoWhile(@NotNull foplGramParser.DoWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link foplGramParser#doWhile}.
	 * @param ctx the parse tree
	 */
	void exitDoWhile(@NotNull foplGramParser.DoWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link foplGramParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(@NotNull foplGramParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link foplGramParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(@NotNull foplGramParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link foplGramParser#varDec}.
	 * @param ctx the parse tree
	 */
	void enterVarDec(@NotNull foplGramParser.VarDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link foplGramParser#varDec}.
	 * @param ctx the parse tree
	 */
	void exitVarDec(@NotNull foplGramParser.VarDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link foplGramParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(@NotNull foplGramParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link foplGramParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(@NotNull foplGramParser.OperationContext ctx);
}
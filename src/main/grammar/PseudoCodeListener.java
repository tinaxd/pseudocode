// Generated from PseudoCode.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PseudoCodeParser}.
 */
public interface PseudoCodeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PseudoCodeParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PseudoCodeParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PseudoCodeParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PseudoCodeParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(PseudoCodeParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(PseudoCodeParser.AssignmentContext ctx);
}
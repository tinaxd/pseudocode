// Generated from PseudoCode.g4 by ANTLR 4.9.2
package work.tinax.pseudorunner.parser;
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
	 * Enter a parse tree produced by {@link PseudoCodeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(PseudoCodeParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(PseudoCodeParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(PseudoCodeParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(PseudoCodeParser.DeclarationContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#dump}.
	 * @param ctx the parse tree
	 */
	void enterDump(PseudoCodeParser.DumpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#dump}.
	 * @param ctx the parse tree
	 */
	void exitDump(PseudoCodeParser.DumpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#dynamicArrayType}.
	 * @param ctx the parse tree
	 */
	void enterDynamicArrayType(PseudoCodeParser.DynamicArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#dynamicArrayType}.
	 * @param ctx the parse tree
	 */
	void exitDynamicArrayType(PseudoCodeParser.DynamicArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(PseudoCodeParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(PseudoCodeParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PseudoCodeParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PseudoCodeParser.ProgramContext ctx);
}
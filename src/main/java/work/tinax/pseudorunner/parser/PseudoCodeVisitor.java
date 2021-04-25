// Generated from PseudoCode.g4 by ANTLR 4.9.2
package work.tinax.pseudorunner.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PseudoCodeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PseudoCodeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(PseudoCodeParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(PseudoCodeParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(PseudoCodeParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(PseudoCodeParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#dump}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDump(PseudoCodeParser.DumpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#dynamicArrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamicArrayType(PseudoCodeParser.DynamicArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(PseudoCodeParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PseudoCodeParser.ProgramContext ctx);
}
package work.tinax.pseudorunner.nodes;

import java.util.ArrayList;
import work.tinax.pseudorunner.parser.PseudoCodeBaseVisitor;
import work.tinax.pseudorunner.parser.PseudoCodeParser;

public class NodeCreator extends PseudoCodeBaseVisitor<PSNode> {

	@Override public PSStatementBlockNode visitProgram(PseudoCodeParser.ProgramContext ctx) {
		var stmts = ctx.stmt();
		var nodes = new ArrayList<PSStatementNode>();
		for (var stmt : stmts) {
			nodes.add((PSStatementNode)(visit(stmt)));
		}
		return new PSStatementBlockNode((PSStatementNode[])nodes.toArray());
	}
	
	@Override public PSAssignmentNode visitAssignment(PseudoCodeParser.AssignmentContext ctx) {
		String assigneeName = ctx.ID().getSymbol().getText();
		PSExpressionNode expr = (PSExpressionNode)visit(ctx.expr());
		return new PSAssignmentNode(assigneeName, expr);
	}
	
	@Override public PSDumpNode visitDump(PseudoCodeParser.DumpContext ctx) {
		PSExpressionNode expr = (PSExpressionNode)visit(ctx.expr());
		return new PSDumpNode(expr);
	}
	
	@Override public PSNode visitExpr(PseudoCodeParser.ExprContext ctx) {
		if (ctx.INTEGER() != null) {
			return new PSIntegerLiteralNode(Integer.parseInt(ctx.INTEGER().getSymbol().getText()));
		}
		
		if (ctx.ID() != null) {
			return new PSVariableNode(ctx.ID().getSymbol().getText());
		}
		
		var ex1 = (PSExpressionNode)visit(ctx.expr(0));
		var ex2 = (PSExpressionNode)visit(ctx.expr(1));
		return new PSAddNode(ex1, ex2);
	}
	
}

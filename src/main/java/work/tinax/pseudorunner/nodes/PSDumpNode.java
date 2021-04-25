package work.tinax.pseudorunner.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;

public class PSDumpNode extends PSStatementNode {

	@Child private PSExpressionNode expr;
	
	public PSDumpNode(PSExpressionNode expr) {
		super();
		this.expr = expr;
	}
	
	@Override
	public void executeStmt(VirtualFrame frame) {
		var result = expr.executeInt(frame);
		System.out.println(result);
	}
	
	@Override
	public String toString() {
		return "dump " + expr.toString();
	}

}

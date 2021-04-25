package work.tinax.pseudorunner.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;

public class PSAssignmentNode extends PSStatementNode {

	private String varName;
	@Child
	private PSExpressionNode expr;
	
	public PSAssignmentNode(String varName, PSExpressionNode expr) {
		this.varName = varName;
		this.expr = expr;
	}
	
	@Override
	public void executeStmt(VirtualFrame frame) {
		int value = expr.executeInt(frame);
		var slot = frame.getFrameDescriptor().findOrAddFrameSlot(varName);
		frame.setInt(slot, value);
	}
	
	@Override
	public String toString() {
		return varName + " <- " + expr.toString();
	}
	
}

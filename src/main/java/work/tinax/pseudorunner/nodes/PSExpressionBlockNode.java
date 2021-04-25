package work.tinax.pseudorunner.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.ExplodeLoop;

public class PSExpressionBlockNode extends PSExpressionNode {

	@Children private final PSExpressionNode[] exprs;
	
	public PSExpressionBlockNode(PSExpressionNode[] exprs) {
		this.exprs = exprs;
	}
	
	@Override
	@ExplodeLoop
	public int executeInt(VirtualFrame frame) {
		if (exprs.length == 0) throw new RuntimeException("No statements in block");
		int last = 0;
		for (var expr : exprs) {
			last = expr.executeInt(frame);
		}
		return last;
	}
	
	@Override
	public String toString() {
		final int exprlen = exprs.length;
		String[] exprStrings = new String[exprlen];
		for (int i=0; i<exprlen; i++) {
			exprStrings[i] = exprs[i].toString();
		}
		return "{" + String.join(" ", exprStrings) + "}";
	}

}

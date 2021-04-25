package work.tinax.pseudorunner.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;

public class PSAddNode extends PSBinaryExpressionNode {
	
	public PSAddNode(PSExpressionNode leftNode, PSExpressionNode rightNode) {
		super(leftNode, rightNode);
	}

	@Override
	public int executeInt(VirtualFrame frame) {
		int left = leftNode.executeInt(frame);
		int right = rightNode.executeInt(frame);
		return left + right;
	}

	@Override
	protected String getOperatorSymbol() {
		return "+";
	}

}

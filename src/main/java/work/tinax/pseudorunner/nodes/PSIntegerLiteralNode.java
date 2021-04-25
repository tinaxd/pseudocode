package work.tinax.pseudorunner.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;

public final class PSIntegerLiteralNode extends PSExpressionNode {
	private final int value;
	
	public PSIntegerLiteralNode(int value) {
		this.value = value;
	}
	
	@Override
	public int executeInt(VirtualFrame frame) {
		return value;
	}
}

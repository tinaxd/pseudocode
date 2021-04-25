package work.tinax.pseudorunner.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;

public abstract class PSExpressionNode extends PSNode {

	public abstract int executeInt(VirtualFrame frame);

}

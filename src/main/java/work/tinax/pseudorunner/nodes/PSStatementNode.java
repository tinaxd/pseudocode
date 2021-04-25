package work.tinax.pseudorunner.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;

public abstract class PSStatementNode extends PSNode {

	public abstract void executeStmt(VirtualFrame frame);

}

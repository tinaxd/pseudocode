package work.tinax.pseudorunner.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.nodes.RootNode;

@NodeInfo(language="PseudoCode", description="The root of PseudoCode execution trees")
public class PSRootNode extends RootNode {

	@Child
	private PSStatementNode stmtNode;
	
	public PSRootNode(PSStatementNode stmtNode) {
		super(null);
		this.stmtNode = stmtNode;
	}

	@Override
	public Object execute(VirtualFrame frame) {
		stmtNode.executeStmt(frame);
		return null;
	}

}

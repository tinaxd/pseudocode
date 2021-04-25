package work.tinax.pseudorunner.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.ExplodeLoop;

public class PSStatementBlockNode extends PSStatementNode {

	@Children private final PSStatementNode[] stmts;
	
	public PSStatementBlockNode(PSStatementNode[] stmts) {
		this.stmts = stmts;
	}

	@Override
	@ExplodeLoop
	public void executeStmt(VirtualFrame frame) {
		for (var stmt : stmts) {
			stmt.executeStmt(frame);
		}
	}

}

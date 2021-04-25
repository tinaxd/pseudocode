package work.tinax.pseudorunner.nodes;

import com.oracle.truffle.api.frame.FrameSlotTypeException;
import com.oracle.truffle.api.frame.VirtualFrame;

public class PSVariableNode extends PSExpressionNode {

	private String varName;
	
	public PSVariableNode(String varName) {
		this.varName = varName;
	}
	
	@Override
	public int executeInt(VirtualFrame frame) {
		var slot = frame.getFrameDescriptor().findFrameSlot(varName);
		if (slot == null) {
			throw new RuntimeException("variable " + varName + " not defined");
		}
		try {
			return frame.getInt(slot);
		} catch (FrameSlotTypeException e) {
			throw new RuntimeException(e);
		}
	}

}

package work.tinax.pseudorunner.nodes;

public abstract class PSBinaryExpressionNode extends PSExpressionNode {
	@Child
	protected PSExpressionNode leftNode;
	@Child
	protected PSExpressionNode rightNode;
	
	public PSBinaryExpressionNode(PSExpressionNode leftNode, PSExpressionNode rightNode) {
		this.leftNode = leftNode;
		this.rightNode = rightNode;
	}
	
	protected abstract String getOperatorSymbol();
	
	@Override
	public String toString() {
		return "(" + leftNode.toString() + " " + getOperatorSymbol() + " " + rightNode.toString() + ")";
	}
}

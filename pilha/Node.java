public class Node {
	private int dado;
	private Node refNo = null;

	public Node() {

	}

	public Node(int dado) {
		this.dado = dado;
	}

	public int getDado() {
		return dado;
	}

	public void setDado(int dado) {
		this.dado = dado;
	}

	public Node getRefNode() {
		return refNo;
	}

	public void setRefNode(Node refNo) {
		this.refNo = refNo;
	}

	@Override
	public String toString() {
		return "Node{" +
				"dado=" + dado +
				"}";
	}
}
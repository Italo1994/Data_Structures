public class Pilha {
	private Node refNoEntradaPilha;

	public Pilha() {
		this.refNoEntradaPilha = null;
	}

	public void push(Node newNode) {
		Node refAuxiliar = refNoEntradaPilha;
		refNoEntradaPilha = newNode;
		refNoEntradaPilha.setRefNode(refAuxiliar);
	}

	public Node pop() {
		if(!this.isEmpty()) {
			Node nodePoped = refNoEntradaPilha;
			refNoEntradaPilha = refNoEntradaPilha.getRefNode();
		}

		return null;
	}

	public Node top() {
		return refNoEntradaPilha;
	}

	public boolean isEmpty() {
		return refNoEntradaPilha == null ? true : false;
	}

	@Override
	public String toString() {
		String stringRetorno = "--------------\n";
		stringRetorno += " Pilha\n";
		stringRetorno += "--------------\n";

		Node noAuxiliar = refNoEntradaPilha;

		while(true) {
			if(noAuxiliar != null) {
				stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
				noAuxiliar = noAuxiliar.getRefNode();
			} else {
				break;
			}
		}

		stringRetorno += "==============\n";
		return stringRetorno;
	}
}
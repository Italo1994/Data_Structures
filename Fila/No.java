public class No {
	private Object object;
	private No refNode;

	public No() {

	}

	public No(Object object) {
		this.refNo = null;
		this.object = object;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public No getRefNo() {
		return refNode;
	}

	public void setRefNo(No refNode) {
		this.refNode = refNode;
	}

	@Override
	public String toString() {
		return "No{" +
				"Object=" + object +
				"}";
	}
}
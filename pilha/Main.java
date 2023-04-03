public class Main {
	public static void main(String[] args) {
		// Examples that you can use for start
		Pilha pilha = new Pilha();

		pilha.push(new Node(1));
		pilha.push(new Node(2));
		pilha.push(new Node(3));
		pilha.push(new Node(4));
		pilha.push(new Node(5));
		pilha.push(new Node(6));
		pilha.push(new Node(7));
		pilha.push(new Node(8));

		System.out.println(pilha);

		pilha.pop();

		System.out.println(pilha);

		pilha.push(new Node(8));

		System.out.println(pilha);
	}
}
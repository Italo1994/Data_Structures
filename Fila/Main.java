public class Main {
	public static void main(String[] args) {
		Fila fila = new Fila();
		
		fila.enqueue(new No("primeiro"));
		fila.enqueue(new No("segundo"));
		fila.enqueue(new No("terceiro"));
		fila.enqueue(new No("quarto"));

		System.out.println(fila);
	}
}
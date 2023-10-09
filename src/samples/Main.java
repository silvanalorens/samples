package samples;

public class Main {
	
	public Main() {
		
		
		printResultOfThis(this::anyMethod);
	}
	
	private float anyMethod() {
		return 10/5;
	}
	public static void main(String[] args) {
		new Main();
		System.out.println("Hola");
		
	}

	private void printResultOfThis(Operation operation) {
		System.out.println(operation.operation());
	}

}

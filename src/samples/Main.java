package samples;

public class Main {
	
	public Main() {
		
		Operation operation = ()-> 3.4f * 5;
		Operation o2 = ()-> 4/2;
		printResultOfThis(operation);
		printResultOfThis(o2);
	}

	public static void main(String[] args) {
		new Main();
		System.out.println("Hola");
		
	}

	private void printResultOfThis(Operation operation) {
		System.out.println(operation.operation());
	}

}

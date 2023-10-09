package samples;

public class Main {
	
	public Main() {
		
		Operation o1 = new Operation() {

			@Override
			public float operation() {
				// TODO Auto-generated method stub
				var valor1 = 3.3f;
				print("Primer valor: "+ valor1 );
				
				var valor2 = 3;
				print("Segundo valor: "+ valor2 );
				
				return valor1 * valor2;
			}
			private void print(String value) {
				System.out.println(value);
			}
		
		
	};
	printResultOfThis(o1);
	}

	public static void main(String[] args) {
		new Main();
		System.out.println("Hola");
		
	}

	private void printResultOfThis(Operation operation) {
		System.out.println(operation.operation());
	}

}

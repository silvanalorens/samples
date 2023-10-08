package samples;

public class Main implements Operation {
	
	public Main() {
		Operation.interfaceStaticMethod();
		interfaceDefaultMethod();
	}

	public static void main(String[] args) {
		new Main();
		System.out.println("Hola");

	}

	@Override
	public float operation() {
		// TODO Auto-generated method stub
		return 0;
	}

}

package samples;

//java 8
@FunctionalInterface
public interface Operation {
	
	float operation();
	private void interfacePrivateMethod() {
		System.out.println("llamado al metodo privado");
		interfaceStaticMethod();
		
	}
	
	static void interfaceStaticMethod() {
		System.out.println("Llamando al m�todo estatico");
	}
	
	default void interfaceDefaultMethod() {
		interfacePrivateMethod();
		interfaceStaticMethod();
		System.out.println("Llamando al m�todo default");
	}
}

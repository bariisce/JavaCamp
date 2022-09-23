package methodsOverloading;

public class Main {

	public static void main(String[] args) {
		FourOperations fourOperations = new FourOperations();
		System.out.println(fourOperations.sum(14, 12));
		System.out.println(fourOperations.sum(4, 4, 4));
	}

}

package methods;

public class Main {

	public static void main(String[] args) {
		String cityName=takeCity();
		System.out.println(cityName);

		int result=sum(11,8);
		System.out.println(result);

	}

	public static void add() {
		System.out.println("Added");
	}
	
	public static void delete() {
		System.out.println("Deleted");
	}
	
	public static void update() {
		System.out.println("Updated");
	}
	
	public static int sum(int value1, int value2) {
		return value1 + value2;
	}
	
	public static String takeCity() {
		return "Adana";
	}
}

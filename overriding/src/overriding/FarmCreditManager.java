package overriding;

public class FarmCreditManager extends BaseCreditManager {
	
	public double calculate(double amount) {
		return amount * 1.18;
	}
}

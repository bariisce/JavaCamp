package polymorphismDemo;

public class CustomerManager {
	
	private BaseLogger _logger;
	
	public CustomerManager(BaseLogger logger) {
		_logger=logger;
		
	}
	public void add() {
		System.out.println("Customer was added");
		this._logger.log("Log Message");
	}
}


public class InsufficientBalanceException extends RuntimeException {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1905037567933428167L;
	
	private double amount;
	
	public InsufficientBalanceException(double amount) {
		
		this.amount = amount;
		
	}
	
	public String toString() {
		
		return "InsufficientBalanceException for Amount: " + getAmount();
		
	}
	
	public String getMessage() {
		
		return "InsufficientBalanceException for Amount: " + getAmount();
		
	}
	
	public double getAmount(){
		
		return amount;
		
	}
	
	

}

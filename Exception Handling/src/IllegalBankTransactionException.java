
public class IllegalBankTransactionException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5426605237899257009L;
	
	private double amount;
	
	public IllegalBankTransactionException(double amount) {
		
		this.amount = amount;
		
	}
	
	public String toString() {
		
		return "IllegalBankTransactionException for Amount: " + getAmount();
		
	}
	
	public String getMessage() {
		
		return "IllegalBankTransactionException for Amount: " + getAmount();
		
	}
	
	public double getAmount(){
		
		return amount;
		
	}

}

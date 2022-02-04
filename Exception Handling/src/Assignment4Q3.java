import java.util.Scanner;

public class Assignment4Q3 {
	
	public double withdraw(double amount, double balance) {
		
		if((balance==0) || (amount>balance)) {
			
			throw new InsufficientBalanceException(amount);
			
		}
		else if(amount<0) {
			
			throw new IllegalBankTransactionException(amount);
			
		}
		else {
			
			System.out.println("amount withdraw successful");
			
		}
		
		return (balance-amount);
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Current Balance is :");
		
		double bal = sc.nextDouble();
		
		System.out.println("The amount you want to with draw is : ");
		
		double amount = sc.nextDouble();
		
		Assignment4Q3 obj = new Assignment4Q3();
		
		try {
			
			obj.withdraw(amount, bal);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		

	}

}

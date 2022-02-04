import java.io.*;
import java.util.*;
import java.lang.Math.*;

class siCi{
	public double simpleInterest(double principalAmount,int time,double interestRate){
		
		double si = (principalAmount*time*interestRate)/100;
		
		return si;
		
	}
    public double compoundInterest(double principalAmount,int time,double interestRate){
    	
    	double ci = principalAmount*Math.pow((1+(interestRate/100)), time)-principalAmount;
    	
    	return ci;
    	
    }
}

public class Assignment1Q3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		
		int b = sc.nextInt();
		
		double c = sc.nextDouble();
		
		siCi obj = new siCi();
		
		double x = obj.simpleInterest(a,b,c);
		
		double y = obj.compoundInterest(a,b,c);
		
		System.out.println("Simple Interest is "+x);
		
		System.out.println("Compound Interest is "+y);
	}

}

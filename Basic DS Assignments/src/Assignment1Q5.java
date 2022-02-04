import java.util.*;
import java.io.*;

class TaxAmount{
	
    public double calculateTaxAmount(int ctc){
    	
    	int taxPercentage = 0;
    	
    	double taxAmou = 0;
    	
    	if(ctc>=0 && ctc<=180000) {
    		
    		taxPercentage = 0;
    		
    	}
    	else if(ctc>=181001 && ctc<=300000) {
    		
    		taxPercentage = 10;
    		
    	}
    	else if(ctc>=300001 && ctc<=500000) {
    		
    		taxPercentage = 20;
    		
    	}
    	else if(ctc>=500001 && ctc<=1000000) {
    		
    		taxPercentage = 30;
    		
    	}
    	
    	taxAmou = (ctc*taxPercentage)/100;
    	
    	return taxAmou;
    	
    }
    
}

public class Assignment1Q5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ctc = sc.nextInt();
		
		TaxAmount obj = new TaxAmount();
		
		double x = obj.calculateTaxAmount(ctc);
		
		System.out.println("The tax amount is "+x);

	}

}

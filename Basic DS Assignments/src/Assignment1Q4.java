import java.util.*;
import java.io.*;

class ResultDeclaration{
    public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks) {
    	
    	String x = "";
    	
    	if(subject1Marks>60 && subject2Marks>60 && subject3Marks>60) {
    		
    		x = "Passed";
    		
    	}
    	else if((subject1Marks>60 && subject2Marks>60 && subject3Marks<60) || (subject1Marks>60 && subject2Marks<60 && subject3Marks>60) || (subject1Marks<60 && subject2Marks>60 && subject3Marks>60)) {
    		
    		x = "Promoted";
    		
    	}
    	else if((subject1Marks>60 && subject2Marks<60 && subject3Marks<60) || (subject1Marks<60 && subject2Marks>60 && subject3Marks<60) || (subject1Marks<60 && subject2Marks<60 && subject3Marks>60) || (subject1Marks<60 && subject2Marks<60 && subject3Marks<60)) {
    		
    		x = "Failed";
    		
    	}
    	
    	return x;
    	
    }
}
public class Assignment1Q4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double sub1 = sc.nextDouble();
		
		double sub2 = sc.nextDouble();
		
		double sub3 = sc.nextDouble();
		
		ResultDeclaration obj = new ResultDeclaration();
		
		String a = obj.declareResults(sub1, sub2, sub3);
		
		System.out.println(a);

	}

}

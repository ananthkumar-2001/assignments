import java.io.*;
import java.util.*;


class SearchArray{
	
    public boolean searchArray(int[] arr,int toCheckValue){
    	
    	boolean b1 = false;
    	
    	for(int i=0;i<arr.length;i++) {
    		
    		if(arr[i]==toCheckValue) {
    			
    			b1 = true;
    			
    		}
    		
    	}
    	
    	return b1;
    	
    }
    
}
public class Assignment1Q7 {
    
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
		int arr[] = { 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        
		int valueToCheck = sc.nextInt();
		
		SearchArray obj = new SearchArray();
		
		boolean x = obj.searchArray(arr, valueToCheck);
		
		if(x==true) {
			
			System.out.println(valueToCheck+" is found in the given Array");
			
		}
		else {
			
			System.out.println(valueToCheck+" is not found in the given Array");
			
		}
		
	}
		
}
import java.util.*;
import java.io.*;
import java.lang.Math.*;

public class Assignment1Q2 {
	
	public static ArrayList<Integer> armstrongNumbersInRange(int min,int max) {
		
		ArrayList<Integer>  arr = new ArrayList<Integer>();
		
		for(int i=min+1;i<max;i++) {
			
			int num = i;
			
			int x =0;
			
			while(num != 0) {
				
				num /= 10;
				
				++x;
				
			}
			
			int sum = 0;
			
			num = i;
			
			while(num>0) {
				
				int ld = num%10;
				
				sum += Math.pow(ld, x);
				
				num = num/10;
				
			}
			
			if(sum==i) {
				
				arr.add(i);
				
			}
			
		}
		
		return arr;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int min = sc.nextInt();
		
		int max = sc.nextInt();
		
		ArrayList<Integer> arr1 = armstrongNumbersInRange(min,max);
		
		for(int j=0;j<arr1.size();j++) {
			
			System.out.print(arr1.get(j)+" ");
			
		}

	}

}

import java.util.Scanner;
import java.io.*;
import java.lang.Math.*;

public class Assignment1Q1 {
	
	public static boolean armstrongCheck(int num) {
		
		int a = num;
		
		int x = 0;
		
		while(a!=0) {
			a /= 10;
			++x;
		}
		
		int sum = 0;
		
		a = num;
		
		while(a>0) {
			
			int ld = a%10;
			
			sum += Math.pow(ld, x);
			
			a = a/10;
			
		}
		
		boolean c = false;
		
		if(sum==num) {
			
			c = true;
			
		}
		
		return c;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		boolean b = armstrongCheck(n);
		
		if(b==true) {
			System.out.println(n+" is a Armstrong number");
		}
		else if(b==false){
			System.out.println(n+" is not a Armstrong number");
		}

	}

}

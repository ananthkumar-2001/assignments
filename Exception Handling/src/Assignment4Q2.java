import java.util.Scanner;

public class Assignment4Q2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Value of a is : ");
		
		int a = sc.nextInt();
		
		System.out.println("Value of b is : ");
		
		int b = sc.nextInt();
		
		int result = 0;
		
		try {
			result = a/b;
			
		} catch (UnsupportedOperationException ae) {
			
			System.out.println("Exception caught due to number divided by zero");
			
			ae.printStackTrace();
		}
		
		System.out.println(result);

	}

}

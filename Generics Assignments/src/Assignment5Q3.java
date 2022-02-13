import java.util.Scanner;

public class Assignment5Q3 {

	public static void main(String[] args) {
		
		Integer arr[] = {1,5,69,85,122};
		
		String arr1[]  = {"Ravi","Kavi","Bavi","Havi"}; 
		
		
		Assignment5Q3 Assign1 = new Assignment5Q3();
		
		Assign1.printExchangeElements(arr);
		
		System.out.println("-----------------------");
		
		Assign1.printExchangeElements(arr1);
		
		

	}
	
	public <E> void printExchangeElements(E[] list) {
		
		Scanner sc = new Scanner(System.in);
		
		for (E e : list) {
			
			System.out.println(e);
			
		}

		
		int len = list.length;
		
		System.out.println("Select two numbers from 0 to "+(len-1));
		
		int a= sc.nextInt();
		
		int b = sc.nextInt();
		
					
		E temp = list[a];
			
		list[a] = list[b];
			
		list[b] = temp;
		
		for (E e : list) {
			
			System.out.println(e);
			
		}

		
	}

}



import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class pricePrint {
	
	public static void Options() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select your option (1: Insert New Price, 2: View Purchase Total, 3: Exit)");
		
		int option = sc.nextInt();
		
		if(option==1)
			newPrice();
		else if(option==2)
			viewPrice();
		else {
			System.out.println("exiting program..........");
		}
		
	}

	private static void newPrice() {
		
		int i = 1;

		while(true) {
			
			Scanner sc = new Scanner(System.in);
			
			var path = "C:\\Users\\Ananth kumar\\eclipse-workspace\\java 11 Assignments\\src\\priceList";
			
			System.out.print("Insert "+i+" "+"price : ");
			
			String price = sc.next();
			
			try {
				Files.writeString(Path.of(path), price,StandardOpenOption.APPEND);
				
				System.out.println("Price has been saved to the file");
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			System.out.println("Do you want to enter price for more items? (Yes/No)");
			
			String aString = sc.next();
			
			if(aString.equalsIgnoreCase("yes")) {
				i++;
			}else {
				Options();
				break;
			}
			
		}
		
	}

	private static void viewPrice() {
		
		var path = "C:\\Users\\Ananth kumar\\eclipse-workspace\\java 11 Assignments\\src\\priceList";
		
		String data1 = null;
		
		try {
			data1 = Files.readString(Path.of(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(data1);
		
		Options();
	}

	public static void main(String[] args) {
		Options();
	}

}

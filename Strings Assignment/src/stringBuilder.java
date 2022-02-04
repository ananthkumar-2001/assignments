import java.lang.StringBuilder;


public class stringBuilder {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("StringBuilder ");
		
		sb.append("is a peer class of String ");
		
		sb.append("that provides much of ");
		
		sb.append("the functionality of strings");
		
		System.out.println(sb);
		
		StringBuilder sb1 = new StringBuilder("It is used to  at the specified index position");
		
		sb1.insert(14, "insert text");
		
		System.out.println(sb1);
		
		StringBuilder sb2 = new StringBuilder("This method returns the reversed object on which it was called");
		
		System.out.println(sb2.reverse());

	}

}

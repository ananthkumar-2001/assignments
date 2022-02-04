import java.lang.String; 

public class stringClass {

	public static void main(String[] args) {
		
		String s1 = "Hello World";
		
		int len = s1.length();
		
		System.out.println("Length of s1 is " +len);
		
		String s2 = "Hello";
		
		String s3 = "How are you";
		
		String s4 = s2.concat(s3);
		
		System.out.println(s4);
		
		String str = "Java String pool refers to collection of Strings which are stored in heap memory";
		
		System.out.println(str.toLowerCase()); // 3.a
		
		System.out.println(str.toUpperCase()); // 3.b

		System.out.println(str.replace('a', '$')); // 3.c
		
		System.out.println(str.contains("collection")); // 3.d
		
		String str1 = "java string pool refers to collection of strings which are stored in heap memory";
		
		System.out.println(str1.equals(str)); // 3.e
		
		System.out.println(str1.equalsIgnoreCase(str)); // 3.f
		
	}
	
}

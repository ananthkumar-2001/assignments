import java.util.ArrayList;
import java.util.Arrays;

public class convertString {

	public static void main(String[] args) {
		
		String str = "A quick brown fox jumps over the lazy dog";
		
		String str1[] = str.split(" "); 
		
		ArrayList<String> list1 = new ArrayList<>(Arrays.asList(str1));
		
		System.out.println(list1);
		
		System.out.println("----------------------------------------------");
		
		String[] arr = list1.toArray(String[] :: new);

		System.out.println(Arrays.toString(arr));
	}

}

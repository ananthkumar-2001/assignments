import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@interface Test{
	
}

public class Assignment7Q1 {

	public static void main(String[] args) {
		
		System.out.println("annataion created");
		
	}
	
	@Test
	public void test(){
		
		
	}
	
	
/*	@Test
	public static void race() {
		
		
	} */
	
}

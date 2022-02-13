import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
@interface Info{
	
	int AuthorID();
	
	String AuthorName() default "Ananth";
	
	String Supervisor() default "Ravi";
	
	String Date();
	
	String Time();
	
	int Version();
	
	String Description() default "it is coutom annotation";
	
}


public class Assignment7Q2 {

}

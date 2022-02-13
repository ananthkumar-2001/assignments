import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@interface Execute{
	
	int Sequence();
	
}

public class Assignment7Q3 {

	@Execute(Sequence=2) 
	public void myMethod1(){ 
		
	} 
	
	@Execute(Sequence=1) 
	public void myMethod2(){ 
		
	} 
	
	@Execute(Sequence=3) 
	public void myMethod3(){ 
		
	} 
	
}

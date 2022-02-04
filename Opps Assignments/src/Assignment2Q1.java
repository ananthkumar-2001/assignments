


class SingletonInheritanceCheck extends test{
	
	public SingletonInheritanceCheck() {
		
	}
	
}

public class Assignment2Q1 {

	public static void main(String[] args) {
		
		test obj1 = test.getInstance();
		
		test obj2 = test.getInstance();
		
		System.out.println(obj1);
		
		System.out.println(obj2);
		
		SingletonInheritanceCheck obje1 = new SingletonInheritanceCheck();
		
		System.out.println(obje1);

	}

}

class test{
	
	static test obj = new test();
	
	private test() {
		
		
	}
	
	public static test getInstance() {
		
		return obj;
		
	}
	
}
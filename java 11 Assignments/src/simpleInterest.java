
interface sinter{
	double operation(int a,int b,int c);
}

public class simpleInterest {

	public static void main(String[] args) {
		
		var p = 10000;
		var r = 10;
		var t = 3;
		
		sinter performSinter = (var a,var b,var c) -> a*b*c/100;
		
		double outi = performSinter.operation(p, r, t);
		
		System.out.println(outi);
		
	}

}

import java.util.HashSet;

public class Employee {
	
	String empname;
	
	int id;
	
	double salary;
	
	String department;
	
	

	public Employee(String empname, int id, double salary, String department) {
		this.empname = empname;
		this.id = id;
		this.salary = salary;
		this.department = department;
	}
	
	@Override
	public String toString() {
		
		return "{Employee { name : "+ empname + ", id : " + id + ", salary : " + salary + ", department : " + department + "}}"; 
	}
	

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		HashSet<Employee> employees = new HashSet<>();
		
		employees.add(new Employee("Ananth", 1, 15698.00, "analyst"));
		
		
		employees.add(new Employee("Ananth Kumar", 2, 150085.00, "Super analyst"));
		
		System.out.println(employees);
		
		
	}

}

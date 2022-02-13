import java.util.Comparator;
import java.util.TreeSet;

class mySalaryComparator implements Comparator<EmployeeQ>
{
  @Override
	public int compare(EmployeeQ o1, EmployeeQ o2) {
		return (int) (o1.getSalary()-o2.getSalary());
	}
}

class myIdComparator implements Comparator<EmployeeQ>
{
  @Override
	public int compare(EmployeeQ o1, EmployeeQ o2) {
		return o1.getId()-o2.getId();
	}
}
 
class myNameComparator implements Comparator<EmployeeQ>
{
	@Override
	public int compare(EmployeeQ o1, EmployeeQ o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

class myDeptComparator implements Comparator<EmployeeQ>
{
	@Override
	public int compare(EmployeeQ o1, EmployeeQ o2) {
		return o1.getDept().compareTo(o2.getDept());
	}
}

public class EmployeeQ {
	
	int id;
	
	String name;
	
	String dept;
	
	double salary;
	
	

	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getDept() {
		return dept;
	}


	public double getSalary() {
		return salary;
	}


	public EmployeeQ(int id, String name, String dept, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		
		return "{ Employee { Id : " + id + ", Name : "+name+", Department : "+dept+", Salary : "+salary+" } }";
		
	}
	
			
	public static void main(String[] args) {
		
		
			
			TreeSet<EmployeeQ> emp = new TreeSet<>(new myIdComparator());
			
			
			emp.add(new EmployeeQ(1, "Ananth", "cse", 10000));
			
			emp.add(new EmployeeQ(2, "Ananth", "cse", 10000));

			emp.add(new EmployeeQ(3, "Ananth", "cse", 10000));

			emp.add(new EmployeeQ(4, "Ananth", "cse", 10000));

			emp.add(new EmployeeQ(5, "Ananth", "cse", 10000));

			emp.add(new EmployeeQ(6, "Ananth", "cse", 10000));

			emp.add(new EmployeeQ(7, "Ananth", "cse", 10000));

			emp.add(new EmployeeQ(8, "Ananth", "cse", 10000));

			emp.add(new EmployeeQ(9, "Ananth", "cse", 10000));

			emp.add(new EmployeeQ(10, "Ananth", "cse", 10000));
			
			
			System.out.println("a)ID \nb)Name \nc)Department \nd)Salary");
			
		}
			

}

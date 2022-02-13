import java.util.Collection;
import java.util.Map.Entry;
import java.util.TreeMap;

enum Gender{
	
	Male,
	
	Female;
	
}

public class Contact {
	
	long phoneNumber;
	
	String name;
	
	String email;
	
	Gender gender;
	
	

	public Contact(String name, String email, Gender gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Contact { name : "+name+", email : "+email+", Gender : "+gender+"}";
	}



	public static void main(String[] args) {


		TreeMap<Long, Contact> treeMap = new TreeMap<>();
		
		treeMap.put( (long) 97979 , new Contact("Ananth","ananth@gmail.com",Gender.Male));
		
		treeMap.put( (long) 97985 , new Contact("Ravu","anananjbajth@gmail.com",Gender.Female));
		
		treeMap.put( (long) 97982 , new Contact("Lavu","ananmmmmaath@gmail.com",Gender.Male));
		
		treeMap.put( (long) 97989 , new Contact("Akavuh","anaaaaxxanth@gmail.com",Gender.Female));
		
		treeMap.put( (long) 97758 , new Contact("takuh","anantssssh@gmail.com",Gender.Male));
		
		
		for(Long t : treeMap.keySet()) {
			
			System.out.println(t);
			
		}
		
		for(Contact c : treeMap.values()) {
			
			System.out.println(c);
			
		}
		
		for(Entry<Long, Contact> t1 : treeMap.entrySet()) {
			
			System.out.println(t1);
			
		}
		
		
	}

}

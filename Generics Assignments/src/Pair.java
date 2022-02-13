
public class Pair<K,V> {
	
	private K key1 ;
	
	private V value1;

	public Pair(K key1, V value1) {
		super();
		this.key1 = key1;
		this.value1 = value1;
	}
	
	
	public K getKey1() {
		return key1;
	}


	public V getValue1() {
		return value1;
	}



	public static void main(String[] args) {
		
		Pair<String, String> pair1 = new Pair<>("1","Hello");
		
		
		
	}

}

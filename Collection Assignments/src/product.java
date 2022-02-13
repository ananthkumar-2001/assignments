import java.util.HashSet;

public class product {
	
int product_id;
	
	String product_name;
	
	String product_description;

	public product(int product_id, String product_name, String product_description) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_description = product_description;
	}
	
		
	@Override
	public String toString() {
		
		return "{ Product { Product_id : " + product_id + ", Product_name : "+ product_name + ", Product_description : " + product_description + " } }";
	}

	public static void main(String[] args) {
		
		HashSet<product> tSet = new HashSet<>();
		
		tSet.add(new product(1, "ball", "Round Ball"));
		
		tSet.add(new product(2, "bowl", "Round bowl"));

		tSet.add(new product(3, "plate", "Round Plate"));

		tSet.add(new product(4, "box", "Square box"));

		tSet.add(new product(5, "bed", "single bed"));

		tSet.add(new product(6, "ball", "Round Ball"));

		tSet.add(new product(7, "Tap", "Long tap"));

		tSet.add(new product(8, "key", "doorkey"));

		tSet.add(new product(9, "pen", "Ball pen"));

		tSet.add(new product(10, "book", "Rule Book"));
		
		for(product eProduct : tSet) {
			
			System.out.println(eProduct);
			
		}

	}

}

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class readAndWrite {

	public static void main(String[] args) {
		
		var path = "C:\\Users\\Ananth kumar\\eclipse-workspace\\java 11 Assignments\\src\\StudentNames";
		
		try {
			String data = Files.readString(Path.of(path));
			if(data.isBlank()) {
				data.replace(data, "");
			}
			System.out.println(data);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

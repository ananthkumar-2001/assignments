import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class Assignment10Q6 {

	public static void main(String[] args) {
		
		String uri = "https://httpbin.org/get";
		
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(uri)).GET().build();
		
		HttpClient client = HttpClient.newBuilder().build();
		
		try {
			HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
			System.out.println(response.body());
			System.out.println(response.statusCode());
			System.out.println(response.headers());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		

	}

}

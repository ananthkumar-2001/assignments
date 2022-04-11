package io.learning.data.stub;

import java.util.Arrays;
import java.util.List;

import io.learning.data.TodoService;

public class TodoServiceStub implements TodoService {

	public List<String> retrieveTodos(String user) {
		
		return Arrays.asList("Learn Spring MVC", "Learn Spring",
				"Learn to Dance");
	}

}

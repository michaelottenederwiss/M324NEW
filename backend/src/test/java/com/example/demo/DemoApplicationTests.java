package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		assertTrue(true, "alles gut");
	}

	void addingTaskShouldAppearInTaskList() {
		// Arrange
		DemoApplication app = new DemoApplication();
		String jsonTask = "{\"taskdescription\":\"Testaufgabe\"}";

		// Act
		app.addTask(jsonTask);
		List<Task> tasks = app.getTasks();

		// Assert
		boolean found = tasks.stream().anyMatch(t -> "Testaufgabe".equals(t.getTaskdescription()));
		assertTrue(found, "Die Aufgabe 'Testaufgabe' sollte in der Liste enthalten sein");
	}
	
}

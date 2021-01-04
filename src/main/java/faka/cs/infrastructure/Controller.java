package faka.cs.infrastructure;

import java.util.UUID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	private static final String id = UUID.randomUUID().toString();

	@GetMapping
	public String get() {
		return id;
	}
}

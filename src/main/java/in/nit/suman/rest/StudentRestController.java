package in.nit.suman.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/std")
@RefreshScope
public class StudentRestController {

	
	
	@Value("${title}")
	private String title;
	
	@GetMapping("/info")
	public String getData() {
		return "SAMPLE=> "+title;
	}
}

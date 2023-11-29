package id.ilmudata.hello.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/myservice")
public class MyServiceController {
	
	@Autowired
	private ServerProperties serverProperties;
	
	@GetMapping("/hello")
	public String hello() {
		int port = serverProperties.getPort();
		return "hello service from myservice1:" + Integer.toString(port);
	}

}
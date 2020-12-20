package cn.jm;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@RequestMapping("/greeting")
	public String findInfo(@RequestParam(value="name", defaultValue="World") String name) {
		System.out.println(">>>name:"+name);
		return name;
	}
}

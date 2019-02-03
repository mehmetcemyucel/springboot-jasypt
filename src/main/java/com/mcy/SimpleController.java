	package com.mcy;
	
	import javax.annotation.PostConstruct;
	
	import org.springframework.beans.factory.annotation.Value;
	import org.springframework.stereotype.Controller;
	
	import lombok.extern.slf4j.Slf4j;
	
	@Slf4j
	@Controller
	public class SimpleController {
	
		@Value("${mcy.message}")
		private String message;
	
		@Value("${mcy.person}")
		private String person;
	
		@PostConstruct
		private void init() {
			log.info("{} {}", message, person);
		}
	
	}

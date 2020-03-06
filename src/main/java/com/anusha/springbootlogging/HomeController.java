package com.anusha.springbootlogging;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HomeController {
	
	Logger logger = LoggerFactory.getLogger(HomeController.class);

   @GetMapping
    public String home(){

	   logger.trace("All good dev changes");
        return "Hello Logging";
    }


}

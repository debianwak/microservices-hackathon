package com.lendingclub.hackathon.linvestors.linvestors;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GrowController {
	private Logger log = Logger.getLogger("UrlController.class");
	
	@RequestMapping("/new-investor-graph")
    public String getURL() {		
		log.log(Level.INFO, "returning new-investor-graph");   
        return "grow-result";
    }
}
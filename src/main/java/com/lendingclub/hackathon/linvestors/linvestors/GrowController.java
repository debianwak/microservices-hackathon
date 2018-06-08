package com.lendingclub.hackathon.linvestors.linvestors;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GrowController {
	private Logger log = Logger.getLogger("GrowController.class");
	
	@RequestMapping(value = "/new-investor-graph")
    public String getGraph() {		
		log.log(Level.INFO, "returning new-investor-graph");   
        return "grow-result";
    }
	
	@RequestMapping(value = "/new-investor-graph-html")
    public String getGraphHtml() {		
		log.log(Level.INFO, "returning new-investor-graph-html");
		
        return "grow-result";
    }
}

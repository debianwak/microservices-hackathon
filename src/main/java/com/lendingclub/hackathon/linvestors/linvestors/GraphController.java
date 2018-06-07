package com.lendingclub.hackathon.linvestors.linvestors;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GraphController {
	
	@RequestMapping("/url")
    public String getURL() {
        return "http://algunra-url-a-la-grafica";
    }


}

package com.lendingclub.hackathon.linvestors.linvestors;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UrlController {
    
    private Logger log = Logger.getLogger("UrlController.class");

    @RequestMapping(value = "/url", method = RequestMethod.POST, produces = "text/plain", consumes = "application/json")
    @ResponseBody
    public String getURL(@RequestBody String json) {
        log.log(Level.INFO, "json text-->{0}",json);        
       return "{ fulfillmentText: 'http://algunra-url-a-la-grafica' }";
    }

}
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

    @RequestMapping(value = "/url", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    @ResponseBody
    public String getURL(@RequestBody String json) {

       log.log(Level.INFO, "json text-->{0}",json);        
       String response = "message: [{\"imageUrl\": \"https://www.africabusinessclassroom.com/wp-content/uploads/2015/07/investment-1.jpg\",\"platform\": \"google\",\"type\": 3}]";
	   log.log(Level.INFO, "json text response-->{0}",response);
	   return response;
    }
}
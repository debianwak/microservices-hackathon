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
       //return "{ fulfillmentText: '[would you like me to send the information to your email?] (https://graph-bot-graphservice.7e14.starter-us-west-2.openshiftapps.com/new-investor-graph)' }";
       return "{\r\n" + 
       		"   \"conversationToken\":\"\",\r\n" + 
       		"   \"expectUserResponse\":true,\r\n" + 
       		"   \"expectedInputs\":[\r\n" + 
       		"      {\r\n" + 
       		"         \"inputPrompt\":{\r\n" + 
       		"            \"richInitialPrompt\":{\r\n" + 
       		"               \"items\":[\r\n" + 
       		"                  {\r\n" + 
       		"                     \"simpleResponse\":{\r\n" + 
       		"                        \"textToSpeech\":\"Investment Graphic!\"\r\n" + 
       		"                     }\r\n" + 
       		"                  },\r\n" + 
       		"                  {\r\n" + 
       		"                     \"basicCard\":{\r\n" + 
       		"                        \"title\":\"Your Monthly Performance\",\r\n" + 
       		"                        \"formattedText\":\"This is an example\",\r\n" + 
       		"                        \"image\":{\r\n" + 
       		"                           \"url\":\"https://www.africabusinessclassroom.com/wp-content/uploads/2015/07/investment-1.jpg\",\r\n" + 
       		"                           \"accessibilityText\":\"Image alternate text\"\r\n" + 
       		"                        },\r\n" + 
       		"                        \"buttons\":[\r\n" + 
       		"                           {\r\n" + 
       		"                              \"title\":\"Read more\",\r\n" + 
       		"                              \"openUrlAction\":{\r\n" + 
       		"                                 \"url\":\"https://graph-bot-graphservice.7e14.starter-us-west-2.openshiftapps.com/new-investor-graph\"\r\n" + 
       		"                              }\r\n" + 
       		"                           }\r\n" + 
       		"                        ],\r\n" + 
       		"                        \"imageDisplayOptions\":\"CROPPED\"\r\n" + 
       		"                     }\r\n" + 
       		"                  }\r\n" + 
       		"               ],\r\n" + 
       		"               \"suggestions\":[\r\n" + 
       		"\r\n" + 
       		"               ]\r\n" + 
       		"            }\r\n" + 
       		"         },\r\n" + 
       		"         \"possibleIntents\":[\r\n" + 
       		"            {\r\n" + 
       		"               \"intent\":\"actions.intent.TEXT\"\r\n" + 
       		"            }\r\n" + 
       		"         ]\r\n" + 
       		"      }\r\n" + 
       		"   ]\r\n" + 
       		"}";
    }

}
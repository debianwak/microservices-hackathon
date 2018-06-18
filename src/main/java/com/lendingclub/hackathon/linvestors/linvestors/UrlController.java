package com.lendingclub.hackathon.linvestors.linvestors;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


@RestController
public class UrlController {
    
    private Logger log = Logger.getLogger("UrlController.class");

    @RequestMapping(value = "/url", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
@ResponseBody
public JsonObject getURL(@RequestBody String json) {
   log.log(Level.INFO, "json text-->{0}",json);

   String jsonString = "\"message\": [{\"buttons\": [{\"openUrlAction\": {\"url\": \"https://graph-bot-graphservice.7e14.starter-us-west-2.openshiftapps.com/new-investor-graph\"},\"title\": \"Graph Demo\"}],\"formattedText\": \"Investment Graphic!\",\"image\": {"+
	   "\"url\": \"https://www.africabusinessclassroom.com/wp-content/uploads/2015/07/investment-1.jpg\",\"accessibilityText\": \"Investment Graphic!\"},\"platform\": \"google\",\"subtitle\": \"LendingClub\",\"title\": \"LendingClub Graph\",\"type\": \"basic_card\"}]";
	log.log(Level.INFO, "json text response-->{0}",jsonString);
   JsonParser parser = new JsonParser();
   JsonObject objectJson = parser.parse(jsonString).getAsJsonObject();
   return objectJson;
}
}
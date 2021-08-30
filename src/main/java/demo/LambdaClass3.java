package demo;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import demo.model.Person;

import java.util.Map;

public class LambdaClass3 implements RequestHandler<Map, Person> {

    @Override
    public Person handleRequest(Map map, Context context) {
        final LambdaLogger logger = context.getLogger();
        final ObjectMapper mapper = new ObjectMapper();
        logger.log("Initializing");

        try {
            final String value = mapper.writeValueAsString(map);
            System.out.println(value);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        logger.log(map.get("name").toString());
        return null;
    }
}

package demo;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.json.JsonMapper;
import demo.model.Person;

public class LambdaClass2 implements RequestHandler<String, Person> {

    @Override
    public Person handleRequest(String input, Context context) {
        final LambdaLogger logger = context.getLogger();
        logger.log("Initializing...");

        final JsonMapper mapper = new JsonMapper();
        Person person = new Person();
        try {
            person = mapper.readValue(input, Person.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        logger.log(person.getName());
        logger.log(person.getLastname());
        logger.log(String.valueOf(person.getAge()));
        return person;
    }
}

package demo;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.HashMap;
import java.util.UUID;

public class LambdaClass1 implements RequestHandler<Object, String> {

    //Lambda Examples (https://github.com/awsdocs/aws-lambda-developer-guide/tree/main/sample-apps)

    /**
     * To execute from lambda you must build a controller with following format package.Class::method
     * for instance: demo.Hello::handleRequest
     * @param input
     * @param context
     * @return
     */
    @Override
    public String handleRequest(Object input, Context context) {
        final LambdaLogger logger = context.getLogger();
        logger.log("lambda-poc-" + UUID.randomUUID());

        HashMap<String, String> map = (HashMap<String, String>) input;

        logger.log(map.get("lastname"));
        return "Hello World, it's my first lambda";
    }
}

package com.example;

import com.amazonaws.services.lambda.runtime.events.SQSEvent;
import java.util.function.Function;
import io.micronaut.function.FunctionBean;

@FunctionBean("function-bean")
public class SQSFunction implements Function<SQSEvent, String> {
    @Override
    public String apply(SQSEvent sqsEvent) {
        return "Received from SQS Bean!";
    }
}
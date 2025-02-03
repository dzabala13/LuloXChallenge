package co.danielzabalaing.services;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;

import java.util.Arrays;

public class BaseTest {

    // like we declared this variable  "spec" we can use it in another class that
    //inherit of this class
    RequestSpecification spec;

    // this is a constructor of the class
    public BaseTest(){
        spec = new RequestSpecBuilder()
                .setBaseUri("https://api.restful-api.dev")
                .addFilters(Arrays.asList(new RequestLoggingFilter(), new ResponseLoggingFilter()))
                .build();
    }
}

package com.api.base;

import com.api.models.request.AddRequest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class BaseService {
    private static final String BASE_URL = "https://api.restful-api.dev";
    private RequestSpecification requestSpecification;


    public  BaseService(){
        requestSpecification = given().baseUri(BASE_URL);
    }
    protected Response postRequest(AddRequest payload, String endpoint){
        return requestSpecification
                .contentType(ContentType.JSON)
                .body(payload)
                .post(endpoint);
    }
}

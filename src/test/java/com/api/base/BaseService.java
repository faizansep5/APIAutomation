package com.api.base;

import com.api.models.request.AddRequest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.Map;

import static io.restassured.RestAssured.*;

public class BaseService {
    private static final String BASE_URL = "https://api.restful-api.dev";
    private RequestSpecification requestSpecification;


    public BaseService() {
        requestSpecification = given().baseUri(BASE_URL);
    }

    protected Response postRequest(Object payload, String endpoint) {
        return postRequest(payload, endpoint, null);
    }

    protected Response postRequest(Object payload, String endpoint, Map<String, String> headers) {
        RequestSpecification req = requestSpecification;
        req.contentType(ContentType.JSON)
                .body(payload);

        if (headers != null) {
            req.headers(headers);
        }
        return req.post(endpoint);
    }
}

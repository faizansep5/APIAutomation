package com.api.authentication;

import com.api.base.BaseService;
import com.api.models.request.AddRequest;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

public class AuthenticationService extends BaseService {

    String BASE_PATH = "/collections/products";
    String API_KEY = "aa9169eb-b5fb-4dc8-8deb-ac0ad3c6b604";
    public Response add(AddRequest payload){
        Map<String, String> headers = new HashMap<>();
        headers.put("x-api-key", API_KEY);
        return postRequest(payload, BASE_PATH+"/objects", headers);
    }
}

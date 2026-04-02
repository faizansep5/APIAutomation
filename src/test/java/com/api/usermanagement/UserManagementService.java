package com.api.usermanagement;

import com.api.base.BaseService;
import com.api.models.request.AddRequest;
import io.restassured.response.Response;

public class UserManagementService extends BaseService {
    public Response add(AddRequest payload){
        return postRequest(payload,"/objects");
    }
}

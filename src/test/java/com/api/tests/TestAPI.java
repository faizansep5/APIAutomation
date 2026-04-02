package com.api.tests;

import com.api.base.BaseService;
import com.api.models.request.AddRequest;
import com.api.usermanagement.UserManagementService;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class TestAPI extends BaseService {
    @Test
    public void apiTest() {
        UserManagementService umService = new UserManagementService();
        AddRequest addRequest = new AddRequest();

        AddRequest.DataDTO data = new AddRequest.DataDTO();
        data.setYear(2019);
        data.setPrice(1849.99);
        data.setCpuModel("Intel Core i9");
        data.setHardDiskSize("1 TB");

        addRequest.setName("Apple MacBook Pro 16");
        addRequest.setData(data);

        Response res = umService.add(addRequest);
        System.out.println(res.asPrettyString());
    }

}

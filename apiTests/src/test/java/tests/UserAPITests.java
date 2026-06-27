package tests;

import static org.testng.Assert.*;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseAPI;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import payLoads.UserPayLoad;

public class UserAPITests extends BaseAPI {

    @BeforeMethod
    public void setUp() {

        setup();

    }

    @Test(priority = 1)
    public void verifyGetUser() {

        Response response = request
                .when()
                .get("/posts/1");

        response.then().statusCode(200);

        assertEquals(response.jsonPath().getInt("id"), 1);
        assertEquals(response.jsonPath().getInt("userId"), 1);
        assertNotNull(response.jsonPath().getString("title"));

        System.out.println(response.asPrettyString());

    }

    @Test(priority = 2)
    public void verifyCreateUser() {

        UserPayLoad payload = new UserPayLoad();

        payload.setTitle("API Automation");
        payload.setBody("Rest Assured Assignment");
        payload.setUserId(1);

        Response response = request
                .contentType(ContentType.JSON)
                .body(payload)
                .when()
                .post("/posts");

        response.then().statusCode(201);

        assertEquals(response.jsonPath().getString("title"), "API Automation");
        assertEquals(response.jsonPath().getInt("userId"), 1);
        assertNotNull(response.jsonPath().getString("id"));

        System.out.println(response.asPrettyString());

    }

    @Test(priority = 3)
    public void verifyInvalidRequest() {

        Response response = request
                .when()
                .get("/posts/999999");

        response.then().statusCode(404);

        System.out.println(response.asPrettyString());

    }

}
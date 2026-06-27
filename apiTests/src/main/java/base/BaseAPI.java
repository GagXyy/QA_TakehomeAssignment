package base;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import utilities.ConfigReader;

public class BaseAPI {

    protected RequestSpecification request;

    public void setup() {

        ConfigReader config = new ConfigReader();

        RestAssured.baseURI = config.getBaseUrl();

        request = RestAssured
                .given()
                .header("Content-Type", "application/json");

    }

}
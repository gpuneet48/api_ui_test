package apiSteps;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class APIStepData {

    protected Response response;
    protected ValidatableResponse json;
    protected RequestSpecification request;

}
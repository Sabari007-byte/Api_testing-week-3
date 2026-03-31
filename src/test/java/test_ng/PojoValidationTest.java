package test_ng;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
import pojo.ProjectPojo;

import static org.hamcrest.Matchers.equalTo;

public class PojoValidationTest {

    @Test
    public void validatePojoResponse() {

        RestAssured.baseURI = "http://49.249.28.218:8091";

        ProjectPojo pojo = new ProjectPojo(
                "Sabarinathan",
                "PojoValidation",
                "Created",
                4
        );

        RestAssured
                .given()
                .contentType("application/json")
                .body(pojo)
                .when()
                .post("/addProject")
                .then()
                .statusCode(201)
                .body("createdBy", equalTo("Sabarinathan"))
                .log().all();
    }
}
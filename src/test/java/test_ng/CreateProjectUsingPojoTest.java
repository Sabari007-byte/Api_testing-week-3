package test_ng;

import org.testng.annotations.Test;
import pojo.ProjectPojo;
import io.restassured.RestAssured;

public class CreateProjectUsingPojoTest {

    @Test
    public void createProjectWithPojo() {

        RestAssured.baseURI = "http://49.249.28.218:8091";

        // Create POJO object
        ProjectPojo pojo = new ProjectPojo(
                "Sabarinathan",
                "PojoProject",
                "Created",
                5
        );

        RestAssured
                .given()
                .contentType("application/json")
                .body(pojo) // serialization happens here
                .when()
                .post("/addProject")
                .then()
                .statusCode(201)
                .log().all();
    }
}
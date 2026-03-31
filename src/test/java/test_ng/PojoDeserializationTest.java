package test_ng;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import pojo.ProjectPojo;

public class PojoDeserializationTest {

    @Test
    public void getProjectAsPojo() {

        RestAssured.baseURI = "http://49.249.28.218:8091";

        Response res = RestAssured
                .given()
                .get("/projects/TY_PROJ_001");

        ProjectPojo pojo = res.as(ProjectPojo.class);

        System.out.println("Created By: " + pojo.getCreatedBy());
        System.out.println("Project Name: " + pojo.getProjectName());
    }
}
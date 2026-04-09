package crudOperationUsingTestNG;

import org.testng.annotations.Test;
import io.restassured.RestAssured;

import java.io.File;

public class UploadAnImageUsingFormParameter {

@Test
public void run() {

File file = new File("./src/test/resources/download (5).jpeg");

RestAssured.given()
.pathParam("petId", 1)
.multiPart("file", file)

.when()
.post("https://petstore.swagger.io/v2/pet/{petId}/uploadImage")

.then()
.log().all();

}

}
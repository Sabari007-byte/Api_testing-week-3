package crudOperationUsingTestNG;

import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class UpdatePetWithFormData {

@Test
public void updatePet() {

RestAssured.given()
.formParam("name", "Doggie")

.when()
.post("https://petstore.swagger.io/v2/pet/101")

.then()
.log().all();

}

}
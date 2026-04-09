package crudOperationUsingTestNG;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class FindPetByStatus {

	//Query parameter	
	
	@Test
	public void findByStatus() {
		
		RestAssured.given()
		.queryParam("findByStatus","sold")
		
		.when()
		.get("https://petstore.swagger.io/v2/pet/findByStatus")
		
		.then()
		.log().all();
		
	}
	
}

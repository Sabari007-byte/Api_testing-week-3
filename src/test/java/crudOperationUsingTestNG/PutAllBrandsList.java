package crudOperationUsingTestNG;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PutAllBrandsList {

	@Test
	public void update() {
		// PRE CONDITION
		RestAssured.given()
        
	// HTTP METHOD
		.when()
			.put("https://automationexercise.com/api/brandsList")
		
	// RESPONSE
		.then()
			.log().all();
	}
	
}

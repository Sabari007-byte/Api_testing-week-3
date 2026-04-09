package crudOperationUsingTestNG;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class CreateProductsList {
	
	@Test
	void create() {
		
//			// PRE CONDITION
		RestAssured.given()
        
	// HTTP METHOD
		.when()
			.post("https://automationexercise.com/api/productsList")
		
	// RESPONSE
		.then()
			.log().all();	
	}
	
}

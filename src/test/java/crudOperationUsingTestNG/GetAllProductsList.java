package crudOperationUsingTestNG;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetAllProductsList {

	@Test
	public void get() {
		// PRE CONDITION
				RestAssured.given()
		        
			// HTTP METHOD
				.when()
					.get("https://automationexercise.com/api/productsList")
				
			// RESPONSE
				.then()
					.log().all();
	}
	
}	

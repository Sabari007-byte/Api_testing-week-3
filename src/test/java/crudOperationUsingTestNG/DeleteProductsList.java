package crudOperationUsingTestNG;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeleteProductsList {
	
	@Test
	public void delete()
	{
		// PRE CONDITION
				RestAssured.given()
		        
			// HTTP METHOD
				.when()
					.delete("https://automationexercise.com/api/deleteAccount")
				
			// RESPONSE
				.then()
					.log().all();

	}
}

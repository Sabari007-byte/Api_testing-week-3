package testNG;

import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class GetProject {
	@Test
	public void getProjectTest() {
		
		// PRE CONDITION
		RestAssured.given()
        
		// HTTP METHOD
			.when()
				.get("http://49.249.28.218:8091/project/NH_PROJ_3212")
			
		// RESPONSE
			.then()
				.log().all();
	}
}

package testNG;

import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class DeleteProjectByID {
	@Test
	public void deleteProjectTest() {

		// PRE CONDITION
		RestAssured.given()
        
		// HTTP METHOD
			.when()
				.delete("http://49.249.28.218:8091/project/NH_PROJ_3212")
			
		// RESPONSE
			.then()
				.log().all();
	}
}
package testNG;

import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class UpdateProjectByID {
	@Test
	public void updateProjectTest() {
		
		// PRE CONDITION
		RestAssured.given()
			.contentType("application/json")
			.body("{\r\n"
					+ "  \"createdBy\": \"MoitheGreat\",\r\n"
					+ "  \"projectName\": \"test3210207\",\r\n"
					+ "  \"status\": \"Ongoing\",\r\n"
					+ "  \"teamSize\": 0\r\n"
					+ "}")
        
		// HTTP METHOD
			.when()
				.put("http://49.249.28.218:8091/project/NH_PROJ_3212")
			
		// RESPONSE
			.then()
				.log().all();
		}	
}

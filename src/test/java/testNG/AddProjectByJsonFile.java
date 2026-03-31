package testNG;

import java.io.File;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class AddProjectByJsonFile {
	@Test
	public void addProjectTest() {
		
		File json_file = new File("./src/test/resources/testngdata.json");

        // PRE CONDITION
        RestAssured.given()
            .contentType("application/json")
            .body(json_file)

        // HTTP METHOD
        .when()
            .post("http://49.249.28.218:8091/addProject")

        // RESPONSE
        .then()
            .log().all();
    }
}

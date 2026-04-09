package crudOperationUsingTestNG;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class RequestBody_FromExternalFile {
	
	@Test
	public void createProject() {
		File json_file = new File("./src/test/resources/CreateProject_Data.json");
		
		RestAssured.given()
		.contentType(ContentType.JSON)
		.body(json_file)
		
		.when()
		.post("http://49.249.28.218:8091/addProject")
		
		.then()
		.log().all();
	}
}

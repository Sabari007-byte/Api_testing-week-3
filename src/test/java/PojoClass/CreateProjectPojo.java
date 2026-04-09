package PojoClass;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class CreateProjectPojo {

	@Test
	public void create() {
		
		CreateProject obj = new CreateProject();
		obj.setCreatedBy("Hemaraj");
		obj.setProjectName("DFGHJKL");
		obj.setStatus("Ongoing");
		obj.setTeamSize(0);
		
		RestAssured.given()
		.contentType(ContentType.JSON)
		.body(obj)
		
		.when()
		.post("http://49.249.28.218:8091/addProject")
		
		.then()
		.log().all();
		
		
	}
	
	
}

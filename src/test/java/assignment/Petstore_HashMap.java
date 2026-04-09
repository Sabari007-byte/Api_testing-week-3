package assignment;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import java.util.*;

import io.restassured.http.ContentType;


public class Petstore_HashMap {
	
	
	@Test
	void createUser() {

	HashMap<String,Object> data = new HashMap<>();

	data.put("id", 101);
	data.put("username", "user");
	data.put("firstName", "A");
	data.put("lastName", "Z");
	data.put("email", "testaz@gmail.com");
	data.put("password", "123456");
	data.put("phone", "9876543210");
	data.put("userStatus", 1);

	given()
	.log().all()
	.contentType("application/json")
	.body(data)

	.when()
	.post("https://petstore.swagger.io/v2/user")

	.then()
	.log().all()
	.statusCode(200);

	}
	
	
	@Test
	void updateUser() {

	HashMap<String,Object> data = new HashMap<>();

	data.put("id", 101);
	data.put("username", "user");
	data.put("firstName", "HJI");
	data.put("lastName", "Update");
	data.put("email", "testupdated@test.com");
	data.put("password", "1234567");
	data.put("phone", "9999999999");
	data.put("userStatus", 1);

	given()
	.log().all()
	.contentType("application/json")
	.body(data)

	.when()
	.put("https://petstore.swagger.io/v2/user/user")

	.then()
	.log().all()
	.statusCode(200);
	}
	

	    	    
	    @Test
	    public void updatePet() {

	        HashMap<String,Object> body = new HashMap<>();
	        body.put("id",101);
	        body.put("name","ScoobyUpdated");
	        body.put("status","sold");

	        given()
	            .baseUri("https://petstore.swagger.io/v2")
	            .contentType(ContentType.JSON)
	            .body(body)

	        .when()
	            .put("/pet")

	        .then()
	            .statusCode(200)
	            .log().all();
	    }

	    @Test
	    public void getPet() {

	        given()
	            .baseUri("https://petstore.swagger.io/v2")
	            .pathParam("petId", 102)

	        .when()
	            .get("/pet/{petId}")

	        .then()
	            .statusCode(200)
	            .log().all();
	    }

	    @Test
	    public void deletePet() {

	        given()
	            .baseUri("https://petstore.swagger.io/v2")
	            .pathParam("petId", 102)

	        .when()
	            .delete("/pet/{petId}")

	        .then()
	            .statusCode(200)
	            .log().all();
	    }
	    
	    @Test
	    public void addPet() {

	        // Category object
	        HashMap<String, Object> category = new HashMap<>();
	        category.put("id", 1);
	        category.put("name", "dog");

	        // Tag object
	        HashMap<String, Object> tag = new HashMap<>();
	        tag.put("id", 1);
	        tag.put("name", "friendly");

	        // Tags list
	        List<HashMap<String, Object>> tags = new ArrayList<>();
	        tags.add(tag);

	        // PhotoUrls list
	        List<String> photoUrls = new ArrayList<>();
	        photoUrls.add("https://www.pexels.com/search/dog/");

	        // Main request body
	        HashMap<String, Object> body = new HashMap<>();
	        body.put("id", 101);
	        body.put("category", category);
	        body.put("name", "doggie");
	        body.put("photoUrls", photoUrls);
	        body.put("tags", tags);
	        body.put("status", "available");

	        given()
	            .baseUri("https://petstore.swagger.io/v2")
	            .contentType(ContentType.JSON)
	            .body(body)

	        .when()
	            .post("/pet")

	        .then()
	            .statusCode(200)
	            .log().all();
	    }

	}
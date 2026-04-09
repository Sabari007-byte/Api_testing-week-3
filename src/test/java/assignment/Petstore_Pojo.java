package assignment;

import static io.restassured.RestAssured.*;

import java.util.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Petstore_Pojo {

    @Test
    public void addPet() {

        Category category = new Category();
        category.setId(1);
        category.setName("dog");

        Tag tag = new Tag();
        tag.setId(1);
        tag.setName("friendly");

        List<Tag> tagList = new ArrayList<>();
        tagList.add(tag);

        List<String> photoUrls = new ArrayList<>();
        photoUrls.add("https://example.com/dog.jpg");

        Pet pet = new Pet();
        pet.setId(101);
        pet.setCategory(category);
        pet.setName("doggie");
        pet.setPhotoUrls(photoUrls);
        pet.setTags(tagList);
        pet.setStatus("available");

        given()
            .contentType(ContentType.JSON)
            .body(pet)

        .when()
            .post("https://petstore.swagger.io/v2/pet")

        .then()
            .statusCode(200)
            .log().all();
    }
    
    @Test
	public void retrievePet() {
		
    	given()
    	.pathParam("petID", 101)
    	
    	.when()
    	.get("https://petstore.swagger.io/v2/pet/{petID}")
    	
    	.then()
    	.log().all();
    	
	}
    
    @Test
    public void updatePet() {
    	given()
    	.contentType(ContentType.JSON)
    	.body("{\r\n"
    			+ "  \"id\": 1,\r\n"
    			+ "  \"category\": {\r\n"
    			+ "    \"id\": 1,\r\n"
    			+ "    \"name\": \"ABC\"\r\n"
    			+ "  },\r\n"
    			+ "  \"name\": \"DEF\",\r\n"
    			+ "  \"photoUrls\": [\r\n"
    			+ "    \"string\"\r\n"
    			+ "  ],\r\n"
    			+ "  \"tags\": [\r\n"
    			+ "    {\r\n"
    			+ "      \"id\": 1,\r\n"
    			+ "      \"name\": \"VBN\"\r\n"
    			+ "    }\r\n"
    			+ "  ],\r\n"
    			+ "  \"status\": \"available\"\r\n"
    			+ "}")
    	
    	.when()
    	.put("https://petstore.swagger.io/v2/pet")
    	
    	.then()
    	.log().all();
    	
    }
    
    @Test
    public void deletePetByID() {
    	given()
    	.pathParam("petID", 101)
    	
    	.when()
    	.delete("https://petstore.swagger.io/v2/pet/{petID}")
    	
    	.then()
    	.log().all();
    	
     }
   
}
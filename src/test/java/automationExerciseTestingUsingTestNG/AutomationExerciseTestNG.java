package automationExerciseTestingUsingTestNG;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class AutomationExerciseTestNG {
	
	final String baseURL = "https://automationexercise.com/api";
	
	@Test
	public void create() {

	RestAssured.given()

	.pathParam("endpoint", "createAccount")

	.formParam("name", "Sabari")
	.formParam("email", "sabari@example.com")
	.formParam("password", "Password@123")
	.formParam("title", "Mr")
	.formParam("birth_date", "15")
	.formParam("birth_month", "08")
	.formParam("birth_year", "1998")
	.formParam("firstname", "Sabari")
	.formParam("lastname", "P")
	.formParam("company", "ABC Technologies")
	.formParam("address1", "12, Anna Street")
	.formParam("address2", "Near Bus Stand")
	.formParam("country", "India")
	.formParam("zipcode", "625001")
	.formParam("state", "Tamil Nadu")
	.formParam("city", "Madurai")
	.formParam("mobile_number", "9876543210")

	.when()
	.post(baseURL + "/{endpoint}")

	.then()
	.log().all();

	}
	
	@Test
	public void retrieve() {

	RestAssured.given()
	.queryParam("email", "sabari@example.com")

	.when()
	.get(baseURL + "/getUserDetailByEmail")

	.then()
	.log().all();

	}
	
	@Test
	public void putBrandList() {
		
		RestAssured.given()
		.contentType(ContentType.JSON)
		.formParam("email", "head@gmail.com")
		
		.when()
		.put(baseURL + "/updateAccount")

		.then()
		.log().all();

	}
	
	@Test
	public void delete() {
		
		RestAssured.given()
		.contentType(ContentType.JSON)
		
		.when()
		.delete(baseURL+"/deleteAccount")
		
		.then()
		.log().all();
	}
	
	@Test
	public void getAllProductsList() {
		
		RestAssured.given()
		.contentType(ContentType.JSON)
		
		.when()
		.get(baseURL+"/productsList")
		
		.then()
		.log().all();
		
	}
	
	@Test
	public void postAllProductsList() {
		
		RestAssured.given()
		.contentType(ContentType.JSON)
		.body(" ")
		
		.when()
		.post(baseURL+"/productsList")
		
		.then()
		.log().all();
		
	}
	
	@Test
	public void getAllBrandsList() {
		
		RestAssured.given()
		.contentType(ContentType.JSON)
		
		.when()
		.get(baseURL+"/brandsList")
		
		.then()
		.log().all();
		
	}
	
	@Test
	public void putBrandsList() {
		
		RestAssured.given()
		.contentType(ContentType.JSON)
		.body(" ")
		
		.when()
		.put(baseURL+"/brandsList")
		
		.then()
		.log().all();
		
	}
	
	@Test
	public void postSearchProduct() {
		
		RestAssured.given()
		.contentType(ContentType.JSON)
		.body(" ")
		
		.when()
		.post(baseURL+"/searchProduct")
		
		.then()
		.log().all();
	
	}
	
	@Test
	public void searchProductWithoutParameter() {
		
		RestAssured.given()
		.contentType(ContentType.JSON)
		.body(" ")
		
		.when()
		.post(baseURL+"/searchProduct")
		
		.then()
		.log().all();
		
	}
	
	@Test
	public void verifyLogin() {
		
		RestAssured.given()
		.contentType(ContentType.JSON)
		.body("{\r\n"
				+ " \"email\": sabari@gmail.com,\r\n"
				+ " \"message\": \"zxcvbnm\"\r\n"
				+ "}")
		.when()
		.post(baseURL+"/verifyLogin")
		
		.then()
		.log().all();
	
	}
	
	@Test
	public void verifyLoginWithoutEmail() {
	
		RestAssured.given()
		.contentType(ContentType.JSON)
		.body("{\r\n"
				+ " \"email\": sabari@gmail.com,\r\n"
				+ "}")
		.when()
		.post(baseURL+"/verifyLogin")
		
		.then()
		.log().all();
	
	}
	
	@Test
	public void deleteLogin() {
		
		RestAssured.given()
		.contentType(ContentType.JSON)
		
		.delete(baseURL+"/verifyLogin")
		
		.then()
		.log().all();
	
	}
	
	@Test
	public void getUserDetailsByEmail() {
		
		RestAssured.given()
		.contentType(ContentType.JSON)
		
		.get(baseURL+"/getUserDetailByEmail")
		
		.then()
		.log().all();
	
	}
	
}

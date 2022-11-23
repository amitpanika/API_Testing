package Spotify.Spotify;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Album {
	public String token = "Bearer BQAXPKpz-Xw5lbsGynqzv6tdM9o3sOxaOMbNcAVQy0zMKGbsmAJEfb_1ZwPelEmjDDJUj0EsZRA3yOlbKtZgOeHLzSwZtJfDpgiFrG6diYK0XcYXlR0kIykIjNa_H617J3AVjv7mykXfGkbbsqhyd8iN0C5TpKQnrgldOUXMqV6BEgjmykHj69LwOaLIFia2GrtE9xS2XQbJUImHAeHptGFxt3QJJ21KjpppFwfJaIKKZNkro3I";
	
	@Test
	public void Get_Album() {
		Response response = given()
				.header("Accept", "application/json")
				.header("Content-Type", "application/json")
				.header("Authorization",token)
				.when()
				.get("https://api.spotify.com/v1/albums/4aawyAB9vmqN3uQ7FjRGTy?market=ES");
		         response.prettyPrint();
		         response.then().statusCode(200);
		
	}
	
	@Test
	public void Get_Album_Tracks() {
		Response response = given()
				.header("Accept", "application/json")
				.header("Content-Type", "application/json")
				.header("Authorization",token)
				.when()
				.get("https://api.spotify.com/v1/albums/4aawyAB9vmqN3uQ7FjRGTy/tracks?market=ES&limit=10&offset=5");
		         response.prettyPrint();
		         response.then().statusCode(200);

	}

     @Test
     public void Get_Several_Albums() {
 		Response response = given()
 				.header("Accept", "application/json")
 				.header("Content-Type", "application/json")
 				.header("Authorization",token)
 				.when()
 				.get("https://api.spotify.com/v1/albums?ids=382ObEPsp2rxGrnsizN5TX%2C1A2GTWGtFfWp7KSQTwWOyo%2C2noRn2Aes5aoNVsU6iWThc&market=ES");
 		         response.prettyPrint();
 		         response.then().statusCode(400);

     }







}
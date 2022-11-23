package Spotify.Spotify;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Browse {
	public String token = "Bearer BQCnA3VAsvteMbYtJ32Sd8-9bo67DG9o68biTPCmlDqSFPuLR0ctxfNyFOTTTHyZDb_Or0wKRL83VlQFTyOOup1yDwXMQc6Hgqy66ZaaqW0jrCiArNLStfGB6t-S4Suc2ZIPsGi034IJJlsOVEI6fuCRfJa4vOIvhU20rrsIvrWwppEAUBI2WhqGuVv-LaaAdzg63GhNj-qycMUUjnVBJO0tUMbrbx5_uQRuyZ9_cdQcJwQtzgI";
	
	@Test
	public void Get_Available_Genre_Seeds () {
		Response response = given()
				.header("Accept", "application/json")
				.header("Content-Type", "application/json")
				.header("Authorization",token)
				.when()
				.get("https://api.spotify.com/v1/recommendations/available-genre-seeds");
				 response.prettyPrint();
	}
	
	@Test
	public void Get_Several_Browse_Categories() {
		Response response = given()
				.header("Accept", "application/json")
				.header("Content-Type", "application/json")
				.header("Authorization",token)
				.when()
				.get("https://api.spotify.com/v1/browse/categories?country=SE&locale=sv_SE&limit=10&offset=5");
				 response.prettyPrint();
	}
	
	@Test
	public void Get_Single_Browse_Category() {
		Response response = given()
				.header("Accept", "application/json")
				.header("Content-Type", "application/json")
				.header("Authorization",token)
				.when()
				.get("https://api.spotify.com/v1/browse/categories/dinner?country=SE&locale=sv_SE");
				 response.prettyPrint();
	}
	
	@Test
	public void Get_Category_Playlists() {
		Response response = given()
				.header("Accept", "application/json")
				.header("Content-Type", "application/json")
				.header("Authorization",token)
				.when()
				.get("https://api.spotify.com/v1/browse/categories/dinner/playlists?country=SE&limit=10&offset=5");
				 response.prettyPrint();
	
	}
	
	@Test
	public void Get_Featured_Playlists() {
		Response response = given()
				.header("Accept", "application/json")
				.header("Content-Type", "application/json")
				.header("Authorization",token)
				.when()
				.get("https://api.spotify.com/v1/browse/featured-playlists?country=SE&locale=sv_SE&timestamp=2014-10-23T09%3A00%3A00.000Z&limit=10&offset=5");
				 response.prettyPrint();
				 response.then().statusCode(400);
	}
	
}

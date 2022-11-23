package Spotify.Spotify;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Shows {
	
	public String token = "Bearer BQAdkF8o1mhhmVGCYD5xRFGoOVt8xSp_W8fQSxN3BcYyQ7riJN6rgclwqhITe41Wx467gI_r0R_rovLIyLOktNc6e6lsTVFuTrCLLmyFr6ERedBAxUOQWQgs67X0C3a63u0RlfvPLyJzaPQD3D47Y9_HgkKbRWA7QxgXxlA15PitXdu6zm3d_wYrALHdi1gI5fwRdpUEjkvp-TtHBzy5MDOxd85z6PXwEk4n7ulEtbHMgGYD5X5x3h1zABfw_g";
	
	@Test
	public void Get_Several_Shows() {
		Response response = given()
				.header("Accept", "application/json")
				.header("Content-Type", "application/json")
				.header("Authorization",token)
				.when()
				.post("https://api.spotify.com/v1/shows?market=ES&ids=5CfCWKI5pZ28U0uOzXkDHe%2C5as3aKmN2k11yfDDDSrvaZ");
				 response.prettyPrint();
	
	}
	
	@Test
	public void Get_Show_Episodes() {
		Response response = given()
				.header("Accept", "application/json")
				.header("Content-Type", "application/json")
				.header("Authorization",token)
				.when()
				.get("https://api.spotify.com/v1/shows/38bS44xjbVVZ3No3ByF1dJ/episodes?market=ES&limit=10&offset=5");
				 response.prettyPrint();
	}
	
	@Test
	public void Get_Show() {
		Response response = given()
				.header("Accept", "application/json")
				.header("Content-Type", "application/json")
				.header("Authorization",token)
				.when()
				.get("https://api.spotify.com/v1/shows/38bS44xjbVVZ3No3ByF1dJ?market=ES");
				 response.prettyPrint();
	}
}

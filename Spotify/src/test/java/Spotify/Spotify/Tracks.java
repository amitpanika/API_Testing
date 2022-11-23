package Spotify.Spotify;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Tracks {
	
	public String token = "Bearer BQBjEB9ExIAurRF0O5JDFf7D1LvZ-kzoP6hmAQKmXoKn7yE5UDqkhaJI_FqSUs_Bik7hMm5oVn_rda_W1NW1IX2IGvPxX9WZOi2BwmW-ynWFb636xyy0Z9uPwcA55oXA3f2vREZ7Qy5Ry1a3f_4Y2dTyTlBRjhd4q4_QNlTlppnePvbNRTgeS0fNvKnL5L0-IZPm-V_2AKGd8ElLqosW_kLDh4tXTS9X8I8Hq0dHrW0LsuA0ZIpmSi7qo7iGD-0A";
	
	@Test
	public void Get_Track() {
		Response response = given()
				.header("Accept", "application/json")
				.header("Content-Type", "application/json")
				.header("Authorization",token)
				.when()
				.get("https://api.spotify.com/v1/tracks/11dFghVXANMlKmJXsNCbNl?market=ES");
				 response.prettyPrint();
}
	@Test
	public void Get_Several_Tracks() {
		Response response = given()
				.header("Accept", "application/json")
				.header("Content-Type", "application/json")
				.header("Authorization",token)
				.when()
				.get("https://api.spotify.com/v1/tracks?market=ES&ids=7ouMYWpwJ422jRcDASZB7P%2C4VqPOruhp5EdPBeR92t6lQ%2C2takcwOaAZWiXQijPHIx7B");
				 response.prettyPrint();
				 response.then().statusCode(200);
		         String spotify = response.path("external_urls.spotify");
		         System.out.println(spotify);
	}
	
	@Test
	public void Get_Track_Audio_Analysis() {
		Response response = given()
				.header("Accept", "application/json")
				.header("Content-Type", "application/json")
				.header("Authorization",token)
				.when()
				.get("https://api.spotify.com/v1/audio-analysis/11dFghVXANMlKmJXsNCbNl");
				 response.prettyPrint();
				 response.then().statusCode(200);
		         
	}
	
}
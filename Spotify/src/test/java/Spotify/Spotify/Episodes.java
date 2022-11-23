package Spotify.Spotify;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Episodes {
	public String token = "Bearer BQBdCV3EITDT9rKWF0YZQ9OlJSinuTEHl5dGxU6qUSJlXQyJ7dAoALmKH88llCctRa5NihRVujJmpgREa5aV_MvVJe6ukHGMSrl1eyBV7BHBLglu_S7klnkPH0PM93wXoF3TBISNVbCHgxRAC4y8wEqwP5vpGcd2oHvo6bNPSsSNkClttuGguGWkq7Ks3T6kLQzcVwTA";
	
	@Test
	public void Get_Episode () {
		Response response = given()
				.header("Accept", "application/json")
				.header("Content-Type", "application/json")
				.header("Authorization",token)
				.when()
				.get("https://api.spotify.com/v1/episodes/512ojhOuo1ktJprKbVcKyQ?market=ES");
				 response.prettyPrint();	
	}
	
	@Test
	public void Get_Several_Episodes() {
		Response response = given()
				.header("Accept", "application/json")
				.header("Content-Type", "application/json")
				.header("Authorization",token)
				.when()
				.get("https://api.spotify.com/v1/episodes?ids=77o6BIVlYM3msb4MMIL1jH%2C0Q86acNRm6V9GYx55SXKwf&market=ES");
				 response.prettyPrint();
	}
}

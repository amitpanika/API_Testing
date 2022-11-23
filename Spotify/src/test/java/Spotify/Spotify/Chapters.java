package Spotify.Spotify;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Chapters {
	public String token = "Bearer BQALhCwqRSvHNQXC2SSOpZ5murjA_G0G8I21bnOfaVCczDwWvpEtc6mu1-izPUTJLPxyNMaAvwj5UY9mdSuWf9Ats5qxVBpnSV5ojVZwzf3Ta1hHGDoeguFYT6fon_zhyeLvQSNMvXDybtQQHO_jTyr7s8ZST5tmbBXxjuonK8Wkdw9WJ0rxH_q7w_b6DY2q-CCz39SeRHsCf0MVsBmooDedsHzN3-QXUKO-PNxQ2gkYK7SMzl0";
	
	@Test
	public void Get_Chapter() {
		Response response = given()
				.header("Accept", "application/json")
				.header("Content-Type", "application/json")
				.header("Authorization",token)
				.when()
				.get("https://api.spotify.com/v1/chapters/38bS44xjbVVZ3No3ByF1dJ?market=ES");
				 response.prettyPrint();
	}
	
	@Test
	public void Get_Several_Chapters() {
		Response response = given()
				.header("Accept", "application/json")
				.header("Content-Type", "application/json")
				.header("Authorization",token)
				.when()
				.get("https://api.spotify.com/v1/chapters?ids=7ouMYWpwJ422jRcDASZB7P%2C4VqPOruhp5EdPBeR92t6lQ%2C2takcwOaAZWiXQijPHIx7B&market=ES");
				 response.prettyPrint();
	
	}
}

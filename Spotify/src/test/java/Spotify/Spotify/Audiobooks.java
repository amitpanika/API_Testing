package Spotify.Spotify;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

    public class Audiobooks {
    	
	public String token = "Bearer BQCbHrKkK0QPmrg4dFyIsbLyjzZdy5wKqH9YAanIDMyY8rwOMmuW1qq__qSeQIom0J9PZeOKVaBMlhcxlqrKhpuSwbCUIilKRfiaX_hPNmytH0KyZ7HJyVqcolwJooCXR3gOixNiI8D0AJgOBSlWYuzlzh1PUE-KbJPVyn3parNwGZP1qM_PXk4kOR4mgots3R71V2brYWZdWOnHvKrbtLvsbBGI-somvf1aJAowjLjpvCrRZnk";

	@Test
	public void Get_an_Audiobook() {
		
	 Response response = given()
	.header("Accept", "application/json")
	.header("Content-Type", "application/json")
	.header("Authorization",token)
	.when()
	.get("https://api.spotify.com/v1/audiobooks/38bS44xjbVVZ3No3ByF1dJ?market=ES");
	 response.prettyPrint();
	
	}
	
	@Test
	 public void Get_Several_Audiobooks () {
	 Response response = given()
		.header("Accept", "application/json")
		.header("Content-Type", "application/json")
		.header("Authorization",token)
		.when()
		.get("https://api.spotify.com/v1/audiobooks?ids=7ouMYWpwJ422jRcDASZB7P%2C4VqPOruhp5EdPBeR92t6lQ%2C2takcwOaAZWiXQijPHIx7B&market=ES");
		 response.prettyPrint();
	
}

}
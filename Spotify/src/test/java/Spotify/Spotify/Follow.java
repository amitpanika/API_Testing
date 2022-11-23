package Spotify.Spotify;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Follow {
	public String token ="Bearer BQArm6BUM0USnLRCynPdjqkd4qfJJRo7m8tRDpQZsE8M71RnpXbNyqwRQGobSNcWBjmD8maN6GS_uamUaKTOnkn48DdrGcgbozPTHr_2EGULCSTpfSAzMhuXgcExmTQhoWhtaCDXLP9FTbt6jzAZ_hkTE6ROOmSEogM81AMpV_0i_FFp9MVi0UqPFu_v-IwlMpIpsHjLjUI";
	
	@Test
	
	public void Get_Followed_Artists() {
		Response response = given()
				.header("Accept", "application/json")
				.header("Content-Type", "application/json")
				.header("Authorization",token)
				.when()
				.get("https://api.spotify.com/v1/me/following?type=artist&after=0I2XqVXqHScXjHhk6AYYRe&limit=10");
				 response.prettyPrint();	
	}
	
	@Test
	public void Check_if_Users_Follow_Playlist() {
		Response response = given()
				.header("Accept", "application/json")
				.header("Content-Type", "application/json")
				.header("Authorization",token)
				.when()
				.get("https://api.spotify.com/v1/playlists/3cEYpjA9oz9GiPac4AsH4n/followers/contains?ids=jmperezperez%2Cthelinmichael%2Cwizzler");
				 response.prettyPrint();	
	}
	
	@Test
	public void Check_If_User_Follows_Artists_or_Users() {
		Response response = given()
				.header("Accept", "application/json")
				.header("Content-Type", "application/json")
				.header("Authorization",token)
				.when()
				.get("https://api.spotify.com/v1/me/following/contains?type=artist&ids=2CIMQHirSU0MQqyYHq0eOx%2C57dN52uHvrHOxijzpIgu3E%2C1vCWHaC5f2uS3yhpwWbIA6");
				 response.prettyPrint();	
	}
	
	@Test
	public void Follow_Artists_or_Users () {
		Response response = given()
				.header("Accept", "application/json")
				.header("Content-Type", "application/json")
				.header("Authorization",token)
				.body("{ids:[\"74ASZWbe4lXaubB36ztrGX\",\"08td7MxkoHQkXnWAYD8d6Q\"]")
				.when()
				.put("https://api.spotify.com/v1/me/following?type=artist&ids=2CIMQHirSU0MQqyYHq0eOx%2C57dN52uHvrHOxijzpIgu3E%2C1vCWHaC5f2uS3yhpwWbIA6");
				 response.prettyPrint();	
	}
	
	@Test
	public void Unfollow_Playlist() {
		Response response = given()
				.header("Accept", "application/json")
				.header("Content-Type", "application/json")
				.header("Authorization",token)
				.when()
				.delete("https://api.spotify.com/v1/playlists/3cEYpjA9oz9GiPac4AsH4n/followers");
				 response.prettyPrint();
	}
	
	
	
	
	
	
	
	
	
	

}

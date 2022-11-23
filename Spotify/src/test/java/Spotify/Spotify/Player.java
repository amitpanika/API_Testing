package Spotify.Spotify;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Player {
	String token = "Bearer BQBkHBPpp2TSCNQhhZCKBO8UIGnXL4_zFWcWNJ_wlpvPdgPAxYjJwQM9oExfLa3ENGmrh6yeeHgI4vBKR-Ej1Z_SGRQrxxH94n8pahDQLsjgo6KAobbEU7I_B3D-nx41o4Ibo-gshR93wCLIU6x8dr9l9UMymXASnJ1NJL3wVmRcJUdqiDGBTjmYuM2RiLPaZJk5MF0";
	
	@Test
	public void Post_Request() {
		Response response = given()
				.header("Accept", "application/json")
				.header("Content-Type", "application/json")
				.header("Authorization",token)
				.when()
				.post("https://api.spotify.com/v1/me/player/queue?uri=spotify%3Atrack%3A4iV5W9uYEdYUVa79Axb7Rh&device_id=0d1841b0976bae2a3a310dd74c0f3df354899bc8");
				 response.prettyPrint();	
				 response.then().statusCode(403);
	}
	
	@Test
	public void Post_Request_Skip_To_Next() {
		Response response = given()
				.header("Accept", "application/json")
				.header("Content-Type", "application/json")
				.header("Authorization",token)
				.when()
				.post("https://api.spotify.com/v1/me/player/next?device_id=0d1841b0976bae2a3a310dd74c0f3df354899bc8");
				 response.prettyPrint();	
				 response.then().statusCode(403);
}
	
	@Test
	public void Post_Skip_To_Next() {
		Response response = given()
				.header("Accept", "application/json")
				.header("Content-Type", "application/json")
				.header("Authorization",token)
				.when()
				.post("https://api.spotify.com/v1/me/player/next?device_id=0d1841b0976bae2a3a310dd74c0f3df354899bc8");
				 response.prettyPrint();	
				 response.then().statusCode(403);
}
	
	@Test
	public void Put_Pause_Playback() {
		Response response = given()
				.header("Accept", "application/json")
				.header("Content-Type", "application/json")
				.header("Authorization",token)
				.when()
				.put("https://api.spotify.com/v1/me/player/pause?device_id=0d1841b0976bae2a3a310dd74c0f3df354899bc8");
				 response.prettyPrint();	
				 response.then().statusCode(403);
	}
	
	@Test
	public void Put_StartResume_Playback() {
		Response response = given()
				.header("Accept", "application/json")
				.header("Content-Type", "application/json")
				.header("Authorization",token)
				.when()
				.body("{\"context_uri\":\"spotify:album:5ht7ItJgpBH7W6vJ5BqpPr\",\"offset\":{\"position\":5},\"position_ms\":0};")
				.put("https://api.spotify.com/v1/me/player/pause?device_id=0d1841b0976bae2a3a310dd74c0f3df354899bc8");
				 response.prettyPrint();	
				 response.then().statusCode(403);
	}
	
	@Test
	public void Put_Set_Repeat_Mode() {
		Response response = given()
				.header("Accept", "application/json")
				.header("Content-Type", "application/json")
				.header("Authorization",token)
				.when()
				.put("https://api.spotify.com/v1/me/player/repeat?state=context&device_id=0d1841b0976bae2a3a310dd74c0f3df354899bc8");
				 response.prettyPrint();	
				 response.then().statusCode(403);
}
	
	@Test
	public void Put_Seek_To_Position() {
		Response response = given()
				.header("Accept", "application/json")
				.header("Content-Type", "application/json")
				.header("Authorization",token)
				.when()
				.put("https://api.spotify.com/v1/me/player/seek?position_ms=25000&device_id=0d1841b0976bae2a3a310dd74c0f3df354899bc8");
				 response.prettyPrint();	
				 response.then().statusCode(403);
	
	}
	
	@Test
	public void Put_Toggle_Playback_Shuffle() {
		Response response = given()
				.header("Accept", "application/json")
				.header("Content-Type", "application/json")
				.header("Authorization",token)
				.when()
				.put("https://api.spotify.com/v1/me/player/shuffle?state=true&device_id=0d1841b0976bae2a3a310dd74c0f3df354899bc8");
				 response.prettyPrint();	
				 response.then().statusCode(403);
}
	
	@Test
	public void Put_Set_Playback_Volume() {
		Response response = given()
				.header("Accept", "application/json")
				.header("Content-Type", "application/json")
				.header("Authorization",token)
				.when()
				.put("https://api.spotify.com/v1/me/player/volume?volume_percent=50&device_id=0d1841b0976bae2a3a310dd74c0f3df354899bc8");
				 response.prettyPrint();	
				 response.then().statusCode(403);

	}
	
	@Test
	public void Get_the_User_Queue() {
		Response response = given()
				.header("Accept", "application/json")
				.header("Content-Type", "application/json")
				.header("Authorization",token)
				.when()
				.get("https://api.spotify.com/v1/me/player/queue");
				 response.prettyPrint();	
				 response.then().statusCode(403);
	}
	
	@Test
	public void Get_Get_Recently_Played_Tracks() {
		Response response = given()
				.header("Accept", "application/json")
				.header("Content-Type", "application/json")
				.header("Authorization",token)
				.when()
				.get("https://api.spotify.com/v1/me/player/recently-played?limit=10&after=1484811043508");
				 response.prettyPrint();	
				 response.then().statusCode(403);
	}
	
	@Test
	public void Get_Available_Devices() {
		Response response = given()
				.header("Accept", "application/json")
				.header("Content-Type", "application/json")
				.header("Authorization",token)
				.when()
				.get("https://api.spotify.com/v1/me/player/devices");
				 response.prettyPrint();	
				 
	}
	
	
}


















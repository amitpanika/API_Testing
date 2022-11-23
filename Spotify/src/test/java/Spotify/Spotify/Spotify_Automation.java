package Spotify.Spotify;
import static io.restassured.RestAssured.given;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Spotify_Automation {
	
	public String token = "Bearer BQBiEawja4iTioDKf8pzoQZ-fjHvz7dN7QPi7_p4igplwj464yVbO2pZ0StFvKAvyM7o5koM_8vCBRBiHk_ZynXyuaxFKrqv1KAgvCXvEPiWc8vEDCKcjzpQn7udoHDeSIpaYgZUTyaaM2WoRvCNNq-db6jIe68HjqkxZidjq5ZzSMvAIEtSs9uRtUE4yR4L2CurhfHzlYoprklDSNk";
	
@Test
	public void User_id() {
		Response response = given()
				.header("Accept", "application/json")
				.header("Content-Type", "application/json")
				.header("Authorization",token)
				.when()
				.post("https://api.spotify.com/v1/users/31soxalytdrckwu34irr3bx27ifu");
				 response.prettyPrint();
		
}

@Test
     public void Add_Items() {
	Response response = given()
			.header("Accept", "application/json")
			.header("Content-Type", "application/json")
			.header("Authorization",token)
			.body("{\"uris\":[\"spotify:track:4iV5W9uYEdYUVa79Axb7Rh\",\"spotify:track:1301WleyT98MSxVHPZCA6M\",\"spotify:episode:512ojhOuo1ktJprKbVcKyQ\"]}")
			.when()
			.post("https://api.spotify.com/v1/playlists/03QoFbicqVWZz7tsadBsKW/tracks");
			 response.prettyPrint();
			 response.then().statusCode(201);
			 String message = response.path("error.message");
			 System.out.println(message);
			 
}

@Test
     public void Get_User_Playlists() {
	Response response = given()
			.header("Accept", "application/json")
			.header("Content-Type", "application/json")
			.header("Authorization",token)
			.when()
			.get("https://api.spotify.com/v1/users/31soxalytdrckwu34irr3bx27ifu/playlists");
	         response.prettyPrint();
	         response.then().statusCode(200);
	         String spotify = response.path("error.spotify");
	         System.out.println(spotify);
}

@Test
     public void Get_Playlists() {
	 Response response = given()
			.header("Accept", "application/json")
			.header("Content-Type", "application/json")
			.header("Authorization",token)
			.when()
			.get("https://api.spotify.com/v1/playlists/03QoFbicqVWZz7tsadBsKW");
	         response.prettyPrint();
	         response.then().statusCode(200);

}

@Test
     public void Get_Playlist_Items() {
	 Response response = given()
			.header("Accept", "application/json")
			.header("Content-Type", "application/json")
			.header("Authorization",token)
			.when()
			.get("https://api.spotify.com/v1/playlists/3cEYpjA9oz9GiPac4AsH4n/tracks");
	         response.prettyPrint();
	         response.then().statusCode(200);
	       
}

@Test
     public void Get_Playlist_Cover_Image() {
	 Response response = given()
			.header("Accept", "application/json")
			.header("Content-Type", "application/json")
			.header("Authorization",token)
			.when()
			.get("https://api.spotify.com/v1/playlists/3cEYpjA9oz9GiPac4AsH4n/images");
	         response.prettyPrint();
	       
}

@Test
     public void Get_Current_User_Playlists() {
	 Response response = given()
			.header("Accept", "application/json")
			.header("Content-Type", "application/json")
			.header("Authorization",token)
			.when()
			.get("https://api.spotify.com/v1/me/playlists?limit=10&offset=5");
	         response.prettyPrint();
	        
}

@Test
     public void Add_Custom_Playlist_CoverImage() {
	 Response response = given()
			.header("Accept", "application/json")
			.header("Content-Type", "application/json")
			.header("Authorization",token)
			.when()
			.get("https://api.spotify.com/v1/playlists/03QoFbicqVWZz7tsadBsKW/images");
	         response.prettyPrint();
	         response.then().statusCode(200);
}

@Test
     public void Update_Playlist_Items() {
	 Response response = given()
			.header("Accept", "application/json")
			.header("Content-Type", "application/json")
			.header("Authorization",token)
			.when()
			.put("https://api.spotify.com/v1/playlists/3cEYpjA9oz9GiPac4AsH4n/tracks\" --data");
	         response.prettyPrint();
	         response.then().statusCode(404);
}

@Test
     public void Change_Playlist_Details() {
	 Response response = given()
			.header("Accept", "application/json")
			.header("Content-Type", "application/json")
			.header("Authorization",token)
			.when()
			.put("https://api.spotify.com/v1/playlists/3cEYpjA9oz9GiPac4AsH4n/tracks\" --data");
	         response.prettyPrint();
	         response.then().statusCode(404);
    
}

}













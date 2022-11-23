package Spotify.Spotify;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

    public class Playlist {
	
	String token = "Bearer BQAM8T0K-rGTKnYwDIvQIqG6dXO4Kn6fyZX3C9C-RH_-S6M0eTv7-jbAGTLHALcojnR1Vx62rG_KuRXenGZEvloXoggL1HkSpzbilzwmHP38hqbE23cc3SFD-hXIjyBEPsD-kqQM1REdBjPZyA7u5s6PLlRddDX9zo9VqAUBeKVBva9HA32YKKjSo7TjC1KIQgb0lpnyDKQpQplHsSeiEf7tM4mE6XGm3YhCYcQSnE4ABo9anm6p1pdMfLL19NrO";
	
	@Test
	public void Create_Platlist() {
		Response response = given()
				.header("Accept", "application/json")
				.header("Content-Type", "application/json")
				.header("Authorization",token)
				.get("https://api.spotify.com/v1/users/{user_id}/playlists");
		         response.prettyPrint();
		         
	}

}

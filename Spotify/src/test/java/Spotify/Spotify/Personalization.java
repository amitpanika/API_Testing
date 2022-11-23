package Spotify.Spotify;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Personalization {
	public String token = "Bearer BQDAyVy4IArz0WFoaBo4P6Ree_uzN7DlJnbG6IbWLuWdl6AdhMZ3ayy5b35yvaepghJYnFD1NMOzvUaF4hKVXzcpfonPoYuS1_czxLhW5HW0udrvObMnLELF8ig6Iavtt5q3nhN1wDNfj6cu_LyHP1vKhpQMd5sHZpnCK3LsTgBkm5EBKceYiv9dItFB29QgEJkq63YPTVo";
	
	@Test
	public void Get_User_Top_Items() {
		Response response = given()
				.header("Accept", "application/json")
				.header("Content-Type", "application/json")
				.header("Authorization",token)
				.when()
				.get("https://api.spotify.com/v1/me/top/artists?time_range=medium_term&limit=10&offset=5");
				 response.prettyPrint();
				 response.then().statusCode(200);
	}

}

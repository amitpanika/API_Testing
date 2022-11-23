package Spotify.Spotify;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

 public class Search {
	 
	 public String token = "Bearer BQCmKi9f-Wx1mvQpbKInomjyNccwL2FlO75HB91_Roegkkf0rOk9QnG4KkrA2mGiCXJO8DW00nurmNbDTHS6d5PZHj9atdrOJwmdUclog6pD0ATZPJuT_yyXhWvo-WXcnBfsj12AQ7EnMYb-NJCeV9_UfSJKKXvCsIYWbilEMyN9dV2QQnRF9am01l61jTXSdTZ57LgKQCBlKVnvFLgxgGEwves-yRVTlCpwKUABCJRvQv_-7mU";
	
      @Test
	   public void Get_Search_For_Item() {
    	  Response response = given()
  				.header("Accept", "application/json")
  				.header("Content-Type", "application/json")
  				.header("Authorization",token)
  				.when()
  				.get("https://api.spotify.com/v1/search?q=remaster%2520track%3ADoxy%2520artist%3AMiles%2520Davis&type=track%2Cartist&market=ES&limit=10&offset=5");
  				 response.prettyPrint();	
  				String href = response.path("artists.href");
  				 System.out.println(href);
	}

}

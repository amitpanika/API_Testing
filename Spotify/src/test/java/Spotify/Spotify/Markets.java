package Spotify.Spotify;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Markets {
	
public String token = "Bearer BQD2BPqLkWZOtlPIBBgnwPVdj94P7HoR8St6k0iSVgYZ9Gig9Xu_CLhOzVdMW9Xd5Y4AjrsabvjZ2abEmtnKWAeitrDjl2u0rRPR0vtXs7rMv6g19uVpppHL1Z_gnv96M9HwJ2iSZS3CBeK6rgxaOso0aWwhTQpjiimWlISAJXX9fV4Vr_cTDTPm1Y3REU2iiJTwMl36Bsl6jYLMBlGL7o0_41QMZhtl2wjactdMMkcOVMCUCLV_xfusMS6T62ss";

        @Test
         public void Get_Available_Markets() {
        	Response response = given()
    				.header("Accept", "application/json")
    				.header("Content-Type", "application/json")
    				.header("Authorization",token)
    				.when()
    				.get("https://api.spotify.com/v1/markets");
    				 response.prettyPrint();	
        }

}

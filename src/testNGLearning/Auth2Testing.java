package testNGLearning;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Auth2Testing
{
	@org.testng.annotations.Test
	public void Testme()
	{
		Response resp = 
		RestAssured.given()
		.formParam("client_id", "OIDC-Discovery")
		.formParam("grant_type", "password")
		.formParam("username", "discover_test_user_4@mailinator.com")
		.formParam("password", "Password@1234")
		.post("https://auth-dev.cloud.precisely.services/auth/realms/precisely/protocol/openid-connect/token");
		
		System.out.println("Response Code: "+resp.getStatusCode());
		System.out.println(resp.getBody().asPrettyString());
		String token = resp.jsonPath().get("access_token");
		
		System.out.println("Token Value: " +token);
		
		
	}

}

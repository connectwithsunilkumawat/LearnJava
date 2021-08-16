package testNGLearning;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Auth2Test 
{

	@org.testng.annotations.Test
	public void Test()
	{
		Response resp = 
		RestAssured.given().auth().oauth2("7501c1074cf3eb65139be711e0d28d095a37a5e4")
		.post("http://coop.apps.symfonycasts.com/api/2167/chickens-feed");
		
		System.out.println("Response Code: "+resp.getStatusCode());
		System.out.println("Body: " +resp.getBody().asString());
		System.out.println("Another Body: "+ resp.jsonPath().prettify());
		//System.out.println("Another Body1: "+ resp.jsonPath().prettyPrint());
	}

}

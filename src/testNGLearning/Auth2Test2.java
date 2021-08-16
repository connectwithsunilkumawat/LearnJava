package testNGLearning;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Auth2Test2 
{
// https://www.youtube.com/watch?v=GMuFZMBZLg4
// http://coop.apps.symfonycasts.com/
	
	@Test
	public void accessValidAPI()
	{
		Response resp = RestAssured
		.given()
		.formParam("client_id", "SK")
		.formParam("client_secret", "ea4664003158bacb67e416bc4864c43d")
		.formParam("grant_type", "client_credentials")
		.post("http://coop.apps.symfonycasts.com/token");
		
		int response_Code =  resp.getStatusCode();
		Assert.assertEquals(response_Code, 200);
		
		System.out.println("Body: "+ resp.jsonPath().prettify());
		
		String token = resp.jsonPath().get("access_token");
		
		System.out.println("access_token: "+ token);
		
		
		
		Response res = RestAssured
		 .given()
		 .auth()
		 .oauth2(token)
		 .post("http://coop.apps.symfonycasts.com/api/2167/chickens-feed");
		
		int res_code =  res.getStatusCode();
		Assert.assertEquals(res_code, 200);
		
		System.out.println("Body: " +res.getBody().asString());
		System.out.println("Body: "+ res.jsonPath().prettify());
		
		String action = res.jsonPath().get("action");
		System.out.println("action: "+action);
		
		boolean success = res.jsonPath().get("success");
		System.out.println("success: "+success);
		
		String message = res.jsonPath().get("message");
		System.out.println("message: "+message);
		
		String data = res.jsonPath().get("data");
		System.out.println("data: "+data);
			
	}
	
	@Test
	public void accessInValidAPI()
	{
		Response resp = RestAssured
				.given()
				.formParam("client_id", "SK")
				.formParam("client_secret", "ea4664003158bacb67e416bc4864c43d")
				.formParam("grant_type", "client_credentials")
				.post("http://coop.apps.symfonycasts.com/token");
		
		int response_Code =  resp.getStatusCode();
		Assert.assertEquals(response_Code, 200);
		String token = resp.jsonPath().get("access_token");
		
		
		Response res = RestAssured
				 .given()
				 .auth()
				 .oauth2(token)
				 .post("http://coop.apps.symfonycasts.com/api/2167/eggs-collect");
				
				int res_code =  res.getStatusCode();
				System.out.println("Responce Code: "+res_code);
				Assert.assertEquals(res_code, 401);
	}

}

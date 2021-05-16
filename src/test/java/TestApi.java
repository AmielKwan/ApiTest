import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;

public class TestApi {

	@Test
	public void test1_post() 
	{
		JSONObject testp = new JSONObject();
		testp.put("name", "Amiel");
		testp.put("job", "Student");

		System.out.println(testp.toJSONString());

		given().
		body(testp.toJSONString()).
		when().
		post("https://reqres.in/api/users").
		then().
		statusCode(201);
	}
	
	@Test
	public void test2_put() 
	{
		JSONObject testp = new JSONObject();
		testp.put("name", "Amiel");
		testp.put("job", "Engineer");

		System.out.println(testp.toJSONString());

		given().
		body(testp.toJSONString()).
		when().
		put("https://reqres.in/api/users/2").
		then().
		statusCode(200);
	}

	@Test
	public void test3_patch() 
	{
		JSONObject testp = new JSONObject();
		testp.put("name", "Amiel");
		testp.put("job", "Father");

		System.out.println(testp.toJSONString());

		given().
		body(testp.toJSONString()).
		when().
		patch("https://reqres.in/api/users/2").
		then().
		statusCode(200);
	}
	
	@Test
	public void test4_get() 
	{
		System.out.println("Getting");
		when().
		get("https://reqres.in/api/users/2").
		then().
		statusCode(200).
		log().all();
	}
	
	@Test
	public void test5_delete() 
	{
		System.out.println("Deleting");
		when().
		delete("https://reqres.in/api/users/2").
		then().
		statusCode(204).
		log().all();;
	}
}
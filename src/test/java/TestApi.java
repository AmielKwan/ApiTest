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
}
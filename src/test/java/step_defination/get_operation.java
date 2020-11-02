package step_defination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;
import ty.generic.Spec_builder_Api;
import ty.utils.endpoint;

public class get_operation {
 	private RequestSpecification a1;
	private Response a2;

	@Given("^user enter the base url$")
    public void user_enter_the_base_url() throws Throwable 
	{
		a1 =RestAssured.given().spec(Spec_builder_Api.Request_spec_builder());
    }



	@When("^user enters the \"([^\"]*)\" endpoint with the GET http request$")
    public void user_enters_the_something_endpoint_with_the_get_http_request(String end) throws Throwable 
    {
    	
		  endpoint a3 = endpoint.valueOf(end);
    	a2 = a1.when().get(a3.get_end());
    }

	@Then("^user should get the statuscode as \"([^\"]*)\"$")
    public void user_should_get_the_statuscode_as_something(String statuscode) throws Throwable  
    {
		int a = Integer.parseInt(statuscode);
    	a2.then().extract().response();
    	System.out.println(a2.asString());
    	System.out.println(a2.getStatusLine());
    	Assert.assertEquals(a, a2.getStatusCode());
    }
}



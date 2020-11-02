package step_defination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class step_defination {
	   @Given("^User enter the base url$")
	    public void user_enter_the_base_url() throws Throwable {
	        System.out.println("Given");
	    }

	    @When("^User enter the list of user endpoint with the GET http Request$")
	    public void user_enter_the_list_of_user_endpoint_with_the_get_http_request() throws Throwable {
	    	 System.out.println("When");
	    }

	    @Then("^User should get the status codeas 200$")
	    public void user_should_get_the_status_codeas_200() throws Throwable {
	    	 System.out.println("Then");
	    }

}

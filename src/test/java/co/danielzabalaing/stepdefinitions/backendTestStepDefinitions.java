package co.danielzabalaing.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import co.danielzabalaing.model.Object;
import co.danielzabalaing.services.DummyServices;
import io.restassured.response.Response;

import static org.junit.Assert.assertFalse;

public class backendTestStepDefinitions {

    Object employee;
    Response response;
    DummyServices dummyServices= new DummyServices();

    @Given("User creates a new employee")
    public void user_creates_a_new_employee() {
        employee= new Object("daniel", "1198","5");
        employee.setId(dummyServices.createNewEmployee(employee));
    }
    @Given("User retrieve that user")
    public void user_retrieve_that_user() {

        dummyServices.getSpecifyEmployee(employee.getId());
    }
    @When("User delete that user")
    public void user_delete_that_user() {
        dummyServices.deleteEmployee(employee.getId());
    }
    @Then("User retrieve all the employees")
    public void user_retrive_all_the_employes() {
      response =  dummyServices.getAllEmployees();
    }
    @Then("User doesn't see the new employee")
    public void user_doesn_t_see_the_new_employe() {
        assertFalse(response.then().extract().jsonPath().getList("id").contains(employee.getId()));
    }

}

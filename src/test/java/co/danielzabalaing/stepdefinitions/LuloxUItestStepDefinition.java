package co.danielzabalaing.stepdefinitions;

import co.danielzabalaing.questions.RespuestaChatBot;
import co.danielzabalaing.tasks.ChatWith;
import co.danielzabalaing.tasks.GoTo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.danielzabalaing.userinterfaces.ChatBotPage.RESPONE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class LuloxUItestStepDefinition {
    @Given("User go to the chat section")
    public void user_go_to_the_chat_section() {
        withCurrentActor();
        theActorInTheSpotlight().attemptsTo(
                GoTo.chatBotSection());
    }

    @When("User chat whit the chatbot")
    public void user_chat_whit_the_chatbot() {
        withCurrentActor();
        theActorInTheSpotlight().attemptsTo(
                ChatWith.Bot());
    }
    @Then("I should see the response from the chatbot")
    public void i_should_see_the_response_from_the_chatbot() {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(RESPONE, isPresent()).forNoMoreThan(60).seconds()
        );
        theActorInTheSpotlight().should(seeThat(RespuestaChatBot.seHaMostradoCorrectamente()));
    }

}

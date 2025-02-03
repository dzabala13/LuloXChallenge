package co.danielzabalaing.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static co.danielzabalaing.userinterfaces.ChatBotPage.RESPONE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RespuestaChatBot implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return RESPONE.resolveFor(actor).isDisplayed();
    }

    public static RespuestaChatBot seHaMostradoCorrectamente(){
        return new RespuestaChatBot();
    }
}

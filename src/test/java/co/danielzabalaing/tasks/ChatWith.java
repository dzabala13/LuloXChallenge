package co.danielzabalaing.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.actions.type.Type;
import org.openqa.selenium.Keys;
import static co.danielzabalaing.userinterfaces.ChatBotPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;


public class ChatWith implements Task {



    public ChatWith(){
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Switch.toFrame( getDriver().findElement(IFRAME1)),
                Type.theValue(TEXT).into(AREA_TEXTO),
                Type.theValue(Keys.ENTER).into(AREA_TEXTO)
        );
    }



    public static Performable Bot(){

        return instrumented(ChatWith.class);
    }
}

package co.danielzabalaing.tasks;

import co.danielzabalaing.interactions.ClickJS;
import co.danielzabalaing.interactions.SwitchCustom;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Switch;
import static co.danielzabalaing.userinterfaces.HomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class GoTo implements Task {

    public GoTo(){
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SwitchCustom.ToFrame(IFRAME1),
                SwitchCustom.ToFrame(IFRAME2),
                ClickJS.enelButton(BUTTON_TO_CHATBOT),
                Switch.toParentFrame(), Switch.toParentFrame(), Switch.toNewWindow()
        );
    }


    public static Performable chatBotSection(){

        return instrumented(GoTo.class);
    }
}

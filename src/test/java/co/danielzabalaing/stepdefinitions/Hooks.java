package co.danielzabalaing.stepdefinitions;

import co.danielzabalaing.interactions.Abrir;
import co.danielzabalaing.interactions.Maximizar;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class Hooks {

    @Given("{word} go to the LuloX webPage")
    public void user_go_to_the_lulo_x_web_page(String nombre) {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(nombre).wasAbleTo(
                Abrir.elNavegador(),
                Maximizar.elNavegador()
        );
    }

    @After
    public void finEscenario(){
        System.out.println("Fin del Escenario");
    }


}

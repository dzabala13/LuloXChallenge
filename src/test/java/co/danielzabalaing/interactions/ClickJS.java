package co.danielzabalaing.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static net.serenitybdd.core.Serenity.getDriver;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickJS implements Interaction {
   public By button;
   public ClickJS(By button){
       this.button=button;
   }

    @Override
    public <T extends Actor> void performAs(T t) {
        WebElement buttonWebelement=getDriver().findElement(button);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", buttonWebelement);
    }

    public static Performable enelButton(By button){
        return instrumented(ClickJS.class,button);
    }
}

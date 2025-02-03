package co.danielzabalaing.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class HomePage extends PageObject {


    public static final By IFRAME1 = By.xpath("//div//iframe[@seamless]");
    public static final By IFRAME2 = By.xpath("//div[@class='widget-visible']//iframe[1]");
    public static final By BUTTON_TO_CHATBOT = By.cssSelector("button.tawk-button-circle");




}

package co.danielzabalaing.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class ChatBotPage extends PageObject {

    public static final By IFRAME1 = By.xpath("//iframe");
    public static final Target RESPONE= the("Area de texto del chatbot").located(By.xpath("//div[@id='tawk-body']//div[3]//div[@class='tawk-agent']"));
    public static final Target AREA_TEXTO = the("Area de texto del chatbot").located(By.xpath("/html/body/div/div/div/div[3]/div[2]/div[2]/div/div[3]/textarea"));
    public static final String TEXT = "Hola quiero hacer una prueba puedo hacerlo";


}

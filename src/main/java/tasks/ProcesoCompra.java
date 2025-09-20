package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import userinterface.HomePage;

import java.time.Duration;

public class ProcesoCompra implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(Click.on(HomePage.VHP_PROD2));
        actor.attemptsTo(Click.on(HomePage.VBTN1));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
        actor.attemptsTo(Click.on(HomePage.VCARRITO));
        actor.attemptsTo(Click.on(HomePage.VORDEN_VENTA));
        actor.attemptsTo(Enter.theValue("BRYAN NAVARRETE").into(HomePage.VTXT_NAME));
        actor.attemptsTo(Enter.theValue("ECUADOR").into(HomePage.VTXT_CONTRY));
        actor.attemptsTo(Enter.theValue("QUITO").into(HomePage.VTXT_CITY));
        actor.attemptsTo(Enter.theValue("56562598744").into(HomePage.VTXT_CARD));
        actor.attemptsTo(Enter.theValue("004").into(HomePage.VTXT_MES));
        actor.attemptsTo(Enter.theValue("2026").into(HomePage.VTXT_ANIO));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        actor.attemptsTo(Click.on(HomePage.VBTN_PUCHEAR));
    }
    public static ProcesoCompra enter2()
    {
        return Tasks.instrumented(ProcesoCompra.class);
    }
}

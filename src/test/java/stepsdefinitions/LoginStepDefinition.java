package stepsdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import questions.ClaseAssertText;
import tasks.Login;
import tasks.ProcesoCompra;

public class LoginStepDefinition {

    @Managed /*defino que driver voy a utilizar*/
    WebDriver hisBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }


    @Given("El usuario apertura la pagina")
    public void Elusuarioaperturalapagina() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.demoblaze.com/index.html"));
    }

    @When("El usuario ingresa las credenciales de manera correcta")
    public void Elusuarioingresalascredencialesdemaneracorrecta() {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.enter());
        OnStage.theActorInTheSpotlight().attemptsTo(ProcesoCompra.enter2());
    }

    @Then("El usuario realizar la compra de 2 productos")
    public void Elusuariorealizarlacomprade2productos() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ClaseAssertText.esIgual(), Matchers.is("Thank you for your purchase!")));

    }

}

package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.LoginPage;

public class Login implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LoginPage.HP_LOGIN));
        actor.attemptsTo(Enter.theValue("standard_user").into(LoginPage.TXT_LOGIN));
        actor.attemptsTo(Enter.theValue("secret_sauce").into(LoginPage.TXT_PASSWORD));
        actor.attemptsTo(Click.on(LoginPage.BTNLOGIN));
    }
    public static Login enter()
    {
        return Tasks.instrumented(Login.class);
    }
}

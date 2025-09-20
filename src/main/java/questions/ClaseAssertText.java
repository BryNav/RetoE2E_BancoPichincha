package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.HomePage;

public class ClaseAssertText implements Question<String>  {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(HomePage.VALIDACION_TEXTO).answeredBy(actor);
    }

    public static ClaseAssertText esIgual() {
        return new ClaseAssertText();
    }
}
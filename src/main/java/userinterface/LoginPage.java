package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class LoginPage {
    public static final Target HP_LOGIN = Target.the("CLIC EN HIPERVINCULO LOGIN").located(By.id("login2"));
    public static final Target TXT_LOGIN = Target.the("TXT de ingreso de LOGIN").located(By.id("loginusername"));
    public static final Target TXT_PASSWORD = Target.the("TXT de ingreso de PASSORD").located(By.id("loginpassword"));
    public static final Target BTNLOGIN = Target.the("TXT de ingreso de CODIGO POSTAL").locatedBy("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");



}

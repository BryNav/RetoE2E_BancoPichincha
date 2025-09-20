package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class HomePage {
    public static final Target VHP_PROD1 = Target.the("ELEMENTO PRODUCTO 1").locatedBy("//*[@id='tbodyid']/div[1]/div/div/h4/a");
    public static final Target VHOME = Target.the("REGRESAMOS AL HOME").locatedBy("//*[@id='navbarExample']/ul/li[1]/a");
    public static final Target VHP_PROD2 = Target.the("ELEMENTO PRODUCTO 2").locatedBy("//*[@id='tbodyid']/div[2]/div/div/h4/a");
    public static final Target VBTN1 = Target.the("TXT de ingreso de CODIGO POSTAL").locatedBy("//*[@id='tbodyid']/div[2]/div/a");
    public static final Target VCARRITO = Target.the("ELEMENTO PRODUCTO 2").locatedBy("//*[@id='navbarExample']/ul/li[4]/a");
    public static final Target VORDEN_VENTA = Target.the("ELEMENTO PRODUCTO 2").locatedBy("//*[@id='page-wrapper']/div/div[2]/button");
    public static final Target VTXT_NAME = Target.the("ingresa nombre").located(By.id("name"));
    public static final Target VTXT_CONTRY = Target.the("ingresa pais").located(By.id("country"));
    public static final Target VTXT_CITY = Target.the("ingresa ciudad").located(By.id("city"));
    public static final Target VTXT_CARD = Target.the("ingresa tarjeta de credito").located(By.id("card"));
    public static final Target VTXT_MES = Target.the("ingresa mes").located(By.id("month"));
    public static final Target VTXT_ANIO = Target.the("ingresa año").located(By.id("year"));
    public static final Target VBTN_PUCHEAR = Target.the("CLIC EN CERAR COMPRA").locatedBy("//*[@id='orderModal']/div/div/div[3]/button[2]");
    public static final Target VALIDACION_TEXTO = Target.the("TEXTO DE VALIDACION").locatedBy("/html/body/div[10]/h2");



}

package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class ChoucairLoginPage extends PageObject {
    public static final Target LOGUIN_BUTTON = Target.the("Ingresar al inicio de sesion de " +
            "Choucair Academy").located(By.xpath("//*[@id='nav-menu']/ul[2]/li/a"));

    public static final Target INPUT_USER = Target.the("Nombre de usuario").located(By.xpath("" +
            "//INPUT[@id='username']"));

    public static final Target INPUT_PASSWORD = Target.the("Inserte su contraseña").located(By.xpath("" +
            "//*[@id=\"password\"]"));

    public static final Target ENTER_BUTTON = Target.the("Seleccione el boton acceder").located
            (By.xpath("//BUTTON[@type='submit']"));

}

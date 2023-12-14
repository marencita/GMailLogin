package Atm.Interface;


import net.serenitybdd.screenplay.targets.Target;

public class PaginaLogin {
    public static final Target usuario = Target.the("usuario").locatedBy("//input[@type='email']");
    public static final Target btonSiguiente = Target.the("boton Siguiente").locatedBy("//*[contains(text(),'Siguiente')]");
    public static final Target Contrasena = Target.the("Contrasena").locatedBy("//input[@type='password']");
    public static final Target usarOtraCuenta = Target.the("usar otra cuenta").locatedBy("//*[contains(text(),'Usar otra cuenta')]");

}

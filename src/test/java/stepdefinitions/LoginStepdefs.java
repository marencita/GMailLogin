package stepdefinitions;

import Atm.task.Logueo;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static Atm.Question.LoginOK.ConfirmarLogin;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class LoginStepdefs {

    @Before
    public void Inicio(){
        WebDriverManager.chromedriver().setup();
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Tester");
      }


    @Given("Acceso a la pagina de gmail")
    public void acceso_a_la_pagina_de_gmail() {
        theActorInTheSpotlight().attemptsTo(Open.url("https://www.gmail.com"));
    }

    @When("Ingreso nombre de usuario {string}, contrasena {string} y doy click en ingresar")
    public void ingreso_nombre_de_usuario_contraseña_y_doy_click_en_ingresar(String usuario, String password) {
        theActorInTheSpotlight().attemptsTo(Logueo.go(usuario,password));
    }
    @Then("valido que haya ingresado")
    public void valido_que_haya_ingresado() {
        theActorInTheSpotlight().should(seeThat(ConfirmarLogin(), Matchers.equalTo(true)));
    }




}

package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.tasks.Login;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import co.com.choucair.certification.proyectobase.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class ChoucairAcademyStepDefintions {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que Laura quiere aprender automatizacion en Choucair Academy$")
    public void queLauraQuiereAprenderAutomatizacionEnChoucairAcademy() {
    OnStage.theActorCalled("Laura").wasAbleTo(OpenUp.thePage(), (Login.OnThePage()));
    }

    @Cuando("^Laura busque el curso (.*) en choucair Academy$")
    public void lauraBusqueElCursoEnChoucairAcademy(String course){
        OnStage.theActorInTheSpotlight() .attemptsTo(Search.the(course));
    }

    @Entonces("^Laura encuentra el curso en Universidad Choucair$")
    public void lauraEncuentraElCursoEnUniversidadChoucair(){
    }

    @Then("^encuentra el curso llamado (.*)$")
    public void encuentraelcursollamadoMetodologiaBancolombia(String question){
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }
}

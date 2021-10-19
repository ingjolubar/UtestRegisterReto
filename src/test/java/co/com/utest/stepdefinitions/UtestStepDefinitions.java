package co.com.utest.stepdefinitions;

import co.com.utest.model.UtestData;
import co.com.utest.questions.Answer;
import co.com.utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDefinitions {

    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Jorge wants to register on the platform$")
    public void jorgeWantsToRegisterOnThePlatform() {
        OnStage.theActorCalled("Jorge").wasAbleTo(OpenUp.thepage());
    }


    @When("^the user completes all the information in the form$")
    public void theUserCompletesAllTheInformationInTheForm(List<UtestData> utestData){
        OnStage.theActorInTheSpotlight().attemptsTo(FillOutAbout.thePage(utestData),
                FIllOutLocation.thePage(utestData), FillOutDevices.thePage(), FillOutLastStep.thePage(utestData));

    }

    @Then("^registration is complete when the Complete Setup button appears$")
    public void registrationIsCompleteWhenTheCompleteSetupButtonAppears(List<UtestData> utestData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(utestData)));

    }
}

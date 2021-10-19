package co.com.utest.tasks;

import co.com.utest.model.UtestData;
import co.com.utest.userinterface.LastStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class FillOutLastStep implements Task {

    private List<UtestData> utestData;

    public FillOutLastStep(List<UtestData> utestData) {
        this.utestData = utestData;
    }

    public static FillOutLastStep thePage(List<UtestData> utestData) {
        return Tasks.instrumented(FillOutLastStep.class, utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(utestData.get(0).getStrPassword()).into(LastStepPage.PASSWORD),
                Enter.theValue(utestData.get(0).getStrPassword()).into(LastStepPage.CONFIRM_PASSWORD),
                Click.on(LastStepPage.CHECKBOX_01),
                Click.on(LastStepPage.CHECKBOX_02),
                Click.on(LastStepPage.COMPLETE_SETUP)
                );

    }
}

package co.com.utest.tasks;

import co.com.utest.model.UtestData;
import co.com.utest.userinterface.AboutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;
import static co.com.utest.userinterface.AboutPage.*;

public class FillOutAbout implements Task {

    private List<UtestData> utestData;

    public FillOutAbout(List<UtestData> utestData) {
        this.utestData = utestData;
    }

    public static FillOutAbout thePage(List<UtestData> utestData) {
        return Tasks.instrumented(FillOutAbout.class, utestData);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(utestData.get(0).getStrFirstName()).into(FIRST_NAME),
                Enter.theValue(utestData.get(0).getStrLastName()).into(LAST_NAME),
                Enter.theValue(utestData.get(0).getStrEmail()).into(EMAIL),
                SelectFromOptions.byVisibleText(utestData.get(0).getStrBirthMonth()).from(BIRTH_MONTH),
                SelectFromOptions.byVisibleText(utestData.get(0).getStrBirthDay()).from(BIRTH_DAY),
                SelectFromOptions.byVisibleText(utestData.get(0).getStrBirthYear()).from(BIRTH_YEAR),
                Click.on(BUTTON_LOCATION)
        );

    }
}

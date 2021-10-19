package co.com.utest.tasks;

import co.com.utest.model.UtestData;
import co.com.utest.userinterface.LocationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;
import static co.com.utest.userinterface.LocationPage.*;
public class FIllOutLocation implements Task {

    private List<UtestData> utestData;

    public FIllOutLocation(List<UtestData> utestData) {
        this.utestData = utestData;
    }

    public static FIllOutLocation thePage(List<UtestData> utestData) {
        return Tasks.instrumented(FIllOutLocation.class,utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(utestData.get(0).getStrCity()).into(CITY),
                Hit.the(Keys.ARROW_DOWN).into(CITY),
                Hit.the(Keys.ENTER).into(CITY),
                Enter.theValue(utestData.get(0).getStrZip()).into(ZIP),
                Click.on(DIV_COUNTRY),
                Enter.theValue(utestData.get(0).getStrCountry()).into(COUNTRY),
                Click.on(BUTTON_DEVICES)
        );

    }
}

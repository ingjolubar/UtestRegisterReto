package co.com.utest.tasks;

import co.com.utest.model.UtestData;
import co.com.utest.userinterface.DevicesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

public class FillOutDevices implements Task {
    public static FillOutDevices onThePage() {
        return Tasks.instrumented(FillOutDevices.class);
    }

    public static FillOutDevices thePage() {
        return Tasks.instrumented(FillOutDevices.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DevicesPage.BUTTON_LASTSTEP));

    }
}

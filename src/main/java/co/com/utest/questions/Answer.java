package co.com.utest.questions;

import co.com.utest.model.UtestData;
import co.com.utest.userinterface.LastStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Answer implements Question<Boolean> {
    private List<UtestData> utestData;

    public Answer(List<UtestData> utestData) {
        this.utestData = utestData;
    }

    public static Answer toThe(List<UtestData> utestData) {
        return new Answer(utestData);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String Complete_Setup = Text.of(LastStepPage.COMPLETE_SETUP).viewedBy(actor).asString();

        return utestData.get(0).getStrFinal().equals(Complete_Setup);
    }
}

package co.com.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LastStepPage {
    public static final Target PASSWORD = Target.the("Password")
            .located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("Confirm Password")
            .located(By.id("confirmPassword"));
    public static final Target CHECKBOX_01 = Target.the("CheckBox 01")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECKBOX_02 = Target.the("CheckBox 02")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target COMPLETE_SETUP = Target.the("Complete Setup")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a"));
}

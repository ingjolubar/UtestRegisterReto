package co.com.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DevicesPage {
    public static final Target BUTTON_LASTSTEP = Target.the("Button Last Step")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}

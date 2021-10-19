package co.com.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocationPage {
    public static final Target CITY = Target.the("City")
            .located(By.id("city"));
    public static final Target ZIP = Target.the("Zip")
            .located(By.id("zip"));
    public static final Target DIV_COUNTRY = Target.the("Div Country")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]"));
    public static final Target COUNTRY = Target.the("Country")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target BUTTON_DEVICES = Target.the("Button to Devices")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}

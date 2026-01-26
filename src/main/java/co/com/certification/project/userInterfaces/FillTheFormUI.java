package co.com.certification.project.userInterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FillTheFormUI {
    public static final Target INPUT_NAME = Target.the("name field")
            .located(By.id("first-name"));
    public static final Target INPUT_APELLIDO = Target.the("last name field")
            .located(By.id("last-name"));
    public static final Target INPUT_PC = Target.the("postal code field")
            .located(By.id("postal-code"));
    public static final Target BTN_CONTINUE = Target.the("BNT CONTINUE")
            .located(By.id("continue"));
    public static final Target BTN_FINISH = Target.the("bnt continue")
            .located(By.id("finish"));

}

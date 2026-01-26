package co.com.certification.project.userInterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ValidateMessageUI {
    public static final Target H2_MESSAGE = Target.the("message to validate")
            .located(By.xpath("//h2[@class='complete-header']"));

}

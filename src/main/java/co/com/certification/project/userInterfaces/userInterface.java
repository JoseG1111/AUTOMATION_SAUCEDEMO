package co.com.certification.project.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class userInterface {
    public static final Target INPUT_USER = Target.the("user field")
            .located(By.id("user-name"));
    public static final Target INPUT_PASSWORD = Target.the("Password field")
            .located(By.xpath("(//input[@class='input_error form_input'])[2]"));
    public static final Target BTN_SUBMIT = Target.the("submit button")
            .located(By.id("login-button"));
    public static final Target BTN_BACKPACK = Target.the("backpack product")
            .located(By.id("add-to-cart-sauce-labs-backpack"));
    public static final Target BTN_MOTO = Target.the("moto product")
            .located(By.id("add-to-cart-sauce-labs-bike-light"));
    public static final Target BTN_SUETER_BLANCO = Target.the("SUETER BLANCO")
            .located(By.id("add-to-cart-sauce-labs-onesie"));
    public static final Target CART_ICON = Target.the("CART ICON")
            .located(By.xpath("//a[@class='shopping_cart_link']"));
    public static final Target BTN_CHECKOUT = Target.the("Btn checkout")
            .located(By.xpath("//button[@id='checkout']"));


}

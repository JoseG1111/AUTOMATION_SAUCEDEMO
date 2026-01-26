package co.com.certification.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.Switch;

import static co.com.certification.project.userInterfaces.userInterface.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddProdutsToCart implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_BACKPACK),
                Click.on(BTN_MOTO),
                Scroll.to(BTN_SUETER_BLANCO),
                Click.on(BTN_SUETER_BLANCO),
                Scroll.to(CART_ICON),
                Click.on(CART_ICON),
                Scroll.to(BTN_CHECKOUT),
                Click.on(BTN_CHECKOUT)
              //  Switch.toAlert().andAccept(),


        );

    }
    public static AddProdutsToCart addProdutsToCart() {
        return instrumented(AddProdutsToCart.class);
    }
}

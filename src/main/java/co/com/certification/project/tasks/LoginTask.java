package co.com.certification.project.tasks;

import co.com.certification.project.models.LoginModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.certification.project.userInterfaces.userInterface.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginTask implements Task {
private LoginModel compraModel;


    public LoginTask(LoginModel compraModel) {
        this.compraModel = compraModel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
actor.attemptsTo(
        Enter.theValue(System.getProperty(compraModel.getUser())).into(INPUT_USER),
        Enter.theValue(System.getProperty(compraModel.getPassword())).into(INPUT_PASSWORD),
        Scroll.to(BTN_SUBMIT),
        Click.on(BTN_SUBMIT)
);

    }

    public static LoginTask loginTask(LoginModel compraModel){
        return instrumented(LoginTask.class, compraModel);
    }
}

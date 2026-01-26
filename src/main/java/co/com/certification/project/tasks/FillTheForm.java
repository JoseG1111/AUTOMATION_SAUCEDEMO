package co.com.certification.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.certification.project.userInterfaces.FillTheFormUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillTheForm implements Task {
    private String nombre;
    private String apellido;
    private String codigo_postal;

    public FillTheForm(String nombre, String apellido, String codigo_postal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo_postal = codigo_postal;
    }

    public static FillTheForm fillTheForm(String nombre, String apellido, String codigo_postal){
        return instrumented(FillTheForm.class,nombre,apellido,codigo_postal);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nombre).into(INPUT_NAME),
                Enter.theValue(apellido).into(INPUT_APELLIDO),
                Enter.theValue(codigo_postal).into(INPUT_PC),
                Click.on(BTN_CONTINUE),
                Click.on(BTN_FINISH)
        );

    }
}

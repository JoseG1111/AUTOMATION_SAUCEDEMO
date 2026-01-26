package co.com.certification.project.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;


public class ValidateMessage implements Question<Boolean> {

    private Target target;
    private String mensaje;


    public ValidateMessage( String mensaje, Target target) {
        this.mensaje = mensaje;
        this.target = target;
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        String textoObtenido = BrowseTheWeb.as(actor).find(target).getText().trim();
        return mensaje.equals(textoObtenido);
    }

    public static ValidateMessage validateMessage(String mensaje, Target target) {
        return new ValidateMessage(mensaje, target);


    }
}

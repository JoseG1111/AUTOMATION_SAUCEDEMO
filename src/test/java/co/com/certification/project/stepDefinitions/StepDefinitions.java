package co.com.certification.project.stepDefinitions;

import co.com.certification.project.models.LoginModel;
import co.com.certification.project.questions.ValidateMessage;
import co.com.certification.project.tasks.AddProdutsToCart;
import co.com.certification.project.tasks.FillTheForm;
import co.com.certification.project.tasks.LoginTask;
import co.com.certification.project.tasks.LiftPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import co.com.certification.project.questions.ValidateMessage;

import static co.com.certification.project.userInterfaces.ValidateMessageUI.H2_MESSAGE;

public class StepDefinitions {
    @Given("accede a la pagina de saucedemo")
    public void accedeALaPaginaDeSaucedemo() {
        OnStage.theActorCalled("jose").wasAbleTo(
                LiftPage.liftPage()
        );

    }
    @Given("el usuario inicia sesion en el sistema de saucedemo")
    public void elUsuarioIniciaSesionEnElSistemaDeSaucedemo(LoginModel compraModel) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginTask.loginTask(compraModel)
        );

    }
    @When("selecciona unos productos para agregarlos a el carrito")
    public void seleccionaUnosProductosParaAgregarlosAElCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AddProdutsToCart.addProdutsToCart()
        );

    }
    @And("ingresa la informacion de {string}, {string} y {string}")
    public void ingresaLaInformacionDeY(String nombre, String apellido, String codigo_postal) {
OnStage.theActorInTheSpotlight().attemptsTo(
        FillTheForm.fillTheForm(nombre, apellido, codigo_postal)
);
    }
    @Then("el usuario visualiza el {string}")
    public void elUsuarioVisualizaEl(String mensaje) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateMessage.validateMessage(mensaje, H2_MESSAGE)));

    }
}

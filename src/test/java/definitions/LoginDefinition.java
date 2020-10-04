package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LoginPage;

public class LoginDefinition {
    LoginPage login;

    public LoginDefinition() {
        login = new LoginPage();
    }

    @Given("Usuario enter {string}")
    public void usuarioEnter(String admin) {
        login.typeUser(admin);
    }

    @And("enter {string}")
    public void enter(String password) {
        login.typePassword(password);
    }

    @When("tap log in")
    public void tapLogIn() {
        login.tapLogIn();
    }

    @Then("Validation succesfull")
    public void validationSuccesfull() {
        login.validateSuccesfull();
    }
}

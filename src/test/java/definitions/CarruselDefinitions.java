package definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.MenuPage;

public class CarruselDefinitions {
    MenuPage menu;

    public CarruselDefinitions() {
        menu = new MenuPage();
    }

    @Then("validate elemento {string}")
    public void validateElemento(String arg0) {

    }

    @Given("User scroll {string}")
    public void userScroll(String opcion) {
        menu.selectMenu(opcion);
    }

    @When("select tap")
    public void selectTap() {
       menu.tapMenu();
    }
}

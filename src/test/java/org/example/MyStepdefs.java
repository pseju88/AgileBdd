package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MyStepdefs {
    HomePage homepage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage =new RegisterResultPage();
    Utils utils = new Utils();
    CellPhone cellPhone = new CellPhone();
            NokiaLumia nokiaLumia = new NokiaLumia();
            AddToCart addToCart = new AddToCart();
    HomePage homePage = new HomePage();

    Checkout checkout = new Checkout();
    ShiipingMethod shiipingMethod = new ShiipingMethod();
    PaymentMethod paymentMethod = new PaymentMethod();
    PaymentInformation paymentInformation = new PaymentInformation();
    ConfirmOrder confirmOrder = new ConfirmOrder();
    @Given("I am on register page")
    public void iAmOnRegisterPage() {

        // Write code here that turns the phrase above into concrete actions
        homePage.verifyRegistrationButtonIsonHomePage();


    }

    @When("I registered successfully")
    public void iRegisteredSuccessfully() {
        registerPage.enterRegistrationOnDetails();
    }

    @And("I select cell phone from electronics category")
    public void iSelectCellPhoneFromElectronicsCategory() {
        homePage.clickonCelPhon();
        cellPhone.verifyCellPhoneOnElectronicPage();
    }

    @And("I select NokiaLumia Product")
    public void iSelectNokiaLumiaProduct() {
        nokiaLumia.addToCart();
    }


    @When("I add product to cart")
    public void i_add_product_to_cart() {
        // Write code here that turns the phrase above into concrete actions
        addToCart.verifyAddToCart();
    }

    @When("I enter personal details for checkout")
    public void i_enter_personal_details_for_checkout() {
        // Write code here that turns the phrase above into concrete actions
        checkout.verifybilling();
        shiipingMethod.verifyShippingMethod();
    }

    @When("I enter valid card details")
    public void i_enter_valid_card_details() {
        // Write code here that turns the phrase above into concrete actions
        paymentMethod.verifyPaymentMethod();
        paymentInformation.verifypaymentInformation();
    }

    @Then("I should be able to buy a product successfully")
    public void i_should_be_able_to_buy_a_product_successfully() {
        // Write code here that turns the phrase above into concrete actions
        confirmOrder.verifyConfirmOrder();
    }

    //category

    @When("I click on {string} link")
    public void iClickOnLink(String categorylink) {
        homePage.clickOnCategoryPage(categorylink);
    }

    @Then("I should able to navigate to related {string} page successfully")
    public void iShouldAbleToNavigateToRelatedPageSuccessfully(String categoryName) {
        Utils.assertCurrentURL(categoryName);
    }


    @Given("I am register page")
    public void i_am_on_register_page() {
        // Write code here that turns the phrase above into concrete actions
        homePage.verifyRegistrationButtonIsonHomePage();
    }

    @When("I enter valid credentials")
    public void i_enter_valid_credentials() {
        // Write code here that turns the phrase above into concrete actions
        registerPage.VerifyUserIsOnRegistrationPage();
    }

    @When("I should click on Register Button")
    public void i_should_click_on_register_button() {
        // Write code here that turns the phrase above into concrete actions
        registerPage.enterRegistrationOnDetails();
    }

    @Then("I should able to register successfully")
    public void i_should_able_to_register_successfully() {
        // Write code here that turns the phrase above into concrete actions
        registerResultPage.verifyUserHasBeenRegisteredSuccessfully();
    }

}

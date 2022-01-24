package steps;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.*;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    openWebSite opensite = new openWebSite();

    SelenideElement loginField = $("#user-name");
    SelenideElement userPassword = $("#password");
    SelenideElement loginBtn = $("#login-button");

    @When("I login to platform with name {string}")
    public void iLoginToPlatform(String userName) {
        opensite.openUrl();
        this.loginField.val(userName);
        this.userPassword.val("secret_sauce");
        this.loginBtn.click();
    }
}

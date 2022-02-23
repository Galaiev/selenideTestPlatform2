package steps;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.*;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    openWebSite opensite = new openWebSite();

    SelenideElement loginField = $("#user-name");
    SelenideElement userPassword = $("#password");
    SelenideElement loginBtn = $("#login-button");

    @When("I login to platform with {string}")
    public void LoginToPlatform(String arg0) {
        opensite.openUrl();
        this.loginField.val(arg0);
        this.userPassword.val("secret_sauce");
        this.loginBtn.click();
    }

}

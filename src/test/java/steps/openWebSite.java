package steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.Before;

import static com.codeborne.selenide.Selenide.*;

public class openWebSite {

    @Before
    public void openUrl() {
        open("https://www.saucedemo.com");
        $("#user-name").shouldBe(Condition.visible);
    }

}

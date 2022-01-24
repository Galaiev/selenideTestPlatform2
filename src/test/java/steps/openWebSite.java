package steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.Before;

import static com.codeborne.selenide.Selenide.*;

public class openWebSite {

    @Before
    public void openUrl() {
//        Configuration.browser="firefox";
        open("google.com");
        $("#user-name").shouldBe(Condition.visible);
    }

}

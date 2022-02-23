package steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CatalogPage {
    openWebSite openSite = new openWebSite();

    SelenideElement miniCard = $(By.xpath("//*[contains(@class, 'inventory_item')][1]"));
    SelenideElement miniCardPicture = miniCard.$(By.xpath("(//div[@class='inventory_item_img'])[1]"));
    SelenideElement miniCardName = miniCard.$(By.xpath("(//div[@class='inventory_item_name']) [1]"));
    SelenideElement miniCardPrice = miniCard.$("#add-to-cart-sauce-labs-backpack");
}

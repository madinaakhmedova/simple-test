package ru.simplewine;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;

public class TestMainPage extends TestBase {

    @Test
    void clickFirstBanner() {
        mainPage.openPage();
        $(".age-confirm__button.js-age-confirm").click();

        mainPage.banners.get(0).shouldNotBe(Condition.visible);
        mainPage.banners.get(1).shouldBe(Condition.visible).click();

        webdriver().shouldNotHave(url(baseUrl));

        Selenide.sleep(5000);
    }
}

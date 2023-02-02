package ru.simplewine;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.webdriver;

public class TestMainPage extends TestBase {

    @Test
    void clickFirstBanner() {
        mainPage.openPage();

        $(".age-confirm__button.js-age-confirm").click();
//        $("[data-autotest-target-id=city-popup-city-agree-btn").click();

        mainPage.banners.get(0).shouldNotBe(Condition.visible);
        mainPage.banners.get(1).shouldBe(Condition.visible).click();

        String url = webdriver().driver().getCurrentFrameUrl();
        String secondTabUrl = webdriver().driver().switchTo().window(1).getCurrentUrl();

        Assertions.assertNotEquals(secondTabUrl, "https://simplewine.ru");
        Assertions.assertNotEquals(secondTabUrl, "https://simplewine.ru/");

        Selenide.sleep(5000);
    }
}

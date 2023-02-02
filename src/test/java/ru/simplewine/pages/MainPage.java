package ru.simplewine.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import demoqa.pages.RegistrationPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    public final SelenideElement
            bannerWrapper = $(".snippet-promo__swiper-wrapper");
    public final ElementsCollection banners = $$(".snippet-promo__swiper-wrapper > a");

    public MainPage openPage() {
        open("/");
//        String TITLE_TEXT = "Student Registration Form";
//        $(".practice-form-wrapper").shouldHave(text(TITLE_TEXT));
//        executeJavaScript("$('#fixedban').remove();$('#adplus-anchor').remove();$('footer').remove();");

        return this;
    }
}

package ru.simplewine;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import ru.simplewine.pages.MainPage;

public class TestBase {
    public final static String baseUrl = "https://simplewine.ru";
    MainPage mainPage = new MainPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";

        Configuration.baseUrl = baseUrl;
    }
}

package tests;

import com.codeborne.selenide.Configuration;
import config.BrowserConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class YandexTests {

    private BrowserConfig config = ConfigFactory.create(BrowserConfig.class, System.getProperties());


    @Test
    void openYandexTest() {

        Configuration.browser = config.getBrowserName();
        Configuration.browserVersion = config.getBrowserVersion();
        if (config.isRemote()) {
            Configuration.remote = config.getRemoteUrl();
        }

        open("https://yandex.ru/");


    }
}

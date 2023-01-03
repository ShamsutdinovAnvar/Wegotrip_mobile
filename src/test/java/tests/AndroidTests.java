package tests;

import io.appium.java_client.AppiumBy;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class AndroidTests extends TestBase {

    @Test
    void firstScreenTest() {
        $(AppiumBy.id("com.wegotrip.app:id/title")).shouldHave(text("Discover the world with self-guided audio tours"));
    }

    @SneakyThrows
    @Test
    void secondScreenTest() {
        $(AppiumBy.id("com.wegotrip.app:id/letmein")).click();
        Thread.sleep(2000);
        $(AppiumBy.id("com.wegotrip.app:id/title")).shouldHave(text("All you need is your earphones"));

    }

    @SneakyThrows
    @Test
    void thirdScreenTest() {
        $(AppiumBy.id("com.wegotrip.app:id/letmein")).click();
        Thread.sleep(2000);
        $(AppiumBy.id("com.wegotrip.app:id/letmein")).click();
        Thread.sleep(2000);
        $(AppiumBy.id("com.wegotrip.app:id/title")).shouldHave(text("Audio tours work offline"));

    }

    @SneakyThrows
    @Test
    void searchTest() {
        $(AppiumBy.id("com.wegotrip.app:id/close")).click();
        $(AppiumBy.accessibilityId("Search…")).click();
        $(AppiumBy.id("com.wegotrip.app:id/search_src_text")).sendKeys("Berlin");
//        Thread.sleep(5000);
        $(AppiumBy.id("com.wegotrip.app:id/title")).shouldHave(text("Berlin, Germany"), Duration.ofSeconds(10));
    }
}


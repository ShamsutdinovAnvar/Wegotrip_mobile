package tests;

import com.codeborne.selenide.Condition;
import io.appium.java_client.AppiumBy;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static io.qameta.allure.Allure.step;

public class AndroidTests extends TestBase {
    @SneakyThrows
    @Test
    void searchTest() {
        step("Skip onboarding", () -> {
            $(AppiumBy.id("com.wegotrip.app:id/close")).click();
            });
        step("Click on the search box", () -> {
            $(AppiumBy.accessibilityId("Search…")).click();
            });
        step("Enter the required city", () -> {
            $(AppiumBy.id("com.wegotrip.app:id/search_src_text")).sendKeys("Berlin");
            sleep(5000);
            });
        step("Check the search operation", () -> {
            $(AppiumBy.id("com.wegotrip.app:id/title")).shouldHave(Condition.text("Berlin, Germany"));
            });
    }

//    @Test
//    void firstScreenTest() {
//        $(AppiumBy.id("com.wegotrip.app:id/title")).shouldHave(text("Discover the world with self-guided audio tours"));
//    }
//
//    @SneakyThrows
//    @Test
//    void secondScreenTest() {
//        $(AppiumBy.id("com.wegotrip.app:id/letmein")).click();
//        Thread.sleep(2000);
//        $(AppiumBy.id("com.wegotrip.app:id/title")).shouldHave(text("All you need is your earphones"));
//
//    }
//
//    @SneakyThrows
//    @Test
//    void thirdScreenTest() {
//        $(AppiumBy.id("com.wegotrip.app:id/letmein")).click();
//        Thread.sleep(2000);
//        $(AppiumBy.id("com.wegotrip.app:id/letmein")).click();
//        Thread.sleep(2000);
//        $(AppiumBy.id("com.wegotrip.app:id/title")).shouldHave(text("Audio tours work offline"));
//
//    }
}


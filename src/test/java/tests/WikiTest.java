package tests;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class WikiTest extends TestBase {

    @Test
    @Tag("mobile")
    void openScreenTest(String content) {

        $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text(content));
        $(AppiumBy.id("org.wikipedia.alpha:id/imageViewCentered")).shouldBe(visible);

            }

}

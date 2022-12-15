package steps;

import com.codeborne.selenide.Condition;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


public class Steps {
    @Step("Пропуск выбора языка")
    public Steps skipLanguage() {
        $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_skip_button")).click();

        return this;
    }

    @Step("Проверка отображения статьи")
    public Steps checkIsArticleVisible() {
        $(AppiumBy.className("android.webkit.WebView")).shouldBe(visible);

        return this;
    }

    @Step("Проверка наличия содержимого на стартовом экране вики")
    public Steps checkStartScreenContent(String content) {
        $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text(content));
        $(AppiumBy.id("org.wikipedia.alpha:id/imageViewCentered")).shouldBe(visible);

        return this;
    }

    @Step("Тап по кнопке Continue")
    public Steps tapToContinue() {
        $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();

        return this;
    }

    @Step("Открытие последней страницы стартового экрана вики")
    public Steps openFinishedScreen() {
        $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_done_button")).click();

        return this;
    }

    @Step("Проверка последней страницы стартового экрана вики")
    public Steps checkFinishedScreen() {

        $(AppiumBy.id("org.wikipedia.alpha:id/view_announcement_text")).shouldBe(visible);
        $(AppiumBy.id("org.wikipedia.alpha:id/search_container")).shouldBe(visible);
        $(AppiumBy.id("org.wikipedia.alpha:id/view_announcement_header_image")).shouldBe(visible);
        $(AppiumBy.id("org.wikipedia.alpha:id/view_announcement_text")).shouldHave(Condition.text("Customize your Explore feed"));

        return this;
    }

    @Step("Ввод поискового запроса")
    public Steps searchRequest(String searchRequest) {
        $(AppiumBy.id("org.wikipedia.alpha:id/search_container")).click();
        $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys(searchRequest);

        return this;
    }

    @Step("Проверка наличия результатов")
    public Steps checkThatContentIsFound() {
        $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title"))
                .shouldHave(sizeGreaterThan(0));

        return this;
    }

    @Step("Открытие первой статьи")
    public Steps openFirstArticle() {
        $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title")).first().click();

        return this;
    }


}

package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import steps.Steps;


import static com.codeborne.selenide.Selenide.$;

public class WikiTest extends TestBase {

    Steps steps = new Steps();

    @Test
    @Tag("mobile")
    @DisplayName("Проверка работы Onboarding Screen")
    void onboardingScreenTest() {

        steps
                .checkStartScreenContent("The Free Encyclopedia\n" +
                        "…in over 300 languages")
                .tapToContinue()
                .checkStartScreenContent("New ways to explore")
                .tapToContinue()
                .checkStartScreenContent("Reading lists with sync")
                .tapToContinue()
                .checkStartScreenContent("Send anonymous data")
                .openFinishedScreen()
                .checkFinishedScreen();
    }

    @Test
    @Tag("mobile")
    @DisplayName("Проверка работы поиска и открытия статьи по слову")
    void searchWordTest() {
        String searchWord = "Selenide";

        steps
                .skipLanguage()
                .searchRequest(searchWord)
                .checkThatContentIsFound()
                .openFirstArticle()
                .checkIsArticleVisible();
    }
}

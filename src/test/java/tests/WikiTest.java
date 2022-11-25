package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Selenide.$;

public class WikiTest extends TestBase {

    Steps steps = new Steps();

    @Test
    @Tag("mobile")
    @DisplayName("Проверка работы Onboarding Screen")
    void OnboardingScreenTest() {

        steps
                .openStartScreen("The Free Encyclopedia\n" +
                        "…in over 300 languages")
                .tapToContinue()
                .openStartScreen("New ways to explore")
                .tapToContinue()
                .openStartScreen("Reading lists with sync")
                .tapToContinue()
                .openStartScreen("Send anonymous data")
                .openFinishedScreen()
                .checkFinishedScreen();
    }

    @Test
    @Tag("mobile")
    @DisplayName("Проверка работы поиска и открытия статьи по слову")
    void SearchWordTest() {
        String searchWord = "Selenide";

        steps
                .skipLanguage()
                .searchRequest(searchWord)
                .checkThatContentIsFound()
                .openFirstArticle()
                .checkIsArticleVisible();
    }
}

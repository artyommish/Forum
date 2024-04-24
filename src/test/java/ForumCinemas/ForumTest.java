package ForumCinemas;

import org.junit.Test;

public class ForumTest {

    StartPage startPage = new StartPage();
    @Test
    public void carSearch(){
        startPage.startDriver();
        startPage.open("https://www.forumcinemas.lv/");
        startPage.movieSectionClick();
        startPage.languageSelectionButton();
        startPage.searchMovieButtonClick();
        startPage.searchFormInput();
        startPage.setSubmitMovieNameClick();
        startPage.chooseDateClick();
        startPage.exactDateClick();
        startPage.buyTicketClick();


    }

}

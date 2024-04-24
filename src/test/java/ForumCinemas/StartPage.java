package ForumCinemas;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StartPage extends TestBase {

    private By movieSection = By.xpath("//a[@href='/filmas/sobrid-kinoteatri']");
    private By englishLanguage = By.xpath("//*[@id='main-header']/div/div[3]/div/div[1]/div/div/a[1]");

    private By searchMovie = By.xpath("//button[@class='btn btn-link global-search-button hidden-xs hidden-sm hidden-md']");
    private By searchField = By.xpath("(//div[@class='input-group']//input[@class='form-control global-search-input'])[2]");
    private By searchButton = By.xpath("(//button[@class='btn btn-default'])[2]");
    private By submitMovieName = By.xpath("(//ul[@class='list-group dynamic-search-result']//a[@class='one-line'])[2]");
    private By chooseDate = By.xpath("//div[@class='dropdown-container ']//select[@class='form-control  jsTriggerSettingDataValue']");
    private By exactDate = By.xpath("//select[@class='form-control  jsTriggerSettingDataValue']//option[@value='02.01.0001']");
    private By buyTicket = By.xpath("(//div[@class='show-list-item-inner'])[3]//a[@class='btn btn-primary btn-lg hidden-xs']");
    //   private By loginField
    //  private By passwordField
    //  private By loginButton
    //  private By ticketButton
    //  private By buyTicketButton
    //  private By seatButton
    //   private By confirmButton

    public void movieSectionClick() {

        driver.findElement(movieSection).click();
    }

    public void languageSelectionButton() {


        driver.findElement(englishLanguage).click();
    }

    public void searchMovieButtonClick() {
        driver.findElement(searchMovie).click();
    }

    public void searchFormInput() {

        driver.findElement(searchField).sendKeys("Kung Fu");
    }

    public void setSubmitMovieNameClick() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(submitMovieName));

        driver.findElement(submitMovieName).click();
    }

    public void chooseDateClick(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

        driver.findElement(chooseDate).click();
    }

    public void exactDateClick(){

        driver.findElement(exactDate).click();
    }

    public void buyTicketClick(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(buyTicket));
        driver.findElement(buyTicket).click();

    }

}








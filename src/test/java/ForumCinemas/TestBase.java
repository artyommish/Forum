package ForumCinemas;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
    public static ChromeDriver driver;

    public void startDriver() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\IdeaProjects\\Forum\\src\\test\\resources\\chromedriver.exe");

        driver = new ChromeDriver();
    }

    public void open(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void stopDriver() {

    }
}



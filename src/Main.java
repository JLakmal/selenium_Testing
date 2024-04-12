import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","\"D:\\BITUOM\\Bit\\3 Year\\Semester 6\\QA\\week-5 Selenium\\chromedriver-win64.zip\"");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.close();
    }
}
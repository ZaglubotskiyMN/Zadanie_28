import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helloworld {

private WebDriver webDriver;

@Test
    public void helloWorldGoogle(){
    WebDriverManager.chromedriver().setup();
    webDriver= new ChromeDriver();
    webDriver.get("https://www.google.ru");

    WebElement search = webDriver.findElement(By.name("q"));
    search.sendKeys("Hello World");
    search.submit();
    String title = webDriver.getTitle();
    Assert.assertTrue(title.contains("Hello World"));
}
@Test
public void helloWorldYandex(){
    WebDriverManager.chromedriver().setup();
    webDriver =new ChromeDriver();
    webDriver.get("https://www.yandex.ru");

    WebElement search= webDriver.findElement(By.id("text"));
    search.sendKeys("Hello World");
    search.submit();
    String title = webDriver.getTitle();
    Assert.assertTrue(title.contains("Hello World"));
}
@After
    public void closeDriver(){
    if (webDriver !=null){
        webDriver.quit();
    }
}

}

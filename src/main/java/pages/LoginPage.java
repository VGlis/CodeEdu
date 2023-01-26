package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class LoginPage {

    public WebDriver driver;

    public LoginPage (ChromeDriver driver) {
        this.driver = driver;
    }

    public void openPage () {
        driver.get("https://lms.code.edu.rs/login/index.php");
    }
    public WebElement inputUserName () {
        return driver.findElement(By.xpath("//*[@id='username']"));

    }

    public WebElement inputPassword () {
        return driver.findElement(By.xpath("//*[@id='password']"));

    }

    public WebElement buttonLogin () {
        return driver.findElement(By.id("loginbtn"));
    }

    public void setUserName (String userName) {
        inputUserName().sendKeys(userName);
    }

    public void setPassword (String Passsword) {
        inputPassword().sendKeys(Passsword);
    }

    public void clickLogin () {
        buttonLogin().click();
    }

    public String UserText(){
        return driver.findElement(By.xpath("//*[@id='page']/div[1]/div/div[1]/div/div/div[1]/div/h1[2]")).getText();

    }

    public void sleep(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    public void close () {
        driver.close();
        driver.quit();
    }


}

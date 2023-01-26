package test;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;



public class LogInTest {
    @Test
    public void verifyLoginCodeEdu() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Vladan\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        LoginPage loginpage = new LoginPage(driver);
        loginpage.openPage();

        loginpage.sleep();

        loginpage.setUserName("vladan.g");
        loginpage.setPassword("Vladan.G_C0de");
        loginpage.clickLogin();

        loginpage.sleep();

        System.out.println("LogIn User is: " + loginpage.UserText());
        Assert.assertEquals("Welcome test not found", "Vladan Glišović", loginpage.UserText());

        loginpage.close();

    }
}



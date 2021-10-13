package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumTesting {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Documents\\TSI Training\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://ec2-13-40-10-64.eu-west-2.compute.amazonaws.com:8080/");
        driver.manage().window().setSize(new Dimension(1177, 1039));
        driver.findElement(By.linkText("Zoo Creation")).click();
        if(driver.getCurrentUrl().equals("http://ec2-13-40-10-64.eu-west-2.compute.amazonaws.com:8080/zooCreation")){
            System.out.println("Open Zoo Creation: Passed");
        }else{
            System.out.println("Open Zoo Creation: Failed");
        }
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.id("weight")).click();
        driver.findElement(By.id("weight")).sendKeys("30");
        driver.findElement(By.id("breed")).click();
        driver.findElement(By.id("breed")).sendKeys("Brown");
        driver.findElement(By.id("yob")).click();
        driver.findElement(By.id("yob")).sendKeys("1996");
        driver.findElement(By.id("catAdderForm")).click();
        driver.findElement(By.id("speed")).click();
        driver.findElement(By.id("speed")).sendKeys("50");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(text(), 'Add Cat')]")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        driver.findElement(By.linkText("Zoo Creation")).click();
    }

}

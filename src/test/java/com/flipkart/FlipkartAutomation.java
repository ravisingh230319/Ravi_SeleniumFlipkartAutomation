package com.flipkart;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class FlipkartAutomation {

    public static void main(String args[]) {
        try {
            ChromeOptions options = new ChromeOptions();
            options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
            System.setProperty("webdriver.chrome.driver", "src/test/java/chromedriver");
            WebDriver driver = new ChromeDriver(options);

            driver.manage().window().maximize();
            driver.get("https://www.flipkart.com/");
            Thread.sleep(800);
            driver.findElement(By.className("_2doB4z")).click();
            Thread.sleep(800);
            driver.findElement(By.className("_3704LK")).sendKeys("Women dress");

            Thread.sleep(800);
            driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
            Thread.sleep(1000);
            driver.findElement(By.className("_2r_T1I")).click();
            Thread.sleep(1000);
            ArrayList<String> tabs_windows = new ArrayList<String> (driver.getWindowHandles());
            driver.switchTo().window(tabs_windows.get(tabs_windows.size()-1));
            driver.findElement(By.className("cfnctZ")).sendKeys("560029");
            Thread.sleep(2000);
            driver.findElement(By.className("UgLoKg")).click();
            Thread.sleep(1500);
            driver.findElement(By.xpath("//a[@class='_1fGeJ5 _2UVyXR _31hAvz']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//a[@class='_1fGeJ5 PP89tw _2UVyXR _31hAvz']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
            JavascriptExecutor js = (JavascriptExecutor)driver;
            js.executeScript("window.scrollBy(0,400)","");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")).click();
            Thread.sleep(4000);
            driver.quit();
        }catch (Exception e) {
            System.out.println(e.getClass().getName());
        }
    }
}

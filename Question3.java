package com.LickingHeights;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class Question3 {
    public static void main(String[] args) throws InterruptedException {

//        Positive Skenario

//        ========================checkout======================

        System.setProperty("webdriver.edge.driver", "D:\\git.server\\SeleniumLearning\\edgedriver_win64_2\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//launching the specified URL
        driver.get("https://demo.midtrans.com/");

        WebElement buy = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div[1]/div[2]/div/div/a"));
        buy.click();
//

        WebElement MidtransPill = driver.findElement(By.xpath("//td[text()='Midtrans Pillow']/following::input[@class='text-right']"));
        MidtransPill.clear();
        MidtransPill.sendKeys("200");
//
        WebElement name = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div[2]/div[1]/div[4]/table/tbody/tr[1]/td[2]/input"));
        name.clear();
        name.sendKeys("Alfath febriadi");

        WebElement Email = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div[2]/div[1]/div[4]/table/tbody/tr[2]/td[2]/input"));
        Email.clear();
        Email.sendKeys("abcd@gmail.com");

        WebElement noTelp = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div[2]/div[1]/div[4]/table/tbody/tr[3]/td[2]/input"));
        noTelp.clear();
        noTelp.sendKeys("021123123123");

        WebElement city = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div[2]/div[1]/div[4]/table/tbody/tr[4]/td[2]/input"));
        city.clear();
        city.sendKeys("Jakarta");

        WebElement Adress = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div[2]/div[1]/div[4]/table/tbody/tr[5]/td[2]/textarea"));
        Adress.clear();
        Adress.sendKeys("Jl Swadaya V");

        WebElement postalCode = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div[2]/div[1]/div[4]/table/tbody/tr[6]/td[2]/input"));
        postalCode.clear();
        postalCode.sendKeys("14045");


        WebElement Checkout = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div[2]/div[2]/div[1]"));
        Checkout.click();

    }
}

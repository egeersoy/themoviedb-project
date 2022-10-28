package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class themoviedb_get_popular {

    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver","chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://developers.themoviedb.org/3/movies/get-popular-movies");

        Thread.sleep(1000);

        WebElement api_url = driver.findElement(By.xpath("//*[@id=\"section-item-get-popular-movies\"]/div/div[3]/div/div[3]/div/span/text()"));
        String api_url1 = api_url.getText();
        System.out.println("The url is : " + api_url1);
        driver.close();

    }

}

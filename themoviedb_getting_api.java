package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class themoviedb_getting_api {

    public static void main(String[] args) throws Exception{

        System.setProperty("webdriver.chrome.driver","chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://www.themoviedb.org/");

        WebElement giris = driver.findElement(By.cssSelector("body > div.page_wrap._wrap > header > div.content > div > div.flex > ul > li:nth-child(3) > a"));
        giris.click();

        WebElement kullaniciadi = driver.findElement(By.id("username"));
        kullaniciadi.click();
        kullaniciadi.sendKeys("egeersoy");

        WebElement sifre = driver.findElement(By.id("password"));
        sifre.click();
        sifre.sendKeys("byege123");

        WebElement girisbuton = driver.findElement(By.id("login_button"));
        girisbuton.click();

        WebElement sekme = driver.findElement(By.cssSelector("body > div.page_wrap._wrap > header > div.content > div > div.flex > ul > li.user > a > div > img"));
        sekme.click();

        driver.get("https://www.themoviedb.org/settings/account");

        WebElement api = driver.findElement(By.cssSelector("#settings_menu_scroller > ul > li:nth-child(9) > a"));
        api.click();

        WebElement clickhere = driver.findElement(By.cssSelector("#main > div.inner_block.pad_top > div > div > div > section > div > p:nth-child(8) > a"));
        clickhere.click();

        WebElement developer = driver.findElement(By.cssSelector("#main > div.inner_block.pad_top > div > div > div > section > div > div.choose_api_key_type > div:nth-child(1) > h3 > a"));
        developer.click();

        WebElement accept = driver.findElement(By.cssSelector("#main > div.inner_block.pad_top > div > div > div > section > div > span > button.k-button.k-primary.accept.border_color.background_color.red"));
        accept.click();

        WebElement uygulama_adi = driver.findElement(By.id("application_name"));
        uygulama_adi.click();
        uygulama_adi.sendKeys("Postman");

        WebElement uygulama_url = driver.findElement(By.name("application_url"));
        uygulama_url.click();
        uygulama_url.sendKeys("www.postman.com");

        WebElement uygulama_ozet = driver.findElement(By.name("application_summary"));
        uygulama_ozet.click();
        uygulama_ozet.sendKeys("postman get api postman get api postman get api postman get api");

        WebElement ad = driver.findElement(By.name("contact_first_name"));
        ad.click();
        ad.sendKeys("Ege");

        WebElement soyad = driver.findElement(By.name("contact_last_name"));
        soyad.click();
        soyad.sendKeys("Ersoy");

        WebElement phone = driver.findElement(By.name("contact_phone"));
        phone.click();
        phone.sendKeys("5301362241");

        WebElement adres1 = driver.findElement(By.name("address_1"));
        adres1.click();
        adres1.sendKeys("Kocaeli");

        WebElement adres2 = driver.findElement(By.name("address_2"));
        adres2.click();
        adres2.sendKeys("Kocaeli");

        WebElement city = driver.findElement(By.name("address_city"));
        city.click();
        city.sendKeys("Kocaeli");

        WebElement state = driver.findElement(By.name("address_state"));
        state.click();
        state.sendKeys("Kocaeli");

        WebElement postalcode = driver.findElement(By.name("address_postal_code"));
        postalcode.click();
        postalcode.sendKeys("41040");

        Thread.sleep(1000);

        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();


        driver.get("https://www.themoviedb.org/settings/api");

        Thread.sleep(1000);

        WebElement api_key = driver.findElement(By.id("v3_api_key"));
        String key = api_key.getText();
        System.out.println("The key is : " + key);
        driver.close();

    }

}

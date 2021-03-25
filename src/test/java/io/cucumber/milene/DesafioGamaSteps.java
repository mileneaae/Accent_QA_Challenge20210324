package io.cucumber.milene;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
import org.junit.rules.ExpectedException;


import static org.junit.Assert.assertEquals;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class DesafioGamaSteps{

    public DesafioGamaSteps(){
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        browser = new ChromeDriver();
    }

    public WebDriver browser;

    @Dado("que eu estou no site da gama academy {string}")
    public void que_eu_estou_no_site_da_gama_academy(String string) {
    browser.get("https://www.gama.academy/");
    }

    @Dado("fecho o pup-up")
    public void fecho_o_pup_up() throws InterruptedException {
    Thread.sleep(5000);
    WebElement input = browser.findElement( By.cssSelector(".ub-emb-close"));
    input.click();  
    }

    @Dado("clico na opcao Quem somos")
    public void clico_na_opcao_Quem_somos() {
    WebElement input = browser.findElement( By.cssSelector("a[class= 'nav-link nav w-nav-link']"));
    input.click();  
    }
    
    @Entao("deve ver o item do {string}")
    public void deve_ver_o_item_do(String string) {
    WebElement input = browser.findElement( By.cssSelector(".manifesto h1.heading.lado"));
    assertEquals(string, input.getText());
    browser.quit();   
    }
}
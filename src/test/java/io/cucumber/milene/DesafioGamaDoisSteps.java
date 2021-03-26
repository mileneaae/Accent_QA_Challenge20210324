package io.cucumber.milene;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;   

public class DesafioGamaDoisSteps{

    public DesafioGamaDoisSteps(){
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        browser = new ChromeDriver();
    }

    public WebDriver browser;


    @Dado("que eu estou no site da gama {string}")
    public void que_eu_estou_no_site_da_gama(String string) {
    browser.get("https://www.gama.academy/");
    }

    @Dado("fecho a propaganda")
    public void fecho_o_pup_up() throws InterruptedException {
    Thread.sleep(5000);
    WebElement input = browser.findElement( By.cssSelector(".ub-emb-close"));
    input.click();  
    }

    @Dado("clico na opcao DEV FULLSTACK")
    public void clico_na_opcao_DEV_FULLSTACK() {
    WebElement input = browser.findElement( By.cssSelector(".bt-chamada btc-alt w-button"));
    input.click();  
    }

    @Entao("ver as opcoes")
    public void ver_as_opcoes(io.cucumber.datatable.DataTable dataTable) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
    throw new io.cucumber.java.PendingException();
    }
    
    }
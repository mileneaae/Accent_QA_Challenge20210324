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

public class DesafioGamaStepsDois{

    public DesafioGamaStepsDois(){
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        browser = new ChromeDriver();
    }

    public WebDriver browser;

    @Dado("que eu estou no site da gama academy {string}")
    public void que_eu_estou_no_site_da_gama_academy(String string) {
    browser.get("https://www.gama.academy/");
    }

    @Dado("clico na opcao {string}")
    public void clico_na_opcao(String string) {
    WebElement input = browser.findElement( By.cssSelector("lp-element lp-pom-button"));
    input.click();  
    }

    @Entao("devo ver o valor e o botao comprar agora")
    public void devo_ver_o_valor_e_o_botao_comprar_agora() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
    }

    @Dado("clico na opcao {string}")
    public void clico_na_opcao(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
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
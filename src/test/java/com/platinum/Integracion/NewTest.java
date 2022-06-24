package com.platinum.Integracion;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	private WebDriver driver;
  @Test
  public void f() {
	  WebElement cuadroBusqueda = driver.findElement(By.name("q"));
	  
	  cuadroBusqueda.sendKey("pagina principal");
	  cuadroBusqueda.click();
	  
	  cuadroBusqueda.submit();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  AssertJUnit.assertEquals("pagina principla - Google search ", driver.getTitle());
  }
  @BeforeTest
  public void beforeTest() {
	  
	  String setProperty = System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Documents\\Chromedriver\\\\chromedriver.exe");
	  driver = new WebDriver();
	  driver.manage().window().maximize();
	  driver.get("https://ww.google.com/");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}

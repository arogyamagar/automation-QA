// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class EditTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void edit() {
    driver.get("https://dev.keela.co/");
    driver.manage().window().setSize(new Dimension(945, 1012));
    driver.findElement(By.cssSelector(".nav-main > .nav-main-item:nth-child(3) .nav-main-link-name")).click();
    driver.findElement(By.linkText("-")).click();
    driver.findElement(By.cssSelector(".block:nth-child(4) .btn")).click();
    driver.findElement(By.id("eCzJuNvs6W8Rh86FT")).click();
    driver.findElement(By.id("eCzJuNvs6W8Rh86FT")).sendKeys("aa@a.com");
    driver.findElement(By.id("ZruXKmyt8hTApRkwo")).click();
    driver.findElement(By.id("riS8PPocwbeeFpZ97")).click();
    driver.findElement(By.id("riS8PPocwbeeFpZ97")).sendKeys("989898989");
    driver.findElement(By.id("tAFc3rKJdspMBSkRestreet")).click();
    driver.findElement(By.id("tAFc3rKJdspMBSkRestreet")).click();
    driver.findElement(By.id("tAFc3rKJdspMBSkRestreet")).sendKeys("lalitpur");
    driver.findElement(By.id("w7rsqzi3Te2nTZezcstreet")).click();
    driver.findElement(By.cssSelector("div:nth-child(9) .col-12:nth-child(3) > .form-control")).click();
    driver.findElement(By.id("tAFc3rKJdspMBSkRecountry")).click();
    driver.findElement(By.id("tAFc3rKJdspMBSkRecountry")).sendKeys("Nepal");
    driver.findElement(By.id("tAFc3rKJdspMBSkRecity")).click();
    driver.findElement(By.id("tAFc3rKJdspMBSkRecity")).sendKeys("Lalitpur");
    driver.findElement(By.cssSelector(".v--modal-background-click")).click();
    driver.findElement(By.cssSelector(".btn-primary:nth-child(1)")).click();
  }
}

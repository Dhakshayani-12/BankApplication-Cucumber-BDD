package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;

public class Guru99Steps {

WebDriver driver;
String customerId;

@Given("User opens the browser")
public void open_browser() {

driver = new ChromeDriver();
driver.manage().window().maximize();

}

@When("User navigates to Guru99 site")
public void open_site() {

driver.get("https://demo.guru99.com/V4/");

}

@And("User enters username and password")
public void login_credentials() {

driver.findElement(By.name("uid")).sendKeys("mngr655502");
driver.findElement(By.name("password")).sendKeys("jYsUtys");

}

@And("User clicks login")
public void click_login() throws InterruptedException {

driver.findElement(By.name("btnLogin")).click();
Thread.sleep(4000);

}

@And("User adds new customer")
public void add_customer() throws InterruptedException {

driver.findElement(By.linkText("New Customer")).click();

Thread.sleep(2000);

driver.findElement(By.name("name")).sendKeys("Ravi Kumar");
driver.findElement(By.xpath("//input[@value='m']")).click();
driver.findElement(By.name("dob")).sendKeys("01011990");

driver.findElement(By.name("addr")).sendKeys("Hyderabad");
driver.findElement(By.name("city")).sendKeys("Hyderabad");
driver.findElement(By.name("state")).sendKeys("Telangana");

driver.findElement(By.name("pinno")).sendKeys("500001");
driver.findElement(By.name("telephoneno")).sendKeys("9876543210");

driver.findElement(By.name("emailid"))
.sendKeys("ravi" + System.currentTimeMillis() + "@gmail.com");

driver.findElement(By.name("password")).sendKeys("ravi123");

driver.findElement(By.name("sub")).click();

Thread.sleep(5000);

// capture customer id

customerId = driver.findElement(By.xpath("//td[text()='Customer ID']/following-sibling::td")).getText();

System.out.println("Customer ID: " + customerId);

}

@And("User goes to homepage")
public void go_homepage() throws InterruptedException {

JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollTo(0,0)");

Thread.sleep(2000);

driver.findElement(By.xpath("//a[text()='Continue']")).click();

Thread.sleep(4000);

}

@And("User edits customer")
public void edit_customer() throws InterruptedException {

driver.findElement(By.linkText("Edit Customer")).click();

Thread.sleep(2000);

driver.findElement(By.name("cusid")).sendKeys(customerId);

driver.findElement(By.name("AccSubmit")).click();

Thread.sleep(3000);

driver.findElement(By.name("addr")).clear();
driver.findElement(By.name("addr")).sendKeys("New Address Hyderabad");

driver.findElement(By.name("city")).clear();
driver.findElement(By.name("city")).sendKeys("Hyderabad");

driver.findElement(By.name("sub")).click();

Thread.sleep(4000);

// go to manager homepage directly

driver.get("https://demo.guru99.com/V4/manager/Managerhomepage.php");

Thread.sleep(3000);

}
String accountNo;

@And("User creates new account")
public void create_account() throws InterruptedException {

driver.findElement(By.linkText("New Account")).click();

Thread.sleep(2000);

driver.findElement(By.name("cusid")).sendKeys(customerId);

Thread.sleep(2000);
driver.findElement(By.name("selaccount")).sendKeys("Savings");

driver.findElement(By.name("inideposit")).sendKeys("5000");

driver.findElement(By.name("button2")).click();

Thread.sleep(4000);

// capture account number

accountNo = driver.findElement(By.xpath("//td[text()='Account ID']/following-sibling::td")).getText();

System.out.println("Account Number: " + accountNo);
driver.get("https://demo.guru99.com/V4/manager/Managerhomepage.php");

Thread.sleep(3000);


}



@Then("User logs out")
public void logout() throws InterruptedException {

// go to manager homepage first

driver.get("https://demo.guru99.com/V4/manager/Managerhomepage.php");

Thread.sleep(3000);

// click logout

driver.findElement(By.linkText("Log out")).click();

Thread.sleep(2000);

// accept alert

driver.switchTo().alert().accept();

Thread.sleep(2000);

// close browser

driver.quit();

}

}


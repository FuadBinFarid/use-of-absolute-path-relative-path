package automtionpack;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;


public class automationcls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initializations
				WebDriverManager.edgedriver().setup();
				WebDriver driver= new EdgeDriver();
				//For connecting driver with webpage
				driver.get("https://www.saucedemo.com/");
				//for opening a window
				driver.manage().window().maximize();
				//User name
				driver.findElement(By.id("user-name")).sendKeys("standard_user");
				//Password
				driver.findElement(By.id("password")).sendKeys("secret_sauce");
				//click signin button
				driver.findElement(By.id("login-button")).click();
				//add to cart by absolute path
				driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button")).click();
				//cart relative path
				driver.findElement(By.cssSelector("a.shopping_cart_link")).click();
				//Checkout button
				driver.findElement(By.cssSelector("button#checkout")).click();
				//checkout info
				driver.findElement(By.id("first-name")).sendKeys("Fuad");
				driver.findElement(By.id("last-name")).sendKeys("Farid");
				driver.findElement(By.id("postal-code")).sendKeys("1219");
				//CSS
				driver.findElement(By.cssSelector("input#continue")).click();
				//finish button click
				driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div[9]/button[2]")).click();
				//driver.findElement(By.cssSelector("button#add-to-cart-sauce-labs-backpack")).click();

	}

}

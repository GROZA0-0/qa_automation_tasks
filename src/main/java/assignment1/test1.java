package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		 WebDriver driver =new EdgeDriver();
		 driver.get("https://katalon-demo-cura.herokuapp.com/profile.php#login");
	    driver.findElement(By.linkText("info@katalon.com")).click();
		 driver.findElement(By.tagName("h2")).click();
		 driver.findElement(By.tagName("input")).clear();

	}

}

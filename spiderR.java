package ruqat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class spiderR {

 public static void main(String[] args) {
  WebDriver driver = new FirefoxDriver();
  driver.get("http://www.shophive.com/apple/mac?p=");
  WebElement i = driver.findElement(By.xpath("//div[1]/ol/li/a"));
  System.out.println(i);
  driver.close();
 }
}
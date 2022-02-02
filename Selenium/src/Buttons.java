import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Buttons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		Actions myActions = new Actions(driver);
		driver.get("https://demoqa.com/buttons");
		System.out.println(driver.getTitle());
		WebElement doubleClickLocator =  driver.findElement(By.id("doubleClickBtn"));
		WebElement rightClickLocator =  driver.findElement(By.id("rightClickBtn"));
		myActions.doubleClick(doubleClickLocator).perform();
		myActions.contextClick(rightClickLocator).perform();
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		
	}

}

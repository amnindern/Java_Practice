import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");
		System.out.println(driver.getTitle());
		WebElement yesRadio = driver.findElement(By.xpath("//input[@id='yesRadio']/following-sibling::label"));
		WebElement impresiveRadio = driver.findElement(By.xpath("//input[@id='impressiveRadio']/following-sibling::label"));
		WebElement noRadio = driver.findElement(By.xpath("//input[@id='noRadio']/following-sibling::label"));
		if (!yesRadio.getAttribute("class").contains("disabled")) {
			yesRadio.click();
			System.out.println(driver.findElement(By.cssSelector("p.mt-3")).getText());
			Thread.sleep(1000);
			// System.out.print(driver.findElement(By.cssSelector("p.mt-3
			// span")).getText());
		} else
			System.out.println("yesRadio Not Active");

		if (!impresiveRadio.getAttribute("class").contains("disabled")) {
			impresiveRadio.click();
			System.out.println(driver.findElement(By.cssSelector("p.mt-3")).getText());
			Thread.sleep(1000);
		} else
			System.out.println("impresiveRadio Not Active");
		
//		System.out.println(noRadio.getAttribute("class").contains("disabled"));
		
		if (!noRadio.getAttribute("class").contains("disabled"))
			noRadio.click();
		else
			System.out.println("noRadio Button Not Active");

	}

}

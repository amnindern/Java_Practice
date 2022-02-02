import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/text-box");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("userName")).sendKeys("Amninder Singh");
		driver.findElement(By.id("userEmail")).sendKeys("amnindern@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("61 Finch Ave, Scarborough ON M1S1K6");
		driver.findElement(By.id("permanentAddress")).sendKeys("1229 Bayview Ave, North York ON M8V9F6");
		driver.findElement(By.id("submit")).click();

	}

}

import java.util.List;
import java.util.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String toClick = "WorkSpace";
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver.exe");
		List<WebElement> nameOutput;
		List<WebElement> buttonOutput;
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		System.out.println(driver.getTitle());

		int numberOfButtons, numberOfText = 0, clickOfButtons = 0;
		buttonOutput = driver.findElements(By.xpath("//span[@class='rct-text']/button"));
		numberOfButtons = buttonOutput.size();
		nameOutput = driver.findElements(By.xpath("//span[@class='rct-title']"));
		numberOfText = nameOutput.size();
		for (int i = 0; i < numberOfButtons; i++) {

			for (WebElement name : nameOutput) {
				if (name.getText().contains(toClick)) {
					name.click();
					break;
				}
			}
			buttonOutput.get(i).click();
//			clickOfButton.click();
			buttonOutput = driver.findElements(By.xpath("//span[@class='rct-text']/button"));
			numberOfButtons = buttonOutput.size();
			nameOutput = driver.findElements(By.xpath("//span[@class='rct-title']"));
			numberOfText = nameOutput.size();

		}

//
//			driver.findElement(By.xpath("//span[text()='Home']")).click();
//			driver.findElements(By.xpath("//span[@class='rct-text']/button"));
//
//			outputArray = output.toArray();
//			System.out.println(outputArray[2]);
	}
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import java.util.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {

		List <String> toClick = new ArrayList<>(Arrays.asList( "Word", "Excel","Notes","Ammi")); 
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		System.out.println(driver.getTitle());
		boolean doneOrNo = false;
		List<WebElement> buttonOutput = driver.findElements(By.xpath("//span[@class='rct-text']/button"));
		int numberOfButtons = buttonOutput.size();
		List<WebElement> nameOutput = driver.findElements(By.xpath("//span[@class='rct-title']"));
		for (int i = 0; i <= numberOfButtons; i++) {

			for (WebElement name : nameOutput) {
				for (int j = 0; j < toClick.size(); j++) {
					if (name.getText().contains(toClick.get(j))) {
						name.click();
						toClick.remove(j);
						if (toClick.isEmpty()) {
							doneOrNo = true;
							break;
						}

					}
				}
				if (doneOrNo)
					break;
			}
			if (doneOrNo || i == numberOfButtons)
				break;
			buttonOutput.get(i).click();
			buttonOutput = driver.findElements(By.xpath("//span[@class='rct-text']/button"));
			numberOfButtons = buttonOutput.size();
			nameOutput = driver.findElements(By.xpath("//span[@class='rct-title']"));

		}
	}
}

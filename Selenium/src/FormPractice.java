import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormPractice {

	static void calenderSelection(String input,WebDriver driver){

		String[] inputArray = input.split(" ");
		String[] monthName = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		int monthNumber = 0;
		for (int j = 0; j < monthName.length; j++)
			if (monthName[j].equals(inputArray[1]))
				monthNumber = j;
		
		boolean pass = false;
		boolean done = false;
		driver.findElement(By.id("dateOfBirthInput")).click();
		driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']/option[@value='"+monthNumber+"']")).click();
		driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']/option[@value='"+inputArray[2]+"']")).click();
		driver.findElement(By.cssSelector(".react-datepicker__day--0"+inputArray[0])).click();
//		System.out.println(dateElements.size());
		/*
		 * for (int i = 1; i <= dateElements.size(); i++) { List<WebElement>
		 * dateElementsColumn = driver
		 * .findElements(By.xpath("//div[@class='react-datepicker__month']/div[" + i +
		 * "]/div")); for (int j = 1; j <= dateElementsColumn.size(); j++) { WebElement
		 * select =
		 * driver.findElement(By.xpath("//div[@class='react-datepicker__month']/div[" +
		 * i + "]/div[" + j + "]")); String dateCheck = select.getText(); if
		 * (dateCheck.equals("1")) pass = true; if (dateCheck.equals(inputArray[0]) &&
		 * pass == true) { select.click(); pass = false; done = true; break; } }
		 * if(done) break; }
		 */
		

	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("firstName")).sendKeys("Amninder");
		driver.findElement(By.id("lastName")).sendKeys("Singh");
		driver.findElement(By.id("userEmail")).sendKeys("amnindern@gmail.com");
		driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
		driver.findElement(By.id("userNumber")).sendKeys("6474020189");
		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();
		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']")).click();
		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']")).click();
		driver.findElement(By.id("currentAddress")).sendKeys("1235 Huntingwood Drive,Scarborough ON M1S1K6");
		calenderSelection("19 Nov 1994",driver);
		
		
	}

}

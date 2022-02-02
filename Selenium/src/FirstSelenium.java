import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com/");
		System.out.println(driver.getTitle());			
	}

}

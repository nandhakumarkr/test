import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test {
	public static void main(String [] args) {
		System.setProperty("webdriver.gecko.driver", "/home/nandhakumar/Desktop/down/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
	}
	

}

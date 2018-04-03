import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Hi {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","./softawre/chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","./softawre/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	}


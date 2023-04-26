package TEP;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TEP {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chromedriver\\chromedriver.exe");
	        WebDriver w = new ChromeDriver();
	        w.get("https://sit.titaneyeplus.com/");
	        System.out.println("Page Title is: " + w.getTitle());
	        w.manage().window().maximize();
	        Thread.sleep(1000);
	        w.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[2]/ul/li[2]/a")).click();
	        Thread.sleep(1000);

	}

}

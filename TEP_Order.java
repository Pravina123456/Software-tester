package TEPTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;		
import java.util.Set;	
import org.openqa.selenium.NoAlertPresentException;	
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TEP_Order {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chromedriver\\chromedriver.exe");
	        WebDriver w = new ChromeDriver();
	        w.get("https://sit.titaneyeplus.com/nextjs");
	        System.out.println("Page Title is: " + w.getTitle());
	        w.manage().window().maximize();
	        w.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[2]/ul/li[2]/a")).click();
 // Sign in        
	        String myWindowHandle = w.getWindowHandle();
	        w.switchTo().window(myWindowHandle);
	        w.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/form/div[2]/div/div/input")).sendKeys("8108274394");
	    	w.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/form/div[2]/div/div/div[2]/button")).click();
	    	Thread.sleep(500);
		    w.findElement(By.xpath("//*[@id=\"otp_1\"]")).sendKeys("2");
		    w.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/form/div[1]/div[1]/div/div/input[2]")).sendKeys("1");
		    w.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/form/div[1]/div[1]/div/div/input[3]")).sendKeys("4"); 	
		    w.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/form/div[1]/div[1]/div/div/input[4]")).sendKeys("2");
		    w.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/form/div[1]/div[1]/div/div/input[5]")).sendKeys("6");
		    w.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/form/div[1]/div[1]/div/div/input[6]")).sendKeys("3");
		    w.findElement(By.xpath("//*[@id=\"verify_mobile_otp_btn\"]")).click();
		    Thread.sleep(3000);
// redirect to My Account	
		    w.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		    Actions actions = new Actions(w);
		    WebElement menuOption = w.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[2]/ul/li[2]/a"));
		    actions.moveToElement(menuOption).perform();
		    w.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[2]/ul/li[2]/ul/li[1]/a")).click();
		    Thread.sleep(500);
//redirect to wishlist		    
		    w.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div[1]/div/ul/li[4]/a")).click();
		    System.out.println("Wishlist Page Title: " + w.getTitle());
		    
		    
		    //w.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div[2]/div/div[2]/div[1]/div[1]/button[2]")).click();
//redirect to cart		    
		    w.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		    JavascriptExecutor js = (JavascriptExecutor) w;
		    js.executeScript("window.scrollBy(0,2700)");	
            
		    //WebElement w1;
		    //WebDriverWait wait=new WebDriverWait(w,10);
			//w1= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"__next\\\"]/div[2]/div[2]/div[2]/div/div[2]/div[2]/div/div/div/div[2]/button")));
			//w1.click();
		    
		    
		    w.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		    w.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div[2]/div/div[2]/div[2]/div/div/div/div[2]/button")).click();
		
		    Thread.sleep(1500);
		    System.out.println("Cart Page Title" + w.getTitle());
		    JavascriptExecutor js1 = (JavascriptExecutor) w;
		    js1.executeScript("window.scrollBy(0,2500)");
		    w.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		    w.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div/div/div[3]/div[3]/div/div[1]/div[4]/button")).click();
		    System.out.println("Page Title on click of Proceed: " + w.getTitle());
// 
		    JavascriptExecutor js2 = (JavascriptExecutor) w;
		    js2.executeScript("window.scrollBy(0,3000)");
		    w.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		    w.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div/div/div[3]/div[3]/div/div[1]/div[4]/button")).click();
		    Thread.sleep(2000);
		    System.out.println("Page Title on click of Review Order: " + w.getTitle());
		    
		    w.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div/div/div[3]/div[3]/div/form[2]/div/div[2]/span[2]/input")).sendKeys("347");
		    w.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div/div/div[3]/div[3]/div/form[2]/div/div[3]/button")).click();
		    
		    Thread.sleep(2000);
		    JavascriptExecutor js3 = (JavascriptExecutor) w;
		    js3.executeScript("window.scrollBy(0,4000)");
		    w.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		    w.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div/div/div[3]/div[3]/div/div[1]/div[4]/button")).click();
		    
		    
		    
	}

}

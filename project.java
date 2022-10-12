import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

class HelloWorld {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\HEMANTH\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//maximize window
		driver.manage().window().maximize();
		//URL launch
		driver.get("https://www.demoblaze.com/index.html");
		Thread.sleep(3000);
		//identify element by class
		WebElement m = driver.findElement(By.className("hrefch"));
		m.click();
		//added wait time
	    Thread.sleep(4000);
	    //identify element by xpath
	    WebElement c=driver.findElement(By.xpath("(//a)[12]"));
	    c.click();
	    Thread.sleep(4000);
	    //to handle pop up
	    driver.switchTo().alert().accept();
	    // identify element by id
      WebElement a =driver.findElement(By.id("cartur"));
	    a.click();
	    WebElement p = driver.findElement(By.xpath("//div[@id='page-wrapper']//button"));
	    p.click();
	    //fill the details
	    Thread.sleep(4000);
	    driver.findElement(By.id("name")).sendKeys("Yashwanth sai");
	    driver.findElement(By.id("country")).sendKeys("India");
	    driver.findElement(By.id("city")).sendKeys("polavaram");
	    driver.findElement(By.id("card")).sendKeys("09898989898");
	    driver.findElement(By.id("month")).sendKeys("04");
	    driver.findElement(By.id("year")).sendKeys("2025");
	    Thread.sleep(8000);
      //purchase
	    WebElement s = driver.findElement(By.xpath("((//div[@class='modal-footer'])[3]//button)[2]"));
	    s.click();
	    
	}
}

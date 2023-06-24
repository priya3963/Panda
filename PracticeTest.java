package day2Jun_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTest {
	
	static WebDriver driver;
	static WebElement getWebElement(By by)
	{
		return driver.findElement(by);
		
	}
	static String s1=null;
	static String s2=null;
	static String txt=null;
//	static String name="15";
	
	
	static void textElemnt(String txt)

	{	
		switch(txt)
		{
		case "1":
			txt=getWebElement(By.xpath("//div[@class='elementor-counter-title']")).getText();
			System.out.println(txt);	
			break;
			
		case "2":
			txt=getWebElement(By.xpath("(//div[@class='elementor-counter-title'])[2]")).getText();
		    System.out.println(txt);
		    break;
		    
		case "3":
			 txt=getWebElement(By.xpath("(//div[@class='elementor-counter-title'])[3]")).getText();
			   System.out.println(txt);
			   break;
			   		
		default:
			System.out.println("Invalid text : " + txt);
		}
	}
	static void counterNumber() throws InterruptedException

	{
		String s1,s2;
			s1=getWebElement(By.xpath("//div[@class='elementor-counter-number-wrapper'][1]//span[2][@data-to-value='50']")).getText();
			s2=getWebElement(By.xpath("//span[@class='elementor-counter-number-suffix']")).getText();
			System.out.println(s1+s2);
			textElemnt("1");
			Thread.sleep(3000l);
		
	
			s1= getWebElement(By.xpath("(//div[@class='elementor-counter-number-wrapper'])[2]//span[2][@data-to-value='15']")).getText();
		     s2=getWebElement(By.xpath("(//span[@class='elementor-counter-number-suffix'])[2]")).getText();
		    System.out.println(s1+s2);
		     textElemnt("2");
		    Thread.sleep(3000l);

		    s1=getWebElement(By.xpath("(//span[2][@class='elementor-counter-number'])[3]")).getText();
			   s2=getWebElement(By.xpath("(//span[@class='elementor-counter-number-suffix'])[3]")).getText();
			   System.out.println(s1+s2);
			  textElemnt("3");
			   Thread.sleep(3000l);
		
	}
public static void main(String[] args) throws InterruptedException {
	
	
	
	driver=new ChromeDriver();
	driver.get("http://dista.ai/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	Thread.sleep(4000l);
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,1500);", "");
	
	Thread.sleep(4000l);
	
	
	counterNumber();
driver.quit();	

}
}

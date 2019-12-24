import net.sourceforge.htmlunit.corejs.javascript.ast.IfStatement;
import net.sourceforge.htmlunit.corejs.javascript.ast.SwitchCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Methods {
	//static WebDriver driver=new FirefoxDriver();
	
	//WebDriver driver = new ChromeDriver();
	static WebDriver driver=new ChromeDriver();
	
	
	static String log, pass;
	static WebElement element;
//-------------------------------------------------------------
	public static void setUp(String url) {
		
		driver.get(url);
		System.out.println("set up success");
	}
//-------------------------------------------------------------	
	public static void tearDown() {
		driver.quit();
		System.out.println("driver closed");
	}
//-------------------------------------------------------------	
	public static void click(String path, String type) throws InterruptedException{
		if(isElementPresent(path,type)){
			driver.findElement(By.xpath(path)).click();
			System.out.println(element.getText() + " -click");
		}
		else {
			System.out.println("no element to click");
		}
	}
//-------------------------------------------------------------	
	public static boolean isElementPresent(String path, String type) throws InterruptedException {
		Thread.sleep(100);
		
		switch ( type) {
			case "xpath": element=(new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(path)));
			break;
			case "css" : element=(new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(path)));
			break;
			case "name" : element=(new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.name(path)));
			break;
			case "id" : element=(new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id(path)));
			break;
		}
		
		/*
		switch (true) {
		case (driver.findElement(By.xpath(path))!=null):return true;// не сравнивает boolean курва
		}
		break;
		
		case :if (driver.findElement(By.name(path))!=null) {
			return true;
		}
		break;
		
		case 3:if (driver.findElement(By.id(path))!=null) {
			return true;
		}
		break;
		
		case 4:if (driver.findElement(By.partialLinkText(path))!=null) {
			return true;
		}
		break;
		case 5:if (driver.findElement(By.cssSelector(path))!=null) {
			return true;
		}
		break;
		
		case 6:if (driver.findElement(By.tagName(path))!=null) {
			return true;
		}
		break;

		default:
			System.out.println("wrong type");
			return false;
		}
		*/
		
		if (element!=null){
			System.out.println(element.getText()+" -element present~!");
			return true;
		}
		else 
			System.out.println("No such element!");
			return false;
		/*
		
		*/
		
	}
//-------------------------------------------------------------	

// find the logout button!!!
//name = productForm 
//href = "logout.php" 
//css= body > div.menu_title > span:nth-child(2) > a:nth-child(2)
// xpath = /html/body/div[2]/span[2]/a[2]
// tagname = Logout

	//public static void loginTest() throws InterruptedException{
		/*
		if (isElementPresent("/html/body/div[2]/span[2]/a[1]",1)){
			driver.findElement(By.xpath("/html/body/div[2]/span[2]/a[1]")).click();
		}
		*/
		
		/*
		driver.findElement(By.name("tl_login")).sendKeys(log);
		driver.findElement(By.name("tl_password")).sendKeys(pass);
		driver.findElement(By.name("login_submit")).click();
		
		if (isElementPresent("Logout",6)){
			System.out.println(log +" test positive");
		}
		else{
			System.out.println(log +" test failed");
		}
		
	}
	*/
}

package First;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class SeFirst {
	 public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","D:\\Software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String baseUrl = "http://demo.guru99.com/test/newtours/";
    String expectedTitle = "Welcome Tours";
    String actualTitle = "";

    
    driver.get(baseUrl);

   
    actualTitle = driver.getTitle();

    
    if (actualTitle.contentEquals(expectedTitle)){
        System.out.println("Test Passed!");
    } else {
        System.out.println("Test Failed");
    }
   
    //close Fire fox
    //driver.close();
   
}

}
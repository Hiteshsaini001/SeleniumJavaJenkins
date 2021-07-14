package DemoPackage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import DemoPagePackage.DemoPage;

public class DemoTest extends DemoPage {
	
	@Test
	public void openPage() {
		
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("hiteshsaini");
		
	}

}

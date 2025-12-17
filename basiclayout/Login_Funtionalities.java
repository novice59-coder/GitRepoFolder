package basiclayout;

import org.testng.annotations.Test;

public class Login_Funtionalities extends BaseClass{
	@Test
	public void myntra_Open	()
	{
		HomePage l_page = new HomePage(driver);
		l_page.openWebURL();
		l_page.getWebElementText();
	}
	
	

}
				
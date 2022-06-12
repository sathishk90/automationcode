package scripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import GenericLib.BaseClass;
import pomPages.CorejavaPage;
import pomPages.SkillraryLoginPage;
import pomPages.WishlistPage;

public class Testcase3 extends BaseClass{
	@Test
	public void tc3() throws IOException, InterruptedException {
	SkillraryLoginPage s=new SkillraryLoginPage(driver);
	s.searchtextbox(pdata.getpropertydata("serachtb"));
	s.serachbutton();
	
	CorejavaPage c=new CorejavaPage(driver);
	c.corejavatab();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WishlistPage w=new WishlistPage(driver);
	driverUtilies.switchtoframe(driver);
	w.playbutton();
	Thread.sleep(5000);
	w.pausebutton();
	driverUtilies.switchbackframe(driver);
	w.whishlistbtn();
	
	}

}

package testpkg;

import java.io.IOException;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Orderpage;
import pagepkg.Signinpage;
import pagepkg.Signoutpage;
import utilities.Excelutilities;
import utilpkg.Excelutils;

public class Signintest extends Baseclass{
	Signinpage signinpage;
	Orderpage orderpage;
	Signoutpage signoutpage;
	
	@Test(priority = 1)
	public void verifysignin() {
		signinpage=new Signinpage(driver);
		signinpage.signup();
		signinpage.newaccount();
		
		String xl="F:\\larqprojexcel.xlsx";
		String sheet="Sheet1";
		
		int rowcount=Excelutils.getRowCount(xl, sheet);
		for(int i=1;i<=rowcount;i++) {
			String username=Excelutils.getCellValue(xl, sheet, i, 0);
			System.out.println(username);
			String password=Excelutils.getCellValue(xl, sheet, i, 1);
			System.out.println(password);
			signinpage.setvaues(username,password);
			signinpage.signin();
			  
		}
	}
	@Test(priority = 2)
	public void order() {
		orderpage=new Orderpage(driver);
		orderpage.homepage();
	
		
	}
	@Test(priority = 3)
	public void signout() throws IOException {
		signoutpage=new Signoutpage(driver);
		signoutpage.signout();
		signoutpage.screenshot();
	}

}

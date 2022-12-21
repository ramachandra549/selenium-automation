package test3.in;

import org.testng.annotations.Test;

public class DemoTestNG {

	@Test //(priority=0) // if we don't want to execute particular testcase we can also use (enabled=false)
	public void createCustomer()
	{
		System.out.println("1st User Created");
		
	}
	@Test //(dependsOnMethods="userDeleted")
	public void modify()
	{
		System.out.println("2nd Modify user");
	}
	@Test(priority=1)
	public void userDeleted()
	{
		System.out.println("3rd User--Deleted");
	}
	
}

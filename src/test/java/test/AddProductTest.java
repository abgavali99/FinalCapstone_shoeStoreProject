package test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Pages.AddProduct_Page1;

public class AddProductTest {
	
	@Test
	public void AddProduct()
	{
		AddProduct_Page1 obj = new AddProduct_Page1();
		
		obj.back_to_Home();
		obj.Product();	
		
	}

}
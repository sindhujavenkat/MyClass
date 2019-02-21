package dataProvidersExamples;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

	@DataProvider (name = "searchProductlist")
	
	public String [] data_SearchProduct()
	{
		String[] data = {"Apple", "Samsung", "Redmi"};
		return data;
	}

	@DataProvider (name = "TabNames")
	
	public String [][] data_tabnames()
	{
		String[][] data ={ {"Your Amazon.in", "Amazon Sign In"}, 
						  {"Today's Deals","Amazon.in Today's Deals: Great Savings. Every Day."}, 
						  {"Amazon Pay","Amazon.in: Amazon Pay"},
						  {"Sell","Amazon.in: Sell on Amazon - SYH"},
						  {"Customer Service","Amazon.in Help"}};
		return data;
	}
}


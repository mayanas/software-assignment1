package software_assignment1;



import static org.junit.Assert.assertTrue;

import java.util.ArrayList;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import software_1.Cost;
import software_1.Products;

public class checkout {

	
	private Cost c;
	private int cost=0;
	private int flag=0;
	
	private ArrayList<Products> products=new ArrayList<Products>();
	private Products p;
	
	
	@Given("the price of a {string} is {int}")
	public void thePriceOfAIs(String string, Integer int1) {
		for(Products pr:products) {
			if(pr.getProd().equals(string)) {
				pr.setPrice(int1);
				flag=1;
				break;
			}
		}
		
		if(flag==0) {
		p=new Products();
		p.setProd(string);
		p.setPrice(int1);
		products.add(p);}
		
	}
	
	@When("I checkout {int} {string}")
	public void iCheckout(Integer int1, String string) {
	
		c=new Cost();
		
		for(Products pr:products) {
			if(pr.getProd().equals(string)) {
				cost+=c.findCost(int1, pr.getPrice());
			}
		}
	}
	
	@Then("the total price should be {int}")
	public void theTotalPriceShouldBe(Integer int1) {
		assertTrue(int1==cost);
	}
	
}
package oops.com.polymorphism;
public class Iphone extends Mobile
{
	public Iphone(double price) {
		super(price);
	
	}
   public void CalculateMobilePrice()
   {
	   System.out.println("Iphone Price" +getPrice()*20);
   }

}

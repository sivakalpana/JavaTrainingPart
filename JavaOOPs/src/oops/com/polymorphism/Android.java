package oops.com.polymorphism;

public class Android extends Mobile{
  
	public Android(double price) {
		super(price);
	
	}
   public void CalculateMobilePrice()
   {
	   System.out.println("Android Price" +getPrice());
   }
}

package oops.com.polymorphism;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-Android method stub
       Mobile mobile= null;
       Android android = new Android(20000);
       Iphone iphone = new Iphone(20000);
       
       mobile = android;
       mobile.CalculateMobilePrice();
       
       mobile = iphone;
       mobile.CalculateMobilePrice();
       
       System.out.println();
       
	}

}

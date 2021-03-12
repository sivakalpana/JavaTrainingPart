package oops.com.abstraction;


interface P1{
	default void show() 
    { 
        System.out.println("Default PI1"); 
    } 
} 
interface P2 
{ 
    // Default method 
    default void show() 
    { 
        System.out.println("Default PI2"); 
    } 
} 
public class MultipleInheritanceExample implements P1, P2 {
	 public void show() 
	    { 
	        // use super keyword to call the show 
	        // method of PI1 interface 
	        P1.super.show(); 
	  
	        // use super keyword to call the show 
	        // method of PI2 interface 
	        P2.super.show(); 
	    } 
	public static void main(String[] args) {
		MultipleInheritanceExample mie= new MultipleInheritanceExample();
		mie.show();

	}

}

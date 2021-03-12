package oops.com.abstraction;


	abstract class B{
		abstract void test1();
		void test2() {
			System.out.println("Test 2");
		}
		B(){
			System.out.println("B");
		}
	}
	    public class Abstraction extends B {
	  	  
	    Abstraction(){
	    	super();
	    	System.out.println("Abstraction");
	    }
	    	void test1() {
	    		System.out.println("Test 1");
	    	}
	public static void main(String[] args) {
	        
		Abstraction A = new Abstraction();
		A.test1();
		A.test2();
	}

			
	    }
	 	



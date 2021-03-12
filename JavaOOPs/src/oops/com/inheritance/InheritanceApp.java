package oops.com.inheritance;

class Product{

	 int pid;
	String pname;
	int price; 
	//constructor
	Product(){
	 System.out.println("<<product is defined>>");
 }
 //Methods
	void setProductDetails(int pid, String pname, int price) {
		 this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	void showProductDetails() {
	  System.out.println("---product id:" +pid);
	  System.out.println("Name :" +pname);
	  System.out.println("Price:" +price);
	  
	}
	//setter
	void setPid( int pid) {
		this.pid=pid;
	}
	//getter
	int getPid() {
		return pid;
	}
} 
class Mobile extends Product{
	String os;
	int ram ;
	int sdcard;
	Mobile(){
		System.out.println("Mobile constructor");
	}
	//Two methods in child class 1 parent and another 1 child 
	//both are different as in based on inputs (even though name is same);
	//Method OVERLOADING same method this different inputs;
	void setProductDetails(int pid, String pname, int price, String os, int ram, int sdcard)
	{
		 this.pid = pid;
		 this.pname = pname;
		this.price = price;
		this.os = os;
		this.ram = ram;
		this.sdcard = sdcard; 
		System.out.println("Data written in Mobile");
	}
	//METHOD OVERRIDING  SAME METHOD WITH same inputs  in parent child relationship
	void showProductDetails() {
		  System.out.println("---product id:" +pid);
		  System.out.println("Name :" +pname);
		  System.out.println("Price:" +price);
		  System.out.println("OS :" +os);
		  System.out.println("Ram Size:" +ram);
		  System.out.println("SDcard :" +sdcard);
		  
		}
}
public class InheritanceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     /*  Product product = new Product();
       //writing the data in object
       product.setProductDetails(100,"Mobile",70000);
       
      
       
       product.showProductDetails();
       System.out.println();
       
       Product product1 = new Product();
       //writing the data in object
       
       
      // product1.setProductDetails(101, "LED", 80000);
       product1.setPid(101);
       product1.pname = "LED";
       product1.price = 60000;
       product1.showProductDetails();
       System.out.println();
	
     */
		Mobile mobile = new Mobile();
		mobile.setProductDetails(100, "Samsung", 50000 , "Android", 3, 125 );
		mobile.showProductDetails();
	}

}

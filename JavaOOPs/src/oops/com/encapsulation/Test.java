package oops.com.encapsulation;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StudentData studentd= new StudentData();
        Student s= studentd.getStudentData(2);
        Student s1= new Student();
        s1.setAge(35);
        System.out.println(s.getId() + " " +s.getFirstname()+ " " +s1.getAge());
        
	}

}

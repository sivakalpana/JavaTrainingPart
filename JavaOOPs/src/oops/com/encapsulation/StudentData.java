package oops.com.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class StudentData {
 private static  List<Student> studentList=null; 
 static {
	 studentList = new ArrayList<Student>();
	 Student s= new Student();
	 s.setId(1);
	 s.setFirstname("kalyan");
	 s.setLastname("T");
	  
	 Student s1 =new Student();
	 s1.setId(2);
	 s1.setFirstname("Siva");
	 s1.setLastname("Kalpana");
	 
	 studentList.add(s);
	 studentList.add(s1);
	 
	 }
 public Student getStudentData(int id) {
	 Student student = getStudentDataById(id);
	 return student;
 }
 private Student getStudentDataById(int id)
 {
	 for(Student s:studentList)
	 {
		 if(s.getId()==id) 
		 {
			 return s;
			 
		 }
		 
	 }
	return null;
 }
}

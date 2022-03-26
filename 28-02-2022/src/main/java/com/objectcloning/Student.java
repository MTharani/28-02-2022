package com.objectcloning;

public class Student implements Cloneable
{
	// variable
    int rollno;
    String name;
    
    // Construct: to initialize the object
    public Student()
    {
       rollno=456329;
       name="divi";
       
	}
    
    //Method: To display the properties
    public void getInfo()
    {
    	System.out.println("Student RoLL Number:"+rollno);
    	System.out.println("Student Name:"+name);
    }
    
   // Main method: starting point of execution 
  //step 2: need to declare with throws CloneNotSupportedException
	public static void main(String[] args) throws  CloneNotSupportedException
	{
		// step 3: original object
		Student s1=new Student();
		s1.getInfo();
		System.out.println("************************************");
		//step 4: need to call clone() Method of an object class and type cast
		Student s2=(Student) s1.clone();
		s2.getInfo();
	}
}

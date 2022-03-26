package com.objectcloning;
//step 1: class should implements "cloneable" interface
public class Employee implements Cloneable
{  // variable
    int id;
    String name;
    double salary;
    
    // Construct: to initialize the object
    public Employee()
    {
       id=456;
       name="divi";
       salary=8931.02;
	}
    
    //Method: To display the properties
    public void getInfo()
    {
    	System.out.println("Employee ID:"+id);
    	System.out.println("Employee Name:"+name);
    	System.out.println("Employee Salary:"+salary);
    }
    
   // Main method: starting point of execution 
  //step 2: need to declare with throws CloneNotSupportedException
	public static void main(String[] args) throws CloneNotSupportedException
	{
		// step 3: original object
		Employee e1=new Employee();
		e1.getInfo();
		System.out.println("************************************");
		//step 4: need to call clone() Method of an object class and type cast
		Employee e2=(Employee) e1.clone();
		e2.getInfo();

	}

}

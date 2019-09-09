package CollectionConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
	
		//int a[] = new int[3];  // Static array
		
		ArrayList ar = new ArrayList(); //Dynamic array
		
		// 1- can contain duplicate values/elements
		//2-maintain insertion order
		// 3- synchronized
		// 4- allows random to fetch the elements bcs it stores the values on the basis of index
		
     ar.add(10);
     ar.add(20);
     ar.add(30);
     
     System.out.println(ar.size());
     
     ar.add(40);
     ar.add(50);
     ar.add(50);
     ar.add("Suraj");
		

     System.out.println(ar.size());
     System.out.println(ar.get(4));

     // print the array values from arraylist
     
     for(int i = 0; i<ar.size();i++)
     {
		System.out.println(ar.get(i));
	  
     }
     
     // non generic vs generic
     
     ArrayList<Integer> ar1 = new ArrayList<Integer>();
     ar1.add(80);
     //ar1.add("Suraj");
     
     System.out.println(ar1.get(0));
     

     ArrayList<String> ar2 = new ArrayList<String>();
     ar2.add("Suraj");
     System.out.println(ar2.get(0));
     
     ///
    // Employee array list
     
     Employee e1 = new Employee("Suraj",29,"QA");
     Employee e2 = new Employee("AAA",39,"DEV");
     Employee e3 = new Employee("BBBB",49,"BANK");
     
     ArrayList<Employee> emp = new ArrayList<Employee>();
     emp.add(e1);
     emp.add(e2);
     emp.add(e3);
     
   // iterator to traverse to values.
     
     Iterator<Employee> it=emp.iterator ();
     while(it.hasNext())
     {
    	 Employee emp1 = it.next();
    	 System.out.println(emp1.name);
    	 System.out.println(emp1.age);
    	 System.out.println(emp1.Dept);
     }
     
     // Add all method  addAll()
     
     ArrayList<String> ar3 = new ArrayList<String>();
     ar3.add("Selenium");
     ar3.add("QTP");
     ar3.add("JME");
     
     ArrayList<String> ar4 = new ArrayList<String>();
     ar4.add("cc");
     ar4.add("dd");
     ar4.add("ee");
     
     ar3.addAll(ar4);
    
     for(int i = 0; i<ar3.size();i++)
     {
    	 System.out.println(ar3.get(i));
     }
     
     System.out.println("***********");
     // Add all method  addAll()
     
     ArrayList<String> ar5 = new ArrayList<String>();
     ar5.add("Selenium11");
     ar5.add("QTP22");
     ar5.add("JME33");
     
     ArrayList<String> ar6 = new ArrayList<String>();
     ar6.add("Selenium11");
     ar6.add("dd55");
     ar6.add("ee");
     
     ar5.retainAll(ar6);
    
     for(int i = 0; i<ar5.size();i++)
     {
    	 System.out.println(ar5.get(i));
     }
     
	}
	}

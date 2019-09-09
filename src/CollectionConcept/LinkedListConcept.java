package CollectionConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
     LinkedList <String> ll = new LinkedList<String>();
     
     // add
     
     ll.add("test1");
     ll.add("test2");
     ll.add("test3");
     ll.add("test4");
     
     System.out.println("linkedlist----->"+ll);
     
    /* //addfirst
     ll.addFirst("suraj");
     //addlast
     ll.addLast("Auomation");
     
     System.out.println("aftr--->"+ll);
     
     //get
     
   System.out.println(ll.get(2));
   
   //set
   ll.set(3, "tom");
  System.out.println(ll.get(3));
  
  //removed
  
  ll.removeFirst();
  ll.removeLast();
  ll.remove(2);
  
  System.out.println("removed----->"+ll);
  System.out.println("***************");*/
  
  // how to print/ iterate using  for loop, advance loop , iterator,while loop
  
  for(int n=0; n<ll.size();n++)
  {
	  System.out.println(ll.get(n));
  }
  System.out.println("***************");	
// Advance loop
  
  for(String str :ll)
  {
	  System.out.println(str);
  }
  System.out.println("***************");

  //using iterator
            Iterator<String> it= ll.iterator();
            while(it.hasNext())
            {
            	String ll1 = it.next();
            	System.out.println(ll1);
            }
            System.out.println("********111******");
          //using while 
            
            int num =0;
            while(ll.size()>num)
            {
            	System.out.println(ll.get(num));
            	num++;
            }
  
  
  
  
  
  
  
  
  
	}

}

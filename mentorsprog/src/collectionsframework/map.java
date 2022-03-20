package collectionsframework;

import org.testng.annotations.Test;
import java.util.*;  
public class map {
	
	@Test(priority = 0)
	public void tc1()
	{
		
		 
		 
		  Map<Integer,String> map=new HashMap<Integer,String>();  
		  map.put(100,"Amit");  
		  map.put(101,"Vijay");  
		  map.put(102,"Rahul");  
		  //Elements can traverse in any order  
		  for(Map.Entry m:map.entrySet())
		  {  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		  
		  System.out.println(" ");
	 } 
	 @Test(priority = 1)
	 public void tc2()
	 {
		 //comparingByKey()
		 Map<Integer,String> map=new HashMap<Integer,String>();          
	      map.put(100,"Amit");    
	      map.put(101,"Vijay");    
	      map.put(102,"Rahul");   
	      //Returns a Set view of the mappings contained in this map        
	      map.entrySet()  
	      //Returns a sequential Stream with this collection as its source  
	      .stream()  
	      //Sorted according to the provided Comparator  
	      .sorted(Map.Entry.comparingByKey())  
	      //Performs an action for each element of this stream  
	      .forEach(System.out::println);  
	      
	      System.out.println(" ");
	 }
	 @Test(priority = 2)
	 public void tc3()
	 {
		 //comparingByKey() in Descending Order
		 Map<Integer,String> map=new HashMap<Integer,String>();          
	      map.put(100,"Amit");    
	      map.put(101,"Vijay");    
	      map.put(102,"Rahul");    
	      //Returns a Set view of the mappings contained in this map    
	      map.entrySet()  
	      //Returns a sequential Stream with this collection as its source  
	      .stream()  
	      //Sorted according to the provided Comparator  
	      .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))  
	      //Performs an action for each element of this stream  
	      .forEach(System.out::println);  
	      
	      System.out.println(" ");
	 }
	 @Test(priority = 3)
	 public void tc4()
	 {
		 //comparingByValue()
		 Map<Integer,String> map=new HashMap<Integer,String>();          
	      map.put(100,"Amit");    
	      map.put(101,"Vijay");    
	      map.put(102,"Rahul");    
	      //Returns a Set view of the mappings contained in this map    
	      map.entrySet()  
	      //Returns a sequential Stream with this collection as its source  
	      .stream()  
	      //Sorted according to the provided Comparator  
	      .sorted(Map.Entry.comparingByValue())  
	      //Performs an action for each element of this stream  
	      .forEach(System.out::println);  
	      
	      System.out.println(" ");
	 }
	 @Test(priority = 4)
	 public void tc5()
	 {
		//comparingByValue() in Descending Order
		 Map<Integer,String> map=new HashMap<Integer,String>();          
	      map.put(100,"Amit");    
	      map.put(101,"Vijay");    
	      map.put(102,"Rahul");    
	     //Returns a Set view of the mappings contained in this map    
	     map.entrySet()  
	     //Returns a sequential Stream with this collection as its source  
	     .stream()  
	     //Sorted according to the provided Comparator  
	     .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))  
	     //Performs an action for each element of this stream  
	     .forEach(System.out::println);  
	     
	     System.out.println(" ");
	 }
	 
	 		
		
}




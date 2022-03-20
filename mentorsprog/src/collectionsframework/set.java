package collectionsframework;

import java.util.*;

import org.testng.annotations.Test;

public class set {  
 
//public static void main(String args[]){  
	
	@Test(priority = 0)
	public void tc1()
	{
		//Creating HashSet and adding elements  
		HashSet<String> set=new HashSet<String>();  
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay");  
		
		//Traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext())
		{  
		System.out.println(itr.next());  
		}  
		System.out.println(" ");
	} 
	
	@Test(priority = 1)
	public void tc2()
	{
		LinkedHashSet<String> set=new LinkedHashSet<String>();  
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay");  
		
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext())
		{  
		System.out.println(itr.next());  
		}  
		System.out.println(" ");
	}
	
	
	@Test(priority = 2)
	public void tc3()
	{
		TreeSet<String> set=new TreeSet<String>();  
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay");  
		
		//traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext())
		{  
		System.out.println(itr.next());  
		}  
		System.out.println(" ");
		
	}  
	
}



	





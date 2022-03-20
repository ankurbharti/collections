package collectionsframework;


import java.awt.AWTException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.concurrent.TimeUnit;

//import org.testng.Assert;
import org.testng.annotations.Test;

public class list {

	
	
	//public static void main(String[] args) {  
	
	@Test(priority = 0)
	public void tc1()
	{
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
	    list.add("Ravi");//Adding object in arraylist  
	    list.add("Vijay");  
	    list.add("Ravi");  
	    list.add("Ajay");  

	    //Traversing list through Iterator  
	    Iterator itr=list.iterator();  
	    while(itr.hasNext())
	    {  
	    System.out.println(itr.next());  
	    }  
	    
	    System.out.println(" ");
	}  
	
	@Test(priority = 1)
	public void tc2()
	{
		LinkedList<String> al=new LinkedList<String>();  
		al.add("Ravi");  
		al.add("Vijay");  
		al.add("Ravi");  
		al.add("Ajay");  
		
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext())
		{  
		System.out.println(itr.next());  
		}  
		
		System.out.println(" ");
	}  
	
		
		@Test(priority = 2)
		public void tc3()
		
		{
			Stack<String> stack = new Stack<String>();  
			stack.push("Ayush");  
			stack.push("Garvit");  
			stack.push("Amit");  
			stack.push("Ashish"); 
			
			stack.push("Garima");  
			stack.pop(); 
			
			stack.remove(0);
			 
			
			Iterator<String> itr=stack.iterator();  
			while(itr.hasNext())
			{  
			System.out.println(itr.next());  
			}  
		}  
		
		
		
		
	
	
	} 



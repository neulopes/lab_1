package lab_1;

import java.util.HashMap;
import java.util.Set;

public class MyClass {
	
	
		Stack stack= new Stack();
		
		HashMap SystemCalls = new HashMap<>();
		
		public MyClass(Stack stack)
		{
		        this.stack = stack;
		       // HashMap SystemCalls = new HashMap<>();
		       
		        SystemCalls.put(100,new SystemCall("lab1"));
		        SystemCalls.put(1,new SystemCall("1"));
		        SystemCalls.put(20,new SystemCall("operating", "systems", "1"));
		        SystemCalls.put(50,new SystemCall("2", "4"));
		        SystemCalls.put(4,new SystemCall("l", "a", "b","№","1"));
		}
		
		public void ispolnenie_Call(int id)	{	
			
		    if (!SystemCalls.containsKey(id))
		    {
		    	System.out.print("Вызванный номер " + id + " не существует\n");
		        return;
		    }	    
		    
		    for (int i=((SystemCall) SystemCalls.get(id)).getArgs().size()-1; i>=0; i--)
		    {	    	
		    	if (!stack.remove().equals(((SystemCall) SystemCalls.get(id)).getArgs().get(i))) 
		        {	    		
		    		System.out.println("Аргументы не совпадают" + " id =" + id);
		            return;
		        }
		    }		    
		
		    System.out.println(((SystemCall) SystemCalls.get(id)).messedg()+ ": id = " + id + ", аргументы =" + ((SystemCall) SystemCalls.get(id)).getArgs().toString());	    
		}
		
		public  void printf_Calls()	{		
			
				Set<Integer> keys = SystemCalls.keySet();
				
				for (Integer key : keys) {
					System.out.println(key + " " + ((SystemCall) SystemCalls.get(key)).getArgs().toString());
			}		
	}
}

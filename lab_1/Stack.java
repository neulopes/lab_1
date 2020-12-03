package lab_1;

import java.util.ArrayList;
import java.util.HashMap;

public class Stack {
	
	ArrayList<String> stack=new ArrayList<>();
	public HashMap<Integer, SystemCall> SystemCalls;
	
	public void add(String element) 
	{
        stack.add(element);
    }
	
	public String remove() {
		String element=stack.get(stack.size()-1);
		stack.remove(stack.size()-1);
		return element;
    }  


}

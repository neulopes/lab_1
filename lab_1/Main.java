package lab_1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack stack =new Stack();
	    MyClass myclass=new MyClass(stack);
	    
	    myclass.ispolnenie_Call(5);
	    
	    stack.add("2");
	    stack.add("4");	     	     
	    myclass.ispolnenie_Call(50);
	    
	    stack.add("2");
	    stack.add("4");
	    myclass.ispolnenie_Call(4);
	    
	    stack.add("1");	    
	    myclass.ispolnenie_Call(1);
	    
	    stack.add("operating");
	    stack.add("systems");
	    stack.add("1");
	    myclass.ispolnenie_Call(20);
	    
	    myclass.printf_Calls();  
	}
}

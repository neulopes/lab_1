package lab_1;

import java.util.Arrays;
import java.util.List;

public class SystemCall {
	
	private List<String> arguments;
    public SystemCall(String... args) 
    {
        arguments = Arrays.asList(args);
    }
    
    public List<String> getArgs()
    {
        return arguments;
    }

    public String messedg()
    {
    	return "����� ��������";
    }	    	    


}

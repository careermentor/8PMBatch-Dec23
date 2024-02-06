package pkg1;

public class CallInterfaceDemo implements InterfaceDemo
{

	
	public void meth3() 
	{
		
	System.out.println("this is interface method implemented");	
		
	}

	public static void main(String[] args) {
		
		CallInterfaceDemo abc = new CallInterfaceDemo();
		abc.meth3();
		
	}
	
}

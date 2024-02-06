package pkg1;

public class CallAbsClass extends AbsClassDemo
{

	
	public void meth2() 
	{
	
		System.out.println("this is abstract method implemented - here i have my credential");
		
	}

	public static void main(String[] args) {
		
		CallAbsClass abs = new CallAbsClass();
		abs.meth1();
		abs.meth2();
	}
	
}

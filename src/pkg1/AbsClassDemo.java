package pkg1;

public abstract class AbsClassDemo    //concrete class
{
	
	

	public void meth1()    //concrete method
	{
		System.out.println("this is concrete method");
		
		final int a = 30;
		//a=40;
		
	}
	
	public abstract void meth2();
	
	
	public static void main(String[] args) 
	{
	
		//AbsClassDemo abc = new AbsClassDemo();
		//abc.meth1();
		
	}
	
}

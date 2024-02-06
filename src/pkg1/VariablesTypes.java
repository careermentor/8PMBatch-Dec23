package pkg1;

public class VariablesTypes 
{

	int x = 200;  //global variable
	
	
	
	public void meth1()
	{
		final int x = 100;   //local variable  // constant
		//x=500;
		System.out.println(x);  //100  //500
	}
	
	public void meth2()
	{
		System.out.println(x);  //200
	}
	
	
	public static void main(String[] args)   //syntax
	{
	
		VariablesTypes vt = new VariablesTypes();  //syntax
		
		vt.meth1();
		vt.meth2();
		
	}
	
}

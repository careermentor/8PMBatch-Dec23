package pkg1;

public class LearnConst 
{

	int x = 20;
	float y = 20.5f;
	
	public void printVal()
	{
		System.out.println("this is a method");
	}
	
	public static void main(String[] args) 
	{
	
		LearnConst lc = new LearnConst();
		
		LearnConst lc1 = new LearnConst(10,20);
		
		LearnConst lc2 = new LearnConst(10,20.5f);
		
		lc.printVal();
		
		
	}
	
	public LearnConst()
	{
		System.out.println("This is a constructor");
		
	}
	
	public LearnConst(int a, int b)
	{
		
		int c = a+b;
		System.out.println(c);
		
	}
	
	public LearnConst(int a, float b)
	{
		
		float c = a+b;
		System.out.println(c);
		
	}
	
}

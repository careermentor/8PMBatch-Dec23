package pkg1;

public class CalProgram 
{

	public CalProgram(int a, int b)
	{
		System.out.println("this is a conctructor");
		int c = a*b;
		System.out.println(c);
		
		
	}
	
	
	public void add()  //method without a parameter/argument/input
	{
		int a = 20;
		int b = 30;
		int c = a+b;
		
		
		
		System.out.println("addition of 2 numbers: ");
		System.out.println(c);
		//return c;
		
		//System.out.println("addition of 2 numbers: " + c);
		
	}
	
	public int sum(int a, int b)  //method with a parameter/argument/input
	{
		int c = a+b;
		System.out.println("sum of 2 numbers: " + c);
		
		return c;
	}
	
	
	public float sum(int a, float b)  //method with a parameter/argument/input
	{
		float c = a+b;
		System.out.println("sum of 2 numbers: " + c);
		
		return c;
	}
	
	
	//20,30,40
	//x=20+30
	//x+40
	
	public static void main(String[] args) 
	{
	
		CalProgram d = new CalProgram(10,20);  //constructor will be called automatically
		d.add();
		d.sum(30, 40);
		d.sum(50, 60);
		
		int x = d.sum(20, 30);
		
		//int y = d.add();
		
		d.sum(x, 40);
		
		
		
		
	}
	
}



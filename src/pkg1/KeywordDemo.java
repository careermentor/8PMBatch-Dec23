package pkg1;

public class KeywordDemo extends CallKeywordDemo
{
	
	int a = 30;  //global variable

	public void printVar()
	{
		int a = 20;  //local variable
		System.out.println(a);  //20
		System.out.println(this.a);  //30
		System.out.println(super.a);  //200
	}
	
	
	public static void callstaticmeth()
	{
		int a = 100;
		System.out.println(a);
	}
	
	public static void main(String[] args)
	{
	
		KeywordDemo.callstaticmeth();
		
		KeywordDemo kd = new KeywordDemo();
		kd.printVar();
		
	}
	
}

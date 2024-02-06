package pkg1;

public class QA2 extends QA1
{

	
	public void callSUm()
	{
		super.sum(30, 40);
	}
	
	public void sum(int a, int b)
	{
		
		
		int c = a*a+b*b;
		System.out.println("sum of a&b: " + c);
	}
	
	public void sub(int a, int b)
	{
		int c = a-b;
		System.out.println("substraction of a&b: " + c);
	}
	
	public static void main(String[] args) 
	{
	
		QA2 q2 = new QA2();
		q2.sum(30, 40);  //a*a+b*b
		q2.callSUm();
		
		q2.sub(40, 50);
		q2.QA1IM();
		
		
		
	}

	
	public void QA1IM() {
		System.out.println("this is method of QA1 interface");
		
	}
	
}

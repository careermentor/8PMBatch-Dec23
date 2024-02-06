package pkg1;

public class QA4 extends QA2 implements QA3I
{

	
	public void div(int a, int b)
	{
		int c = a/b;
		System.out.println("division of a&b: " + c);
	}
	
	public static void main(String[] args) 
	{
	
		QA4 q4 = new QA4();
		q4.sum(30, 40);
		q4.sub(40, 50);
		q4.div(20, 10);
		
		
	}

	
	public void QA3IM() {
		System.out.println("this is QA3I interface method");
		
	}
	
}

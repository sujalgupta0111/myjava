import java.util.*;

class A
{
	static int a =30;
	int b =30;
	void show()
	{
		System.out.println("Hello A");
	}
	
	static void display()
	{
		System.out.println("Hello A");
	}
}
class B extends A
{
	static int a =40;
	int b =40;
	void show()
	{
		System.out.println("Hello B");
	}
	static void display()
	{
		System.out.println("Hello B");
	}
}
class C extends B
{
	static int a =50;
	int b =50;
	void show()
	{
	   System.out.println("Hello C n");
	}
	static void display()
	{
		System.out.println("Hello C");
	}
}
public class C1 {
	
	
		public static void main(String ...strings )
		{
			B a = new C();
			a.show();
			a.display();
			System.out.println(a.a);
			System.out.println(a.b);
              
            
         }
			
		}

		



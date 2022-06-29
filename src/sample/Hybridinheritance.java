package sample;

class Parent
{
	String name;
	Parent(String a)
	{
		System.out.println(a);
	}
}
class Base1 extends Parent
{
	void method()
	{
		System.out.println("java");
	}
 Base1()
  {
	super("Example");
	System.out.println("first example");
  }
}
class Base2 extends Base1
{
	void method1()
	{
		System.out.println("python");
	}
}
public class Hybridinheritance
{
	public static void main(String[] args)
	{
		Base2 base2=new Base2();
	//	base2.method1();
	//	base2.method();
	}
}

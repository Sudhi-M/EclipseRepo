package sample;

class Base
{
	Base()
	{
		System.out.println("Base class of child class");
	}
}
class Child extends Base
{
	Child()
	{
		System.out.println("This is the first child class");
	}
}
class Child2 extends Base
{
	Child2()
	{
		System.out.println("This is second child class");
	}
}
public class Hierchical {

	public static void main(String[] args) 
	{
		Child child=new Child();
		Child2 child2=new Child2();
	}
}

package sample;
class Sample1
{
   static void 	sample1()
	{
		System.out.println("Parent class constructor");
	}
}
class Abcd extends Sample1
{
	static void abcd(int a)
	{
		System.out.println("Child class constructor  "+a);
	}
}

public class Test1 {

	public static void main(String[] args) {
	Sample1.sample1();
	Abcd.abcd(5);
     
	}

}

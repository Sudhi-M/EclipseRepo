package sample;

public class Constructor
{
	Constructor()
	{
		System.out.println("user defined constructor");
		System.out.println("default constructor");
	}
	
	Constructor(String name, int age)
	{
		System.out.println("name is :" + name);
		System.out.println("age is :" + age);
	}

	public static void main(String[] args) 
	{
		Constructor con=new Constructor();
		Constructor con1=new Constructor("God",20);
	}

}

package sample;
class Demo
{
	Demo(String name,int id)
	{
		System.out.println(name);
		System.out.println(id);
	}
}
class Sample extends Demo
{
	Sample()
	{
		super("abc",101);
		System.out.println("Record of a student");
	}
}
class Project extends Sample
{
	Project()
	{
		//System.out.println("hello world");
	}
}
public class Multilevel 
{
	public static void main(String[] args)
	{
		Project project=new Project();
	}

}

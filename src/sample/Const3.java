package sample;

class Student 
{
	String name;
	int id;
	Student(String a,int b)
	{
		this.name=a;
		this.id=b;
		System.out.println("name is :" + a);
		System.out.println("id is :" + b);
	}
}
class Student1 extends Student
{
	Student1()
	{
		super("Lavanya",101);
	}
	
}
public class Const3
{
	public static void main(String[] args) 
	{
		Student1 std=new Student1();
	}
}

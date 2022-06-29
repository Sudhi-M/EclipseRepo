package sample;

public class Const2 
{
		String name;
		int roll;
		String school_name;
		
		Const2(String a,int b,String c)
		{
			name=a;
			roll=b;
			school_name=c;
		}
	
	public static void main(String[] args)
	{
		Const2 con=new Const2("Lavanya",12,"ssvm");
		System.out.println(con.name);
		System.out.println(con.roll);
		System.out.println(con.school_name);
	}
}

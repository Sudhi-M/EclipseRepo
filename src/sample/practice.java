package sample;
class Cnstrctr
{
  Cnstrctr()
  {
    System.out.println("this is default constructor"); 
  }
}
class File extends Cnstrctr
{
  File(String name)
  {
    System.out.println("name is :" + name);
  }
}
public class practice
{
  public static void main(String[] args)
  {
    File file=new File("abcd");
  }
}
   

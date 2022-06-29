class Sample
{
  Sample()
  {
    System.out.println("this is default constructor"); 
  }
}
class File extends Sample
{
  File(String name)
  {
    System.out.println("name is :" + name);
  }
}
public class Constrctr
{
  public static void main(String[] args)
  {
    File file=new File("abcd");
  }
}
   

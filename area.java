class area 
{
    int a;
  char b;
  void show ()
  {
    System.out.println(" show area");

  }
}
class practice 
{

    public static void main ( String arg[])
    {
area a1 =new area ();
area a2=new area();
a1.a=20;
a1.b='v';
a2.a=50;
a2.b='h';
System.out.println( a1.a +","+a1.b);
System.out.println(a2.a+a2.b);

a1.show();

    }
}
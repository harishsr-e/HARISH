abstract class csvtu {
    abstract public void computerlab30();
    abstract public void playground();
public void exam ()
{
    System.out.println("your exam is from 4th july ");
}


}
abstract class rungta extends csvtu{
    public void computerlab30()
    {
        System.out.println("ibm computer");
    }
    public void playground(){
        System.out.println("volleboll ground");
    }
    public void canteen ()
    {
        System.out.println("canteen available");
    }

}
 class shankra extends csvtu{
    public void playground()
    {
        System.out.println("cricket ground");
    }
    public void computerlab30()
    {
        System.out.println("asus ");
    }
    public static void main(String[] args) {
        
       
        shankra s1=new shankra();
        s1.playground();
        s1.computerlab30();
    }
}



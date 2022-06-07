package Graphics;
public class Rectangle implements Area
{
    int l,b;
   public Rectangle(int l,int b)
   {
       this.l=l;
       this.b=b;

   }
    public void area()
    {
        int area;
        area=l*b;
        System.out.println("AREA of Rectangle="+ area);

    }
}
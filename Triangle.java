package Graphics;
 public class Triangle implements Area

    {

        int b,h;
        public Triangle(int b,int h)
        {
            this.b=b;
            this.h=h;
        }
  
     public void area()
    {
        float area;
        area=(float) (0.5*b*h);
        System.out.println("AREA of Triangle="+ area);

    }
    }
    
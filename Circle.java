package Graphics;
public class Circle implements Area

    {
        int r;
        public Circle(int r)
        {
            this.r=r;
        }
    
     public void area()
    {
        double area;
        area=3.14*r*r;
        System.out.println("AREA of Circle="+ area);

    }

    
    }



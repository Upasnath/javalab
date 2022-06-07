
import Graphics.Circle;
import Graphics.Rectangle;
import Graphics.Square;
import Graphics.Triangle;

public class Shape{
    public static void main(String[] args){
        Graphics.Area r=new Rectangle(8,9);
        Graphics.Area T=new Triangle(5,5);
        Graphics.Area S=new Square(5);
        Graphics.Area C=new Circle(6);
        r.area();
        T.area();
        S.area();
        C.area();

    }
}
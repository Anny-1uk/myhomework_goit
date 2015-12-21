package square;

public class FigureSquare {
   public static float circleSquare (float radius){
       float pi = 3.14f;
       return (radius*radius)* pi;
   }
    public static float quadrateSquare (float side){
        return side*side;
    }
    public static float triangleSquare (float side, float height){
        return (height*side)/2;
    }
}

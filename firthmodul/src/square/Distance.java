package square;

public class Distance {
    public static double distance (double ax, double ay, double bx, double by){
        return Math.sqrt((bx - ax) *(bx - ax)) +((by - ay) *(by - ay));
    }
}

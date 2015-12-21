package square;

public class Temperature {
    public static float temperatureC ( float temperatureF){
        return (temperatureF - 32)*5/9;
    }
    public static float temperatureF ( float temperatureC){
        return (temperatureC*5/9) + 32;}
}

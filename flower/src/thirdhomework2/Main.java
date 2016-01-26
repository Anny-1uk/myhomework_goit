package thirdhomework2;

public class Main {
    public static void main(String[] args) {

        Rose rose1 = new Rose("red", 20);
        Rose rose2 = new Rose("red",15);
        Rose rose3 = new Rose("white",20);


        Rose [] roses = {rose1, rose2, rose3};

        Rosebush rosebush = new Rosebush(roses);

        Astra astra = new Astra("white", 20);
        Tulip tulip1 = new Tulip("white", 15);
        Tulip tulip2 = new Tulip("red",20);
        Romashka romashka = new Romashka("white",15);

        Flowers [] flowers= {astra, rose3,romashka, tulip1, tulip2};

        Bouquet bouquet = new Bouquet(flowers);
    }
}

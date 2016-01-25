package thirdhomework3;

public class Main {
    public static void main(String[] args){
        Gitara gitara = new Gitara("yellow", 2);
        Piano piano = new Piano("black", 50);
        Tube tube = new Tube("silver", 1);
        MusicInstrument [] instruments = {gitara, piano, tube};

        MusicShop musicShop = new MusicShop(instruments);
    }
}

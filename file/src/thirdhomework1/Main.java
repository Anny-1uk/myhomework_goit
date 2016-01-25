package thirdhomework1;

public class Main {
    public static void main(String[] args) {
        Audio song = new Audio("Be happy", 345);
        Video movie = new Video("Star wars", 1346524);
        Picture image = new Picture("Mona Liza", 1024);

        File[] files = {song, movie, image};

        Directory directory = new Directory(files);
    }
}

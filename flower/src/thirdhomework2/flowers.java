package thirdhomework2;

public abstract class Flowers {
    private String color;
    private int length;

    public Flowers(String color, int length){
        this.color = color;
        this.length = length;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}

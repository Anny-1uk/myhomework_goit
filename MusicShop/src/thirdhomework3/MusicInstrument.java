package thirdhomework3;
 public abstract class MusicInstrument{
  private String color;
  private int weight;

     public MusicInstrument(String color,int weight){
         this.color = color;
         this.weight = weight;
     }

     public String getColor() {
         return color;
     }

     public int getWeight() {
         return weight;
     }
 }

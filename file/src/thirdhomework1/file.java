package thirdhomework1;
 public abstract class File {
  private String name;
  private int size;

  public File(String name, int size){
   this.name = name;
   this.size = size;
   }

  public int getSize() {
   return size;
  }

  public String getName() {
   return name;
  }
 }

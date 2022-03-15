package week2;

public class AksiLampu {
  public static void main(String[] args) {
    Lampu lampu = new Lampu();  

    lampu.nyalakanLampu();  
    System.out.println("Apakah lampu menyala? "+lampu.nyala);    

    lampu.matikanLampu();  
    System.out.println("Apakah lampu menyala? "+lampu.nyala);
  }
}
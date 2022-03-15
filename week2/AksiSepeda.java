package week2;

public class AksiSepeda {
    public static void main(String[] args) {
        Sepeda sepedaJamping = new Sepeda(2, "x", "y");
        System.out.println("Jumlah gear "+sepedaJamping.gear);
        sepedaJamping.ngerem();
    }
}

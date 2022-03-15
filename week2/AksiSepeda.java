package week2;

class Sepeda {
    int gear = 5, jumlahRoda;
    String jenis, merk;

    public Sepeda(int jumlahRoda, String jenis, String merk) {
        this.jumlahRoda = jumlahRoda;
        this.jenis = jenis;
        this.merk = merk;

        System.out.println("Sepeda " + merk + " bermerk " + jenis + " memiliki jumlah roda " + jumlahRoda);
    }

    void ngerem() {
        System.out.println("Sepeda direm");
    }
}

public class AksiSepeda {
    public static void main(String[] args) {
        Sepeda sepedaJamping = new Sepeda(2, "x", "y");
        System.out.println("Jumlah gear "+sepedaJamping.gear);
        sepedaJamping.ngerem();
    }
}

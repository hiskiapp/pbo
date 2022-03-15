package week2;

public class Sepeda {
  int gear = 5;

  Sepeda(int jumlahRoda, String jenis, String merk) {
    System.out.println("Sepeda " + jenis + " bermerk " + merk + " memiliki jumlah roda " + jumlahRoda);
  }

  void ngerem() {
    System.out.println("Sepeda direm");
  }
}
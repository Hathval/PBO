public class Aritmatika {

  public void hitungPenjumlahan(int a, int b) {
    int nilai = a + b;
    System.out.println("nilai penjumlahan adalah : " + nilai);
  }

  public static void hitungPerkalian(int a, int b) {
    int nilai = a * b;
    System.out.println("nilai perkalian adalah : " + nilai);
  }

  public static void hitungPengurangan(int a, int b) {
    int nilai = a - b;
    System.out.println("nilai pengurangan adalah : " + nilai);
  }

  public void hitungPembagian(String a, String b) {
    double nilai = Double.parseDouble(a) / Double.parseDouble(b);
    System.out.println("nilai pembagian adalah : " + String.format("%.2f", nilai));
  }
}

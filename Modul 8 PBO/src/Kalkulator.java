public class Kalkulator {

    public static void penjumlahan(int a, int b) {
        System.out.println("Hasil penjumlahan = " + (a + b));
    }

    public static void pengurangan(int a, int b) {
        System.out.println("Hasil pengurangan = " + (a - b));
    }

    public void perkalian(int a, int b) {
        System.out.println("Hasil perkalian = " + (a * b));
    }

    public void pembagian(int a, int b) {
        System.out.println("Hasil pembagian = " + (a / b));
    }

    public void sederhanakan(int pembilang, int penyebut) {
        int temp;
        int a = pembilang;
        int b = penyebut;
        while (b != 0) {
            temp = a % b;
            a = b;
            b = temp;
        }
        pembilang = pembilang / a;
        penyebut = penyebut / a;
        System.out.println("Hasil penyederhanaan = " + pembilang + "/" + penyebut);
    }
    
}
import java.util.Scanner;

public class KalkulatorMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Kalkulator hitung = new Kalkulator();
        int a = 0;
        int b = 0;

        System.out.print("Pilih operasi :" + "\n" + "1. Penjumlahan"
                + "\n" + "2. Pengurangan"
                + "\n" + "3. Perkalian"
                + "\n" + "4. Pembagian"
                + "\n" + "5. Penyederhanaan" 
                + "\n" + "Input : ");

        int n = in.nextInt();

        switch (n) {
            case 1:
                System.out.println("Masukkan bilangan pertama : ");
                a = in.nextInt();
                System.out.println("Masukkan bilangan kedua : ");
                b = in.nextInt();
                Kalkulator.penjumlahan(a, b);
                break;
            case 2:
                System.out.println("Masukkan bilangan pertama : ");
                a = in.nextInt();
                System.out.println("Masukkan bilangan kedua : ");
                b = in.nextInt();
                Kalkulator.pengurangan(a, b);
                break;
            case 3:
                System.out.println("Masukkan bilangan pertama : ");
                a = in.nextInt();
                System.out.println("Masukkan bilangan kedua : ");
                b = in.nextInt();
                hitung.perkalian(a, b);
                break;
            case 4:
                System.out.println("Masukkan bilangan pertama : ");
                a = in.nextInt();
                System.out.println("Masukkan bilangan kedua : ");
                b = in.nextInt();
                hitung.pembagian(a, b);
                break;
            case 5:
                System.out.println("Masukkan bilangan pertama : ");
                a = in.nextInt();
                System.out.println("Masukkan bilangan kedua : ");
                b = in.nextInt();
                hitung.sederhanakan(a, b);
                break;
        }
        in.close();
    }

}

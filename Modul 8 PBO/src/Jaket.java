import java.text.NumberFormat;
import java.util.Scanner;

public class Jaket {
    public final int jaketA = 100_000;
    public final int jaketB = 125_000;
    public final int jaketC = 175_000;
    private int sum = 0;

    public void katalog() {
        Scanner in = new Scanner(System.in);

        System.out.print("Katalog jaket di toko kami : " + "\n"
                + "1. Jaket A : Rp. 100.000" + "\n"
                + "2. Jaket B : Rp. 125.000" + "\n"
                + "3. Jaket C : Rp. 175.000" + "\n"
                + "Jaket mana yang ingin anda beli : ");
        int tipe = in.nextInt();
        System.out.println("Masukkan jumlah yang diinginkan : ");
        int jumlah = in.nextInt();
        this.sum += belanja(tipe, jumlah);

        System.out.print("Apakah anda ingin melanjutkan belanja : "
                + "\n" + "1. Ya"
                + "\n" + "2. Tidak" + "\n");
        int pilihan = in.nextInt();
        if (pilihan == 1)
            katalog();

        in.close();
    }

    public int belanja(int tipe, int jumlah) {
        int totalHarga = 0;
        switch (tipe) {
            case 1:
                if (jumlah >= 100) {
                    totalHarga = 95_000 * jumlah;
                    break;
                }
                totalHarga = jaketA * jumlah;
                break;
            case 2:
                if (jumlah >= 100) {
                    totalHarga = 120_000 * jumlah;
                    break;
                }
                totalHarga = jaketB * jumlah;
                break;
            case 3:
                if (jumlah >= 100) {
                    totalHarga = 160_000 * jumlah;
                    break;
                }
                totalHarga = jaketC * jumlah;
                break;
        }
        return totalHarga;
    }

    public void print() {
        NumberFormat format = NumberFormat.getInstance();
        format.setGroupingUsed(true);
        String newSum = format.format(sum);
        System.out.println("Total perbelanjaan anda adalah : " + "\nRp. " + newSum);
    }

}

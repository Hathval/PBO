import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int end = 1;

        Scanner in = new Scanner(System.in);
        System.out.print("Nama Karyawan : ");
        String nama = in.nextLine();
        System.out.print("Gaji Karyawan : ");
        int gaji = in.nextInt();
        in.nextLine();
        Karyawan kar = new Karyawan(nama, gaji);

        while (end != 0) {
            System.out.println("==============================");
            System.out.print("Masukkan data invoice");
            System.out.print("\n" + "Nama produk : ");
            String namaProduk = in.nextLine();
            System.out.print("Jumlah produk : ");
            int qty = in.nextInt();
            System.out.print("Harga produk : ");
            int harga = in.nextInt();

            Invoice invc = new Invoice(namaProduk, qty, harga);
            kar.addInvoice(invc);

            System.out.print("\n" + "Masih ingin menambahkan invoice? : " +
                    "\n" + "1. Ya" +
                    "\n" + "0. Exit" +
                    "\n" + "Input : ");
            end = in.nextInt();
            in.nextLine();
        }
        System.out.println("\n"+"==============================");
        
        System.out.println("Gaji bersih karyawan " + nama + "adalah sebesar Rp. "
        + kar.getTotalPembayaran());
        
        in.close();

    }
}

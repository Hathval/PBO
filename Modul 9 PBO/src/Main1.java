import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ext = 1;
        System.out.println("Nama Tumbuhan : ");
        String nama = in.nextLine();

        Tumbuhan tumb = new Tumbuhan(nama);
        while (ext != 0) {
            System.out.print("Pilih Command : " +
                    "\n" + "1. Makan" +
                    "\n" + "2. Berjalan" +
                    "\n" + "3. Bersuara" +
                    "\n" + "4. Tampilkan Nama" +
                    "\n" + "0. Exit" +
                    "\n" + "Input : ");
            ext = in.nextInt();
            switch (ext){
                case 1:
                    tumb.makan();
                    break;
                case 2:
                    tumb.berjalan();
                    break;
                case 3:
                    tumb.bersuara();
                    break;
                case 4:
                    tumb.tampilkanNama();
                    break;
            }

        }

        in.close();

    }
}

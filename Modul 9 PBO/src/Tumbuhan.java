public class Tumbuhan implements MakhlukHidup, Identitas {

    private String nama;
    private int umur;

    public Tumbuhan(String nama){
        this.nama = nama;
    }
    
    @Override
    public void makan() {
        System.out.println("Tumbuhan melakukan fotosintesis");
    }

    @Override
    public void berjalan() {
        System.out.println("Tumbuhan tidak dapat berjalan");
    }

    @Override
    public void bersuara() {
        System.out.println("Tumbuhan tidak bersuara");
    }

    @Override
    public void tampilkanNama() {
        System.out.println("Nama tumbuhan: " + this.nama);
    }

    @Override
    public void tampilkanUmur() {
        System.out.println("Umur tumbuhan: " + this.umur);
    }
}
public class Invoice implements Pembayaran {
    String namaProduk;
    int kuantitas;
    int hargaPerItem; 
    
    public Invoice(String namaProduk, int kuantitas, int hargaPerItem) {
        this.namaProduk = namaProduk;
        this.kuantitas = kuantitas;
        this.hargaPerItem = hargaPerItem;
    }

    public int getTotalPembayaran() {
        return kuantitas * hargaPerItem;
    }
}

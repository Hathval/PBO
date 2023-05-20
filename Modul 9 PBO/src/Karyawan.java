public class Karyawan implements Pembayaran {
    String nama;
    int gaji;
    Invoice[] invoices={};  

    public Karyawan(String nama, int gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }
    
    public void addInvoice(Invoice invoice) {
        Invoice[] tmp = new Invoice[invoices.length + 1];
        System.arraycopy(invoices, 0, tmp, 0, invoices.length);
        tmp[tmp.length - 1] = invoice; 
        invoices = tmp;
    }
    
    public int getTotalPembayaran() {
        int total = 0;
        for (Invoice inv : invoices) {
            total += inv.getTotalPembayaran(); 
        }
        total = gaji-total;
        return total; 
    }
}  
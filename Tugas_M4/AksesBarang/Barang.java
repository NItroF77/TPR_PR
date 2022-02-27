package AksesBarang;

public class Barang {
    private String kode_barang; //enkapsulasi
    private String nama_barang; //enkapsulasi
    private int stok;           //enkapsulasi
    public Barang(String kode, String nama, int stk) {
    this.kode_barang = kode;
    this.nama_barang = nama;
    this.stok = stk;
    }
    //menambah stok barang 
    public void AddStock(int stokBarang){
    this.stok += stokBarang;
    }
    //mengambil data yang telah dienkapsulasi
    public String getKode_barang() {
        return kode_barang;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public int getStok() {
        return stok;
    }
    
}

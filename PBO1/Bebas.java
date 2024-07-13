public class Produk {

    private int id;
    private String nama;
    private String kategori;
    private int stok;
    private double harga;

    // Constructor
    public Produk() {
        System.out.println("Object Produk telah diciptakan, constructor berjalan");
    }

    // Constructor dengan parameter
    public Produk(int id, String nama, String kategori, int stok, double harga) {
        this.id = id;
        this.nama = nama;
        this.kategori = kategori;
        this.stok = stok;
        this.harga = harga;
        System.out.println("Object Produk dengan parameter telah diciptakan, constructor berjalan");
    }

    // Getters
    public int getId() {
        return this.id;
    }

    public String getNama() {
        return this.nama;
    }

    public String getKategori() {
        return this.kategori;
    }

    public int getStok() {
        return this.stok;
    }

    public double getHarga() {
        return this.harga;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Custom Methods
    public void tampilkanInfo() {
        System.out.println("ID: " + this.id);
        System.out.println("Nama: " + this.nama);
        System.out.println("Kategori: " + this.kategori);
        System.out.println("Stok: " + this.stok);
        System.out.println("Harga: " + this.harga);
    }

    public void tambahStok(int jumlah) {
        this.stok += jumlah;
        System.out.println("Stok bertambah, stok sekarang: " + this.stok);
    }

    public void kurangiStok(int jumlah) {
        if (this.stok >= jumlah) {
            this.stok -= jumlah;
            System.out.println("Stok berkurang, stok sekarang: " + this.stok);
        } else {
            System.out.println("Stok tidak cukup untuk dikurangi.");
        }
    }

    // Method to increase the price
    public void naikkanHarga() {
        this.harga += 5000; // default increase by 5000
        System.out.println("Harga produk dinaikkan sebesar 5000, harga sekarang: " + this.harga);
    }

    // Overloaded method to increase the price by a specified amount
    public void naikkanHarga(double kenaikan) {
        this.harga += kenaikan;
        System.out.println("Harga produk dinaikkan sebesar " + kenaikan + ", harga sekarang: " + this.harga);
    }
}
public class Buku {

    private int id;
    private String judul;
    private String penulis;
    private int jumlahHalaman;
    private double harga;

    // Constructor
    public Buku() {
        System.out.println("Object Buku telah diciptakan, constructor berjalan");
    }

    // Getters
    public int getId() {
        return this.id;
    }

    public String getJudul() {
        return this.judul;
    }

    public String getPenulis() {
        return this.penulis;
    }

    public int getJumlahHalaman() {
        return this.jumlahHalaman;
    }

    public double getHarga() {
        return this.harga;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Custom Methods
    public void infoBuku() {
        System.out.println("Ini method untuk informasi buku");
    }

    public void pinjamBuku() {
        System.out.println("Ini method untuk meminjam buku");
    }

    public void kembalikanBuku() {
        System.out.println("Ini method untuk mengembalikan buku");
    }

    // Method to increase the price
    public void naikkanHarga() {
        this.harga += 1000; // default increase by 1000
        System.out.println("Harga buku dinaikkan sebesar 1000, harga sekarang: " + this.harga);
    }

    // Overloaded method to increase the price by a specified amount
    public void naikkanHarga(double kenaikan) {
        this.harga += kenaikan;
        System.out.println("Harga buku dinaikkan sebesar " + kenaikan + ", harga sekarang: " + this.harga);
    }
}
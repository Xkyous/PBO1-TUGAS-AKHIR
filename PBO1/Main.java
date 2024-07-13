public class Main {
   public static void main(String[] args) {
       // Membuat objek Pengguna
       Pengguna pengguna = new Pengguna();

       // Membuat objek Buku
       Buku buku = new Buku();
       buku.setId(1);
       buku.setJudul("Belajar Java");
       buku.setPenulis("John Doe");
       buku.setJumlahHalaman(200);
       buku.setHarga(100000);
       buku.infoBuku();
       buku.naikkanHarga(); // Menggunakan method naikkanHarga()
       buku.naikkanHarga(5000); // Menggunakan overloaded method naikkanHarga(double kenaikan)

       // Membuat objek Komik
       Komik komik = new Komik();
       komik.setId(2);
       komik.setJudul("Naruto");
       komik.setPenulis("Masashi Kishimoto");
       komik.setJumlahHalaman(180);
       komik.setHarga(50000);
       komik.setVolume(1);
       komik.infoBuku();
       komik.naikkanHarga(); // Menggunakan method naikkanHarga() yang di-overridden pada objek Komik
   }
}

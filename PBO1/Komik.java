public class Komik extends Buku {
    private int volume;

    // Constructor
    public Komik() {
        System.out.println("Object Komik telah diciptakan, constructor berjalan");
    }

    // Getter for volume
    public int getVolume() {
        return this.volume;
    }

    // Setter for volume
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void infoBuku() {
        super.infoBuku();
        System.out.println("Volume: " + this.volume);
    }

    // Overriding the naikkanHarga method
    @Override
    public void naikkanHarga() {
        double kenaikan = 2000; // Custom increase for Komik
        setHarga(getHarga() + kenaikan);
        System.out.println("Harga komik dinaikkan sebesar " + kenaikan + ", harga sekarang: " + getHarga());
    }
}

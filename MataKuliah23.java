
public class MataKuliah23 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah23() {
    }

    public MataKuliah23(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilkanInformasi() {
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("Jumlah SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS telah diubah menjadi: " + sks);
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jumlah jam setelah penambahan: " + jumlahJam);
    }

    void kurangiJam(int jam) {
        if (jumlahJam - jam >= 0) {
            jumlahJam -= jam;
            System.out.println("Jumlah jam setelah pengurangan: " + jumlahJam);
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan. Jumlah jam kurang dari yang diinginkan.");
        }
    }
}

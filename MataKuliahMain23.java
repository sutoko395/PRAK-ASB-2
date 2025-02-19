
public class MataKuliahMain23 {
    public static void main(String[] args) {

        MataKuliah23 matkul1 = new MataKuliah23();
        matkul1.kodeMK = "IF013";
        matkul1.nama = "Algoritma Struktur Data";
        matkul1.sks = 2;
        matkul1.jumlahJam = 30;
        matkul1.tampilkanInformasi();

        matkul1.ubahSKS(4);
        matkul1.tambahJam(4);
        matkul1.kurangiJam(5);
        matkul1.tampilkanInformasi();

        MataKuliah23 matkul2 = new MataKuliah23("IF101", "Pemrograman Dasar", 3, 25);
        matkul2.tampilkanInformasi();

        MataKuliah23 mhssutoko = new MataKuliah23("IF202", "Pemrograman Lanjutan", 3, 28);
        mhssutoko.tampilkanInformasi();



    }
}

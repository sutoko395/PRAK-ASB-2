public class DosenMain23 {
    public static void main(String[] args) {
        int tahunSekarang = 2025;

        Dosen23 dosen1 = new Dosen23();
        dosen1.setIdDosen("D01");
        dosen1.setNama("Rokhimatul Wakhidah, S.Pd., M.T.");
        dosen1.setStatusAktif(true);
        dosen1.setTahunBergabung(2020);
        dosen1.ubahKeahlian("Algoritma Struktur Data");

        Dosen23 dosen2 = new Dosen23("D02", "SUTOKO", true, 2024, "Pemrogramana Dasar");

        System.out.println("\nInformasi Dosen 1:");
        dosen1.tampilInformasi();
        System.out.println("Masa Kerja Dosen 1: " + dosen1.hitungMasaKerja(tahunSekarang) + " tahun.");

        System.out.println("\nInformasi Dosen 2:");
        dosen2.tampilInformasi();
        System.out.println("Masa Kerja Dosen 2: " + dosen2.hitungMasaKerja(tahunSekarang) + " tahun.");
    }
}
public class Dosen23 {
    private String idDosen;
    private String nama;
    private boolean statusAktif;
    private int tahunBergabung;
    private String bidangKeahlian;

    public Dosen23() {
    }
    public Dosen23(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }
    void setIdDosen(String idDosen) {
        this.idDosen = idDosen;
    }
    void setNama(String nama) {
        this.nama = nama;
    }
    void setTahunBergabung(int tahunBergabung) {
        this.tahunBergabung = tahunBergabung;
    }
    void setStatusAktif(boolean status) {
        this.statusAktif = status;
    }
    void ubahKeahlian(String bidang) {
        this.bidangKeahlian = bidang;
    }
    void tampilInformasi() {
        System.out.println("ID Dosen        : " + idDosen);
        System.out.println("Nama            : " + nama);
        System.out.println("Status Aktif    : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
    }
    public int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - this.tahunBergabung;
    }
}

public class Mahasiswa23 {

String nama;
String nim;
String kelas;
double ipk;


    void tampilkanInformasi() {
        System.out.println("NAMA : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("IPK : " + ipk);
        System.out.println("KELAS : " + kelas);
    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk = ipkBaru;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }

    String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "KINERJA SANGAT BAIK";
        }else if (ipk >= 3.0) {
            return "KINERJA BAIK";
        }else if (ipk >= 2.0) {
            return "KINERJA CUKUP";
        }else {
            return "KINERJA KURANG";
        }
    }
}

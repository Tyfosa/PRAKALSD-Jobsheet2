public class mahasiswamain23 {
    public static void main(String[] args) {

        Mahasiswa23 mhs1 = new Mahasiswa23 ();
        mhs1.nama = "muhammad ahli farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "S1 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIPK(3.60);
        mhs1.tampilkanInformasi();
    
}}
public class mahasiswamain23 {
    public static void main(String[] args) {
        Mahasiswa23 mhsl = new Mahasiswa23();

        mhsl.nama = "Muhammad Ali Farhan";
        mhsl.nim = "2241720171";
        mhsl.kelas = "SI 2J";
        mhsl.ipk = 3.55;

        mhsl.tampilkanInformasi();
        mhsl.ubahKelas("SI 2K");
        mhsl.updateIPK(3.60);
        mhsl.tampilkanInformasi();

        Mahasiswa23 mhs2 = new Mahasiswa23 ("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIPK(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa23 mhs3 = new Mahasiswa23 ("tyfosa", "244107060071", 3.7, "SI 1A");
        mhs3.updateIPK(3.30);
        mhs3.tampilkanInformasi();
    }
}
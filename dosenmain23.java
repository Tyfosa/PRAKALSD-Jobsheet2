public class dosenmain23 {
    
    public static void main(String[] args) {
        dosen23 dosen1 = new dosen23();
        dosen1.idDosen = "D001";
        dosen1.nama = "Prof. Dr. Eng. Rosa Andrie Asmara, S.T., M.T.";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2000;
        dosen1.bidangKeahlian = "Teknik Informatika";

        dosen23 dosen2 = new dosen23("D002", "Pramana Yoga Saputra, S.Kom., M.MT.", false, 2009, "Teknik Kimia");

        System.out.println("Informasi Dosen 1:");
        dosen1.tampilInformasi();
        dosen1.setStatusAktif(false);
        System.out.println("Masa Kerja Dosen 1: " + dosen1.hitungMasaKerja(2024) + " tahun");
        dosen1.ubahBidangKeahlian("Sistem Operasi");

        System.out.println("\nInformasi Dosen 2:");
        dosen2.tampilInformasi();
        dosen2.setStatusAktif(true);
        System.out.println("Masa Kerja Dosen 2: " + dosen2.hitungMasaKerja(2024) + " tahun");
        dosen2.ubahBidangKeahlian("Kalkulus");
    }
}

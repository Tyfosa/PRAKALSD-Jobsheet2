public class matakuliahmain23 {
    public static void main(String[] args) {
        matakuliah23 mk1 = new matakuliah23("IF123", "Sistem Operasi", 5, 6);
        matakuliah23 mk2 = new matakuliah23("IF124", "Basis Data", 4, 5);
        matakuliah23 mk3 = new matakuliah23("IF125", "Matematika Lanjut", 3, 4);
        matakuliah23 mk4 = new matakuliah23("IF126", "Kewarganegaraan", 2, 3);
    
        System.out.println("Informasi Mata Kuliah:");
        mk1.tampilInformasi();
        mk2.tampilInformasi();
        mk3.tampilInformasi();
    
        mk1.ubahSKS(5);
        mk2.ubahSKS(4);
        mk3.ubahSKS(2);
    
        mk1.tambahJam(5);
        mk2.tambahJam(6);
        mk3.tambahJam(3);
    
        System.out.println("Informasi Mata Kuliah setelah diubah:");
        mk1.tampilInformasi();
        mk2.tampilInformasi();
        mk3.tampilInformasi();
        }
}
    
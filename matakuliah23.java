public class matakuliah23 {

      
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public matakuliah23(String kodeMK, String nama, int sks, int jmlJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jmlJam;
    }

    void tampilInformasi() {
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS telah diubah menjadi: " + sks);
    }

    void tambahJam(int jam){
        this.jumlahJam += jam;
        System.out.println("Jumlah jam telah ditambahkan menjadi: " + jumlahJam);
    }

    void kurangiJam(int jam){
        if (jam > jumlahJam) {
            System.out.println("Pengurangan jumlah jam tidak dapat dilakukan");
        } else {
            jumlahJam -= jam;
            System.out.println("Jumlah jam telah dikurangi menjadi: " + jumlahJam);
        }
    }
    
}

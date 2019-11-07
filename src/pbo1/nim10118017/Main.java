package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Ini adalah class main, dimana class yang pertama dijalankan.
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        Mahasiswa mahasiswa = new Mahasiswa();
        
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setNip("41227829930");
        dosen.setMataKuliah("PBO");
        dosen.setUmur(27);
        
        mahasiswa.setNama("Nindi");
        mahasiswa.setNim("10110269");
        mahasiswa.setKelas("PBO2");
        mahasiswa.setUmur(17);
        
        //Menampilkan
        System.out.println("NIP DOSEN : " + dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();
        
        System.out.println();
        
        System.out.println("NIM MAHASISWA : " + mahasiswa.getNim());
        mahasiswa.siapaKamu();
        mahasiswa.kelasApa();
    }
    
}

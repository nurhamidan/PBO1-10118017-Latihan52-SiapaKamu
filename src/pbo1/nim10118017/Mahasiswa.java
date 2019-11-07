package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Class ini merupakan class turunan dari class Manusia,
 *                        class ini berfungsi untuk mengatur properti mahasiswa dan mengetahui statusnya.
 * 
 */
public class Mahasiswa extends Manusia {
    private String nim;
    private String kelas;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    public void kelasApa() {
        System.out.println("Saya " + nama + " umur " + umur + " tahun sedang belajar di kelas " + kelas + ".");
    }

    @Override
    public void siapaKamu() {
        System.out.println("Saya Mahasiswa.");
    }
}

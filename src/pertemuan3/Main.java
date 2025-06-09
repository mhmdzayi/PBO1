package pertemuan3;

public class Main {
    public static void main(String[] args){
    //Membuat objek mahasiswa dengan konstrktor
    Mahasiswa mhs1 = new Mahasiswa("Zaini", "2310010302", "Informatika");
    
    //Menampilkan data awal
    System.out.println("=== Data Awal ===");
    mhs1.tampilkanData();
    
   //Mengubah data menggunakan mutator
   mhs1.setNama("Muhammad Zaini");
   mhs1.setNpm("2310010302");
   mhs1.setJurusan("Teknik Informatika");
   
   //Menampilkan data setelah perubahan
   System.out.println("\n=== Data Setelah Diubah=== ");
   mhs1.tampilkanData();
   
   //Mengakses data menggunakan Accessor
   System.out.println("\n=== Akses Individu ===");
   System.out.println("Nama Mahasiswa :" + mhs1.getNama());
    }   
}
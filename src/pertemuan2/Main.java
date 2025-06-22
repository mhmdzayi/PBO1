package pertemuan2;

public class Main {
    public static void main(String[] args) {
        Mahasiswa z = new Mahasiswa();
        z.nama = "Muhammad Zaini";
        z.npm = "2310010302";
        z.jurusan = "Teknik Informatika";
        
        //Menampilkan informasi Mahasiswa
        System.out.println("Nama    :" +z.nama);
        System.out.println("NPM     :" +z.npm);
        System.out.println("Jurusan :" +z.jurusan);
       
    }
}

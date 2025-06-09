package pertemuan3;

public class Mahasiswa {
    //Atribut
    private String nama;
    private final String npm;
    private final String jurusan;
    
    //Konstruktor
    public Mahasiswa(String nama, String npm, String jurusan){
        this.nama = nama;
        this.npm = npm;
        this.jurusan = jurusan;
    }
    
    //Mutator
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setNpm(String npm) {
        this.nama = npm;
    }
    public void setJurusan(String jurusan) {
        this.nama = jurusan;
    }
    
    //Accessor
    public String getNama(){
        return nama;
    }
    
    public String getNpm(){
        return npm;
    }
    
    public String getJurusan(){
        return jurusan;
    }
    
    //Method biasa
    public void tampilkanData(){
        System.out.println("Nama :" + nama);
        System.out.println("NPM :" + npm);
        System.out.println("Jurusan :" + jurusan);
    }
}

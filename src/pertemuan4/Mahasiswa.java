package pertemuan4;

public class Mahasiswa {
    private String nama;
    private String npm;
    
    public Mahasiswa(String nama, String npm){
        this.nama = nama;
        this.npm = npm;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNpm(){
        return npm;
    }
    
    public void setNpm(String npm){
        this.npm = npm;
    }   
    
    public void info(){
        System.out.println("Nama : " + nama);
        System.out.println("NPM : " + npm);
    }
    
    public void aktivitas(){
        System.out.println("Mahasiswa sedang belajar.");
    }
    
}

package pertemuan4;

public class MahasiswaReguler extends Mahasiswa {
    public MahasiswaReguler(String nama, String npm){
        super(nama, npm);
    }
    
    @Override
    public void aktivitas(){
        System.out.println(getNama() + "mengikuti kuliah tatap muka");
    }
    
}

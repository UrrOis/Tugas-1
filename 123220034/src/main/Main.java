package main;

public class Main {
    
    public static void main(String[]args){
        kelas.Mahasiswa mhs = new kelas.Mahasiswa();
        kelas.Dosen dsn = new kelas.Dosen();
        
        System.out.println("Daftar Mahasiswa");
        System.out.println("=====================================");
        System.out.println("Kelas 1 = \n\n" + mhs.kelas1 + "\n");
        
        System.out.println("Kelas 2 =\n\n" + mhs.kelas2 + "\n");
        
        System.out.println("Daftar Pengajar");
        System.out.println("=====================================");
        System.out.println("Pengajar = \n\n" + dsn.pengajar + "\n" );
    }
}

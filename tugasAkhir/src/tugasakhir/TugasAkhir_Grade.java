package tugasakhir;

import java.util.Scanner; 
public class TugasAkhir_Grade {
    public static void main(String[] args) {
        String Nama;
        int NIM;
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.print("Masukkan Nama Mahasiswa   : ");
        Nama = input.next();
        System.out.print("Masukkan NIM Mahasiswa    : ");
        NIM = input2.nextInt();
        System.out.println("-----------------------------------");
        String mataKuliah = Matkul();
        double absensi = Absensi();
        double uts = UTS();
        double uas = UAS();
        double nilai_akhir = (absensi*0.2 + uts*0.3 + uas*0.5);
        System.out.println("-----------------------------------");
        nilaiAkhir(nilai_akhir);
        System.out.println("-----------------------------------");
    }
    
    public static String Matkul(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Mata Kuliah      : ");
        return input.next();
    } 
    
    public static Double Absensi(){
        double absen, nilai = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Kehadiran : ");
        absen = input.nextDouble();
        if (absen < 3){
            nilai = 0;
        }else if (absen >= 3 && absen <= 4) {
            nilai = 60;
        }else if (absen >= 5 && absen <= 6) {
            nilai = 80;
        }else if (absen >= 7) {
            nilai = 100;
        }
        return nilai;
    } 
    
    public static Double UTS(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai UTS        : ");
        return input.nextDouble();
    } 
    
    public static Double UAS(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai UAS        : ");
        return input.nextDouble();
    } 
    
    public static void nilaiAkhir(double nilai){
        System.out.println("Nilai Akhir : "+nilai);
        System.out.println("Grade       : "+Grade(nilai));
    } 
    
    static char Grade (double nilai){
        char grade = 'E';
        if (nilai >= 85 && nilai <= 100){
            grade = 'A';
        }else if (nilai >= 70 && nilai <= 84){
            grade = 'B';
        }else if (nilai >= 60 && nilai <= 69){
            grade = 'C';
        }else if (nilai >= 50 && nilai <= 59){
            grade = 'D';
        }else if (nilai <= 50){
            grade = 'E';
        }
        return grade;
    }
}

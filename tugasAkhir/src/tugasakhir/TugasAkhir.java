package tugasakhir;

public class TugasAkhir {

    public static void main(String[] args) {
        
        // Kalimat Awal
        String awal = "JavaScript adalah bahasa pemrograman tingkat tinggi dan dinamis";
        
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println(" String Awal = "+awal); //untuk menampilkan kalimat awal
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("-    Tampilan Setelah Manipulasi String    -");
        System.out.println("--------------------------------------------");
        
        //Method untuk mengambil string dari indeks tertentu
        String satu = awal.substring(0,36);
        System.out.println(" 1. "+satu);

        //Method untuk mengubah string menjadi huruf kecil 
        String dua = satu.toLowerCase();
        System.out.println(" 2. "+dua);
        
        //Method untuk mengubah string menjadi huruf besar / kapital 
        String tiga = satu.toUpperCase();
        System.out.println(" 3. "+tiga);
        
        //Method untuk mengambil string dari indeks tertentu
        String empat = satu.substring(25);
        System.out.println(" 4. "+empat);
        
        //Method untuk mengambil string dari indeks tertentu
        String lima = awal.substring(37);
        System.out.println(" 5. "+lima);
        System.out.println("--------------------------------------------");

    }
    
}

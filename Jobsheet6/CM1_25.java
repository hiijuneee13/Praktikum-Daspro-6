package Jobsheet6;              // Package tempat file ini disimpan
import java.util.Scanner;       // Import Scanner untuk input dari user

public class CM1_25 {           // Nama class utama
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   // Membuat objek Scanner

        // ================= INPUT DATA MAHASISWA =================
        System.out.println("===== INPUT DATA MAHASISWA =====");
        System.out.print("Nama Mahasiswa : ");
        String nama = sc.nextLine();           // Variabel nama mahasiswa (String)
        System.out.print("NIM : ");
        String nim = sc.nextLine();            // Variabel NIM mahasiswa (String)

        // ================= MATA KULIAH 1 =================
        System.out.println("\n--- Mata Kuliah 1 : Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS : ");
        double uts1 = sc.nextInt();         // Nilai UTS (angka desimal)
        System.out.print("Nilai UAS : ");
        double uas1 = sc.nextInt();         // Nilai UAS (angka desimal)
        System.out.print("Nilai Tugas : ");
        double tugas1 = sc.nextInt();       // Nilai Tugas (angka desimal)

        // Hitung nilai akhir MK1 (30% UTS + 40% UAS + 30% Tugas) ( Operator )
        double akhir1 = uts1 * 0.3 + uas1 * 0.4 + tugas1 * 0.3;  
        String huruf1 = konversiNilai(akhir1);                     // Konversi angka → huruf mutu
        String status1 = (akhir1 >= 60) ? "LULUS" : "TIDAK LULUS"; // Status lulus/tidak MK1

        // ================= MATA KULIAH 2 =================
        System.out.println("\n--- Mata Kuliah 2 : Struktur Data ---");
        System.out.print("Nilai UTS : ");
        double uts2 = sc.nextInt();         // Nilai UTS MK2
        System.out.print("Nilai UAS : ");
        double uas2 = sc.nextInt();         // Nilai UAS MK2
        System.out.print("Nilai Tugas : ");
        double tugas2 = sc.nextInt();       // Nilai Tugas MK2

        // Hitung nilai akhir MK2 (30% UTS + 40% UAS + 30% Tugas) ( Operator )
        double akhir2 = uts2 * 0.3 + uas2 * 0.4 + tugas2 * 0.3;  
        String huruf2 = konversiNilai(akhir2);                     // Konversi angka → huruf mutu
        String status2 = (akhir2 >= 60) ? "LULUS" : "TIDAK LULUS"; // Status lulus/tidak MK2

        // ================= MATA KULIAH 3 =================
        System.out.println("\n--- Mata Kuliah 3 : Praktikum Pemrograman ---");
        System.out.print("Nilai UTS : ");
        double uts3 = sc.nextInt();         // Nilai UTS MK3
        System.out.print("Nilai UAS : ");
        double uas3 = sc.nextInt();         // Nilai UAS MK3
        System.out.print("Nilai Tugas : ");
        double tugas3 = sc.nextInt();       // Nilai Tugas MK3

        // Hitung nilai akhir MK2 (30% UTS + 40% UAS + 30% Tugas) ( Operator )
        double akhir3 = uts3 * 0.3 + uas3 * 0.4 + tugas3 * 0.3;  
        String huruf3 = konversiNilai(akhir3);                     // Konversi angka → huruf mutu
        String status3 = (akhir3 >= 60) ? "LULUS" : "TIDAK LULUS"; // Status lulus/tidak MK2

        // ================= HITUNG RATA-RATA SEMESTER ( IF & Nested IF )=================
        double rata = (akhir1 + akhir2 + akhir3) / 2;    // Rata-rata nilai akhir dari 2 mata kuliah
        String statusSemester;
        if (akhir1 >= 60 && akhir2 >= 60 && akhir3 >= 60) {    // Jika kedua mata kuliah lulus angka minimal 60
            if (rata >= 70) statusSemester = "LULUS";  
            else statusSemester = "TIDAK LULUS (Salah satu Mata Kuliah di bawah rata-rata 70)";
        } else {
            statusSemester = "TIDAK LULUS (Salah satu Mata Kuliah tidak lulus)";
        }

        // ================= OUTPUT =================
        System.out.println("\n=========== HASIL PENILAIAN AKADEMIK ===========");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);

        // Output MK1
        System.out.println("\nMata Kuliah : Algoritma dan Pemrograman");
        System.out.println("UTS         : " + uts1);
        System.out.println("UAS         : " + uas1);
        System.out.println("Tugas       : " + tugas1);
        System.out.println("Nilai Akhir : " + akhir1);
        System.out.println("Nilai Huruf : " + huruf1);
        System.out.println("Status      : " + status1);

        // Output MK2
        System.out.println("\nMata Kuliah : Struktur Data");
        System.out.println("UTS         : " + uts2);
        System.out.println("UAS         : " + uas2);
        System.out.println("Tugas       : " + tugas2);
        System.out.println("Nilai Akhir : " + akhir2);
        System.out.println("Nilai Huruf : " + huruf2);
        System.out.println("Status      : " + status2);

        // Output MK3
        System.out.println("\nMata Kuliah : Pemrograman Berorientasi Objek");
        System.out.println("UTS         : " + uts3);
        System.out.println("UAS         : " + uas3);
        System.out.println("Tugas       : " + tugas3);
        System.out.println("Nilai Akhir : " + akhir3);
        System.out.println("Nilai Huruf : " + huruf3);
        System.out.println("Status      : " + status3);

        // Output rata-rata & status semester
        System.out.printf("\nRata-rata Nilai Akhir: %.2f\n", rata);
        System.out.println("Status Semester: " + statusSemester);
    }

    // ================= METHOD KONVERSI =================
    // Method untuk mengubah nilai angka → huruf mutu
    static String konversiNilai(double nilai) {
        if (nilai >= 80) return "A";
        else if (nilai >= 73) return "B+";
        else if (nilai >= 65) return "B";
        else if (nilai >= 60) return "C+";
        else if (nilai >= 50) return "C";
        else if (nilai >= 39) return "D";
        else return "E";
    }
}

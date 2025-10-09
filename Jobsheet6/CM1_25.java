package Jobsheet6;

import java.util.Scanner;

public class CM1_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input data mahasiswa
        System.out.println("===== INPUT DATA MAHASISWA =====");
        System.out.print("Nama : ");
        String nama = sc.nextLine();
        System.out.print("NIM : ");
        String nim = sc.nextLine();

        // Mata kuliah 1
        System.out.println("\n--- Mata Kuliah 1 : Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS : ");
        double uts1 = sc.nextDouble();
        System.out.print("Nilai UAS : ");
        double uas1 = sc.nextDouble();
        System.out.print("Nilai Tugas : ");
        double tugas1 = sc.nextDouble();

        double akhir1 = uts1 * 0.3 + uas1 * 0.4 + tugas1 * 0.3;
        String huruf1 = konversiNilai(akhir1);
        String status1 = (akhir1 >= 60) ? "LULUS" : "TIDAK LULUS";

        // Mata kuliah 2
        System.out.println("\n--- Mata Kuliah 2 : Struktur Data ---");
        System.out.print("Nilai UTS : ");
        double uts2 = sc.nextDouble();
        System.out.print("Nilai UAS : ");
        double uas2 = sc.nextDouble();
        System.out.print("Nilai Tugas : ");
        double tugas2 = sc.nextDouble();

        double akhir2 = uts2 * 0.3 + uas2 * 0.4 + tugas2 * 0.3;
        String huruf2 = konversiNilai(akhir2);
        String status2 = (akhir2 >= 60) ? "LULUS" : "TIDAK LULUS";

        // Status semester
        double rata = (akhir1 + akhir2) / 2;
        String statusSemester;
        if (akhir1 >= 60 && akhir2 >= 60) {
            if (rata >= 70) {
                statusSemester = "LULUS";
            } else {
                statusSemester = "TIDAK LULUS (Rata-rata < 70)";
            }
        } else {
            statusSemester = "TIDAK LULUS (Salah satu MK tidak lulus)";
        }

        // Output
        System.out.println("\n=========== HASIL PENILAIAN AKADEMIK ===========");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.printf("%-25s %-5s %-5s %-7s %-12s %-12s %-12s\n", 
            "Mata Kuliah", "UTS", "UAS", "Tugas", "Nilai Akhir", "Nilai Huruf", "Status");
        System.out.printf("%-25s %-5.0f %-5.0f %-7.0f %-12.2f %-12s %-12s\n", 
            "Algoritma Pemrograman", uts1, uas1, tugas1, akhir1, huruf1, status1);
        System.out.printf("%-25s %-5.0f %-5.0f %-7.0f %-12.2f %-12s %-12s\n", 
            "Struktur Data", uts2, uas2, tugas2, akhir2, huruf2, status2);

        System.out.printf("\nRata-rata Nilai Akhir: %.2f\n", rata);
        System.out.println("Status Semester: " + statusSemester);
    }

    // Fungsi konversi nilai angka ke huruf
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

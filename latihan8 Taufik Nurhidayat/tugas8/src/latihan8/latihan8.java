package latihan8;
import java.util.Scanner;

public class latihan8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlah = input.nextInt();
        input.nextLine(); // buang enter

        String[] nama = new String[jumlah];
        String[] status = new String[jumlah];

        // Input data
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nSiswa ke-" + (i + 1));
            System.out.print("Nama: ");
            nama[i] = input.nextLine();

            // VALIDASI STATUS
            while (true) {
                System.out.print("Status (Hadir/Izin/Sakit/Alfa): ");
                status[i] = input.nextLine();

                if (status[i].equalsIgnoreCase("Hadir") ||
                    status[i].equalsIgnoreCase("Izin") ||
                    status[i].equalsIgnoreCase("Sakit") ||
                    status[i].equalsIgnoreCase("Alfa")) {
                    break; // keluar loop kalau valid
                } else {
                    System.out.println("❌ Status tidak valid! Coba lagi.");
                }
            }
        }

        // Output data
        System.out.println("\n=== DATA ABSENSI ===");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + ". " + nama[i] + " - " + status[i]);
        }

        input.close();
    }
}
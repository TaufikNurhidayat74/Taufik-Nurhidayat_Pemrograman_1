package tugas8;
import java.util.Scanner;

public class tugas8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int n = input.nextInt();
        input.nextLine();

        int hadir = 0, sakit = 0, izin = 0, alfa = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("\nData siswa ke-" + i);

            System.out.print("Nama: ");
            String nama = input.nextLine();

            System.out.print("Hadir? (y/n): ");
            String status = input.nextLine().toLowerCase();

            if (status.equals("y")) {
                hadir++;
            } else {
                System.out.println("Keterangan tidak hadir:");
                System.out.println("1. Sakit");
                System.out.println("2. Izin");
                System.out.println("3. Alfa");
                System.out.print("Pilih (1/2/3): ");
                int ket = input.nextInt();
                input.nextLine();

                if (ket == 1) {
                    sakit++;
                } else if (ket == 2) {
                    izin++;
                } else {
                    alfa++;
                }
            }
        }

        // Rekap
        System.out.println("\n=== REKAP KEHADIRAN ===");
        System.out.println("Hadir : " + hadir);
        System.out.println("Sakit : " + sakit);
        System.out.println("Izin  : " + izin);
        System.out.println("Alfa  : " + alfa);
        System.out.println("Total tidak hadir : " + (sakit + izin + alfa));

        input.close();
    }
}
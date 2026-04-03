package tugas4;
// menambahkan nilai rentang, jika memasukan nila yg berada diluar rentan nilai, 
// maka harus memasukan angka lagi sampai benar
//menambahkan lulus atau tidak lulus
import java.util.Scanner;

public class tugas4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float bobotKehadiran, realisasi, bobotTugas, uts, uas, total;

        // Input nilai dengan validasi
        System.out.print("Masukkan nilai Kehadiran (0-100): ");
        bobotKehadiran = input.nextFloat();
        while (bobotKehadiran < 0 || bobotKehadiran > 100) {
            System.out.print("Nilai Kehadiran tidak valid! Masukkan nilai antara 0 dan 100: ");
            bobotKehadiran = input.nextFloat();
        }

        System.out.print("Masukkan nilai Realisasi (0-100): ");
        realisasi = input.nextFloat();
        while (realisasi < 0 || realisasi > 100) {
            System.out.print("Nilai Realisasi tidak valid! Masukkan nilai antara 0 dan 100: ");
            realisasi = input.nextFloat();
        }

        System.out.print("Masukkan nilai Tugas (0-100): ");
        bobotTugas = input.nextFloat();
        while (bobotTugas < 0 || bobotTugas > 100) {
            System.out.print("Nilai Tugas tidak valid! Masukkan nilai antara 0 dan 100: ");
            bobotTugas = input.nextFloat();
        }

        System.out.print("Masukkan nilai UTS (0-100): ");
        uts = input.nextFloat();
        while (uts < 0 || uts > 100) {
            System.out.print("Nilai UTS tidak valid! Masukkan nilai antara 0 dan 100: ");
            uts = input.nextFloat();
        }

        System.out.print("Masukkan nilai UAS (0-100): ");
        uas = input.nextFloat();
        while (uas < 0 || uas > 100) {
            System.out.print("Nilai UAS tidak valid! Masukkan nilai antara 0 dan 100: ");
            uas = input.nextFloat();
        }

        // Perhitungan total dengan bobot
        if (realisasi != 0) {
            // Asumsikan bobot komponen adalah 10% untuk kehadiran, 20% untuk tugas, 30% untuk UTS dan 40% untuk UAS
            total = (bobotKehadiran * 0.1f) + (bobotTugas * 0.2f) + (uts * 0.3f) + (uas * 0.4f);
            System.out.println("Total Nilai: " + total);

            // Memberikan feedback
            if (total >= 60) {
                System.out.println("Selamat, Anda Lulus!");
            } else {
                System.out.println("Maaf, Anda Tidak Lulus.");
            }
        } else {
            System.out.println("Realisasi tidak boleh 0!");
        }

        input.close();
    }
}
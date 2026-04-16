package PilihanHero;

import java.util.Scanner;

public class PilihanHero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Data musuh
        String musuh = "Chernuos";
        long musuhHP = 5_000_000; // 5 juta HP

        // Daftar servant
        String[] servants = {"Artoria", "Jeanne d'Arc", "Gilgamesh", "Oberon", "Castoria"};
        boolean[] dipilih = new boolean[servants.length]; // untuk menandai servant yang sudah dipilih

        System.out.println("=== Pilih Servant untuk Melawan " + musuh + " ===");
        
        // Looping sampai semua servant dipilih atau musuh kalah
        for (int i = 0; i < servants.length; i++) {
            System.out.println("\nServants tersisa:");
            for (int j = 0; j < servants.length; j++) {
                if (!dipilih[j]) {
                    System.out.println((j + 1) + ". " + servants[j]);
                }
            }

            System.out.print("Masukkan angka servant pilihanmu: ");
            int pilihan = input.nextInt();

            // Validasi input
            if (pilihan < 1 || pilihan > servants.length || dipilih[pilihan - 1]) {
                System.out.println("Pilihan tidak tersedia atau sudah dipilih! Coba lagi.");
                i--; // ulangi loop untuk servant yang sama
                continue;
            }

            String servant = servants[pilihan - 1];
            dipilih[pilihan - 1] = true; // tandai servant sudah dipilih
            System.out.println("Kamu membawa " + servant + " melawan " + musuh + "!");

            // Hitung damage berdasarkan servant
            long damage = 0;
            if (servant.equals("Artoria")) {
                damage = 500_000;
            } else if (servant.equals("Jeanne d'Arc")) {
                damage = 450_000;
            } else if (servant.equals("Gilgamesh")) {
                damage = 700_000;
            } else if (servant.equals("Oberon")) {
                damage = 600_000;
            } else if (servant.equals("Castoria")) {
                damage = 400_000;
            }

            // Kurangi HP musuh
            musuhHP -= damage;
            System.out.println(servant + " menyerang dan memberikan " + damage + " damage!");
            System.out.println("Sisa HP " + musuh + ": " + (musuhHP > 0 ? musuhHP : 0));

            // Cek jika musuh sudah kalah
            if (musuhHP <= 0) {
                System.out.println("\nSelamat! " + musuh + " berhasil dikalahkan!");
                return; // keluar dari program karena musuh sudah kalah
            }
        }

        // Jika semua servant dipakai tapi musuh masih hidup
        if (musuhHP > 0) {
            System.out.println("\nMusuh terlalu kuat! " + musuh + " masih memiliki HP " + musuhHP);
        }
    }
}
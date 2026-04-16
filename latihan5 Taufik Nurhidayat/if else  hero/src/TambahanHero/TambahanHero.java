package TambahanHero;

import java.util.Scanner;

public class TambahanHero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Data musuh
        String musuh = "Chernuos";
        long[] musuhHP = {5_000_000}; // gunakan array supaya bisa diupdate di fungsi

        System.out.println("Musuh: " + musuh + " | Total HP: " + musuhHP[0]);

        // Servant awal
        String[] servantsAwal = {"Artoria", "Jeanne d'Arc", "Gilgamesh", "Oberon", "Castoria"};
        boolean[] dipilihAwal = new boolean[servantsAwal.length];

        // Battle loop servant awal
        battleLoop(servantsAwal, dipilihAwal, musuh, musuhHP, input);

        // Jika musuh masih hidup setelah servant awal
        if (musuhHP[0] > 0) {
            System.out.println("\nSemua servant awal habis, tapi " + musuh + " masih kuat!");
            System.out.print("Ingin bangkit lagi? (yes/no): ");
            String bangkit = input.next();

            if (bangkit.equalsIgnoreCase("yes")) {
                // Servant tambahan
                String[] servantsBaru = {"Morgan Lee Fae", "Vincent Van Gogh", "Nero Claudius", "Okita Souji"};
                boolean[] dipilihBaru = new boolean[servantsBaru.length];

                System.out.println("\nBangkit! Musuh: " + musuh + " | Sisa HP: " + musuhHP[0]);
                // Battle loop servant baru
                battleLoopResetNumbering(servantsBaru, dipilihBaru, musuh, musuhHP, input);

                if (musuhHP[0] > 0) {
                    System.out.println("\nMusuh terlalu kuat! " + musuh + " masih memiliki HP " + musuhHP[0]);
                }
            } else {
                System.out.println("\nKamu kalah!");
            }
        }
    }

    // Battle loop servant awal
    public static void battleLoop(String[] servants, boolean[] dipilih, String musuh, long[] musuhHP, Scanner input) {
        for (int i = 0; i < servants.length; i++) {
            System.out.println("\nServants tersisa:");
            for (int j = 0; j < servants.length; j++) {
                if (!dipilih[j]) {
                    System.out.println((j + 1) + ". " + servants[j]);
                }
            }

            System.out.print("Masukkan angka servant pilihanmu: ");
            int pilihan = input.nextInt();

            if (pilihan < 1 || pilihan > servants.length || dipilih[pilihan - 1]) {
                System.out.println("Pilihan tidak tersedia atau sudah dipilih! Coba lagi.");
                i--;
                continue;
            }

            int servantIndex = pilihan - 1;
            dipilih[servantIndex] = true;
            long damage = hit(servants[servantIndex]);
            musuhHP[0] -= damage;

            System.out.println(servants[servantIndex] + " menyerang dan memberikan " + damage + " damage!");
            System.out.println("Sisa HP " + musuh + ": " + (musuhHP[0] > 0 ? musuhHP[0] : 0));

            if (musuhHP[0] <= 0) {
                System.out.println("\nSelamat! " + musuh + " berhasil dikalahkan!");
                return;
            }
        }
    }

    // Battle loop servant bangkit dengan angka reset
    public static void battleLoopResetNumbering(String[] servants, boolean[] dipilih, String musuh, long[] musuhHP, Scanner input) {
        while (true) {
            int counter = 1;
            int[] mapping = new int[servants.length];
            System.out.println("\nServants tersisa:");
            for (int i = 0; i < servants.length; i++) {
                if (!dipilih[i]) {
                    System.out.println(counter + ". " + servants[i]);
                    mapping[counter - 1] = i;
                    counter++;
                }
            }

            if (counter == 1) {
                System.out.println("Tidak ada servant tersisa!");
                return;
            }

            System.out.print("Masukkan angka servant pilihanmu: ");
            int pilihan = input.nextInt();

            if (pilihan < 1 || pilihan >= counter || dipilih[mapping[pilihan - 1]]) {
                System.out.println("Pilihan tidak tersedia atau sudah dipilih! Coba lagi.");
                continue;
            }

            int servantIndex = mapping[pilihan - 1];
            dipilih[servantIndex] = true;
            long damage = hit(servants[servantIndex]);
            musuhHP[0] -= damage;

            System.out.println(servants[servantIndex] + " menyerang dan memberikan " + damage + " damage!");
            System.out.println("Sisa HP " + musuh + ": " + (musuhHP[0] > 0 ? musuhHP[0] : 0));

            if (musuhHP[0] <= 0) {
                System.out.println("\nSelamat! " + musuh + " berhasil dikalahkan!");
                return;
            }
        }
    }

    // Hit damage servant
    public static long hit(String servant) {
        switch (servant) {
            case "Artoria": return 500_000;
            case "Jeanne d'Arc": return 450_000;
            case "Gilgamesh": return 700_000;
            case "Oberon": return 600_000;
            case "Castoria": return 400_000;
            case "Morgan Lee Fae": return 1_500_000; // damage besar
            case "Vincent Van Gogh": return 600_000;
            case "Nero Claudius": return 500_000;
            case "Okita Souji": return 600_000;
            default: return 400_000;
        }
    }
}
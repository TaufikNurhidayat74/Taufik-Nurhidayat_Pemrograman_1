package BuffHero2;

import java.util.Scanner;

public class BuffHero2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String musuh = "Chernuos";
        long musuhHP = 5_000_000; // 5 juta HP
        String[] servants = {"Artoria", "Jeanne d'Arc", "Gilgamesh", "Oberon", "Castoria"};
        boolean[] dipilih = new boolean[servants.length];
        long[] damageList = {500_000, 450_000, 700_000, 600_000, 400_000};
        boolean[] buffUsed = new boolean[3]; //menyimpan buff yg dipakai

        System.out.println("=== Pilih Servant untuk Melawan " + musuh + " ===");

        for (int i = 0; i < servants.length && musuhHP > 0; i++) {
            System.out.println("\nServants tersisa:");
            for (int j = 0; j < servants.length; j++) {
                if (!dipilih[j]) {
                    System.out.println((j + 1) + ". " + servants[j]);
                }
            }

            System.out.print("Masukkan angka servant pilihanmu: ");
            int pilihan = input.nextInt() - 1;

            if (pilihan < 0 || pilihan >= servants.length || dipilih[pilihan]) {
                System.out.println("Pilihan tidak tersedia atau sudah dipilih! Coba lagi.");
                i--;
                continue;
            }

            dipilih[pilihan] = true;
            System.out.println("Kamu membawa " + servants[pilihan] + " melawan " + musuh + "!");

            long damage = damageList[pilihan];

            // Pilihan Buff
            boolean validBuffChoice = false;
            while (!validBuffChoice) {
                System.out.println("\nPilih Buff untuk " + servants[pilihan] + ":");
                System.out.println("Pilih Buff yang belum digunakan:");

                // Menampilkan buff yang belum digunakan
                if (!buffUsed[0]) {
                    System.out.println("1. Buster (+1500 damage)");
                }
                if (!buffUsed[1]) {
                    System.out.println("2. Arts (+700 damage)");
                }
                if (!buffUsed[2]) {
                    System.out.println("3. Quick (+1200 damage)");
                }

                // Menangani input buff
                int buffChoice = input.nextInt();

                if (buffChoice == 1 && !buffUsed[0]) {
                    damage += 1500;
                    buffUsed[0] = true;
                    validBuffChoice = true;
                    System.out.println("Buff Buster diterapkan!");
                } else if (buffChoice == 2 && !buffUsed[1]) {
                    damage += 700;
                    buffUsed[1] = true;
                    validBuffChoice = true;
                    System.out.println("Buff Arts diterapkan!");
                } else if (buffChoice == 3 && !buffUsed[2]) {
                    damage += 1200;
                    buffUsed[2] = true;
                    validBuffChoice = true;
                    System.out.println("Buff Quick diterapkan!");
                } else {
                    System.out.println("Buff sudah dipilih atau pilihan tidak valid! Coba lagi.");
                }
            }

            // Menyatakan hasil serangan
            musuhHP -= damage;
            System.out.println(servants[pilihan] + " menyerang dan memberikan " + damage + " damage!");
            System.out.println("Sisa HP " + musuh + ": " + (musuhHP > 0 ? musuhHP : 0));

            if (musuhHP <= 0) {
                System.out.println("\nSelamat! " + musuh + " berhasil dikalahkan!");
            }
        }

        if (musuhHP > 0) {
            System.out.println("\nMusuh terlalu kuat! " + musuh + " masih memiliki HP " + musuhHP);
        }
    }
}
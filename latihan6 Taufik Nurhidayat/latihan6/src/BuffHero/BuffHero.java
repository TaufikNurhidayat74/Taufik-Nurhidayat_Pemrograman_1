package BuffHero;

import java.util.Scanner;

public class BuffHero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String musuh = "Chernuos";
        long musuhHP = 5_000_000; 
        String[] servants = {"Artoria", "Jeanne d'Arc", "Gilgamesh", "Oberon", "Castoria"};
        boolean[] dipilih = new boolean[servants.length];
        long[] damageList = {500_000, 450_000, 700_000, 600_000, 400_000};
        boolean[] buffUsed = new boolean[3];

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
            System.out.println("\nPilih Buff untuk " + servants[pilihan] + ":");
            System.out.println("1. Buster (+1500 damage)");
            System.out.println("2. Arts (+700 damage)");
            System.out.println("3. Quick (+1200 damage)");

            int buffChoice = input.nextInt();

            if (buffChoice >= 1 && buffChoice <= 3 && !buffUsed[buffChoice - 1]) {
                switch (buffChoice) {
                    case 1: damage += 1500; buffUsed[0] = true; break;
                    case 2: damage += 700; buffUsed[1] = true; break;
                    case 3: damage += 1200; buffUsed[2] = true; break;
                }
                System.out.println("Buff diterapkan!");
            } else {
                System.out.println("Buff sudah dipilih atau pilihan tidak valid! Tidak ada buff yang diterapkan.");
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
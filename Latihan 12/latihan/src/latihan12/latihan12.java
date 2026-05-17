//Taufik Nurhidayat (241011401388)
//04TPLP05 p12

package latihan12;

import java.util.ArrayList;
import java.util.Scanner;

// --- KELAS KARAKTER ---
class Karakter {
    private String nama;
    private int level;
    private int currentXp;
    private final int XP_PER_LEVEL = 100; // XP untuk naik level

    public Karakter(String nama) {
        this.nama = nama;
        this.level = 1;
        this.currentXp = 0;
    }

    public String getNama() {
        return nama;
    }

    public int getLevel() {
        return level;
    }

    public int getCurrentXp() {
        return currentXp;
    }

    public void tambahXp(int jumlahXp) {
        this.currentXp += jumlahXp;
        System.out.println("\n[+] " + nama + " mendapatkan " + jumlahXp + " XP!");
        
        // Loop jika XP yang didapat besar dan bisa naik lebih dari 1 level
        while (this.currentXp >= XP_PER_LEVEL) {
            this.currentXp -= XP_PER_LEVEL;
            this.level++;
            System.out.println("🎉 LEVEL UP! " + nama + " sekarang Level " + level + "!");
        }
    }

    public void tampilkanStatus() {
        System.out.println("- " + nama + " (Level " + level + ") | XP: " + currentXp + "/" + XP_PER_LEVEL);
    }
}

// --- KELAS ITEM MAKANAN ---
class Item {
    private String nama;
    private int xpBonus;

    public Item(String nama, int xpBonus) {
        this.nama = nama;
        this.xpBonus = xpBonus;
    }

    public String getNama() {
        return nama;
    }

    public int getXpBonus() {
        return xpBonus;
    }
}

// --- KELAS UTAMA (Sesuai dengan gambar kamu) ---
public class latihan12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Inisialisasi Karakter (Yuuki, Oz, Lily)
        ArrayList<Karakter> daftarKarakter = new ArrayList<>();
        daftarKarakter.add(new Karakter("Yuuki"));
        daftarKarakter.add(new Karakter("Oz"));
        daftarKarakter.add(new Karakter("Lily"));

        // 2. Inisialisasi Item Makanan
        ArrayList<Item> daftarItem = new ArrayList<>();
        daftarItem.add(new Item("Apel", 200));
        daftarItem.add(new Item("Melon", 400));
        daftarItem.add(new Item("Kue", 1000));

        boolean berjalan = true;

        System.out.println("=======================================");
        System.out.println("  SELAMAT DATANG DI SIMULATOR LEVEL UP ");
        System.out.println("=======================================");

        while (berjalan) {
            // Menampilkan Status Karakter
            System.out.println("\n--- STATUS KARAKTER ---");
            for (int i = 0; i < daftarKarakter.size(); i++) {
                System.out.print((i + 1) + ". ");
                daftarKarakter.get(i).tampilkanStatus();
            }
            System.out.println("4. Keluar Game");
            
            // Pilih Karakter
            System.out.print("\nPilih karakter yang ingin dinaikkan levelnya (1-4): ");
            int pilihanChar = scanner.nextInt();

            if (pilihanChar == 4) {
                System.out.println("\nTerima kasih telah bermain!");
                berjalan = false;
                break;
            }

            if (pilihanChar < 1 || pilihanChar > daftarKarakter.size()) {
                System.out.println("⚠️ Pilihan tidak valid!");
                continue;
            }

            Karakter karakterTerpilih = daftarKarakter.get(pilihanChar - 1);
            System.out.println("\nAnda memilih: " + karakterTerpilih.getNama());

            // Pilih Item Makanan
            System.out.println("--- PILIHAN ITEM ---");
            for (int i = 0; i < daftarItem.size(); i++) {
                Item item = daftarItem.get(i);
                System.out.println((i + 1) + ". " + item.getNama() + " (+" + item.getXpBonus() + " XP)");
            }
            System.out.println("4. Kembali");

            System.out.print("Pilih makanan untuk " + karakterTerpilih.getNama() + " (1-4): ");
            int pilihanItem = scanner.nextInt();

            if (pilihanItem == 4) {
                continue;
            }

            if (pilihanItem < 1 || pilihanItem > daftarItem.size()) {
                System.out.println("⚠️ Pilihan item tidak valid!");
                continue;
            }

            // Eksekusi Tambah XP
            Item itemTerpilih = daftarItem.get(pilihanItem - 1);
            karakterTerpilih.tambahXp(itemTerpilih.getXpBonus());
            
            System.out.println("\n=======================================");
        }

        scanner.close();
    }
}
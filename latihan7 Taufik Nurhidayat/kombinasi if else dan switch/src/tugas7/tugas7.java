package tugas7;

import java.util.Scanner;

public class tugas7 {
  public static void main(String[] args) {
  
    Scanner input = new Scanner(System.in);

    System.out.println(" ==kombinasi if else dan switch== ");
    System.out.println("=== Pilihan ===");
    System.out.println("1. Makanan");
    System.out.println("2. Minuman");
    System.out.println("Pilih (Makanan/Minum):");
    
    int pilihan = input.nextInt();

    // Kombinasi dengan if-else
    if (pilihan == 1) {
      System.out.println("Kamu Memilih Makanan");
      // Menampilkan menu makanan setelah memilih Makanan
      System.out.println("=== Menu Makanan ===");
      System.out.println("1. Nasi Goreng");
      System.out.println("2. Mie Ayam");
      System.out.println("3. Burger");
      System.out.print("Pilih menu makanan (1/2/3): ");
      
      int menuMakanan = input.nextInt();  // Input pilihan menu makanan

      // Menampilkan hasil pilihan menu makanan
      switch (menuMakanan) {
        case 1:
          System.out.println("Kamu Memilih Nasi Goreng");
          break;
        case 2:
          System.out.println("Kamu Memilih Mie Ayam");
          break;
        case 3:
          System.out.println("Kamu Memilih Burger");
          break;
        default:
          System.out.println("Menu tidak tersedia");
          break;
      }
      
    } else if (pilihan == 2) {
      System.out.println("Kamu Memilih Minuman");
      // Menampilkan menu minuman setelah memilih Minuman
      System.out.println("=== Menu Minuman ===");
      System.out.println("1. Es Teh");
      System.out.println("2. Jus Jeruk");
      System.out.println("3. Kopi");
      System.out.print("Pilih menu minuman (1/2/3): ");
      
      int menuMinuman = input.nextInt();  // Input pilihan menu minuman

      // Menampilkan hasil pilihan menu minuman
      switch (menuMinuman) {
        case 1:
          System.out.println("Kamu Memilih Es Teh");
          break;
        case 2:
          System.out.println("Kamu Memilih Jus Jeruk");
          break;
        case 3:
          System.out.println("Kamu Memilih Kopi");
          break;
        default:
          System.out.println("Menu tidak tersedia");
          break;
      }
    } else {
      System.out.println("Pilihan tidak tersedia");
    }

    // Kombinasi dengan switch
    System.out.println("\n=== Menggunakan switch ===");
    switch (pilihan) {
      case 1:
        System.out.println("Kamu Memilih Makanan");
        // Menampilkan menu makanan setelah memilih Makanan
        System.out.println("=== Menu Makanan ===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Ayam");
        System.out.println("3. Burger");
        System.out.print("Pilih menu makanan (1/2/3): ");
        
        int menuMakanan = input.nextInt();  // Input pilihan menu makanan

        // Menampilkan hasil pilihan menu makanan
        switch (menuMakanan) {
          case 1:
            System.out.println("Kamu Memilih Nasi Goreng");
            break;
          case 2:
            System.out.println("Kamu Memilih Mie Ayam");
            break;
          case 3:
            System.out.println("Kamu Memilih Burger");
            break;
          default:
            System.out.println("Menu tidak tersedia");
            break;
        }
        break;
      case 2:
        System.out.println("Kamu Memilih Minuman");
        // Menampilkan menu minuman setelah memilih Minuman
        System.out.println("=== Menu Minuman ===");
        System.out.println("1. Es Teh");
        System.out.println("2. Jus Jeruk");
        System.out.println("3. Kopi");
        System.out.print("Pilih menu minuman (1/2/3): ");
        
        int menuMinuman = input.nextInt();  // Input pilihan menu minuman

        // Menampilkan hasil pilihan menu minuman
        switch (menuMinuman) {
          case 1:
            System.out.println("Kamu Memilih Es Teh");
            break;
          case 2:
            System.out.println("Kamu Memilih Jus Jeruk");
            break;
          case 3:
            System.out.println("Kamu Memilih Kopi");
            break;
          default:
            System.out.println("Menu tidak tersedia");
            break;
        }
        break;
      default:
        System.out.println("Pilihan tidak tersedia");
        break;
    }
  }
}
package latihan7;

import java.util.Scanner;

public class latihan7 {
  public static void main(String[] args) {
  
       Scanner input = new Scanner (System.in);{

       System.out.println(" ==kombinasi if else == ");
       System.out.println("=== Pilihan ===");
       System.out.println("1. Makanan");
       System.out.println("2. Minuman");
       System.out.println("Pilih (Makanan/Minum):");
       
       int pilihan = input.nextInt();

       if (pilihan == 1) {
         System.out.println("Kamu Memilih Makanan");
      }else if (pilihan == 2) {
         System.out.println("Kamu memilih Minuman");
      } else {
         System.out.println("Pilihan tidak tersedia");
      }
    }    
  }
}

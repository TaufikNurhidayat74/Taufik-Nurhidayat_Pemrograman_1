package DataMahasiswa;

import java.util.Scanner;

public class DataMahasiswa {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String nama;
        String nim;

        System.out.print("Masukkan Nama: "); //input masukan naama
        nama = input.nextLine();
        System.out.print("Masukkan NIM: ");  //input masukan nim
        nim = input.nextLine();

        System.out.println("Nama: " + nama);  //hasil nama
        System.out.println("NIM: " + nim);   //hasil nim
    }
}
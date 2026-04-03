package latihan3;
//menambahkan opsi melihat data yg sudah di tambahkan
import java.util.Scanner;

public class latihan3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nama;
        String nim;
        String programStudi;
        int umur;
        String gender;
        String reguler;
        String pilihan;

        // Input data mahasiswa
        System.out.print("Input Nama: ");
        nama = input.nextLine();

        System.out.print("Input NIM: ");
        nim = input.nextLine();

        System.out.print("Input Program Studi: ");
        programStudi = input.nextLine();

        System.out.print("Input Umur: ");
        while (true) {
            try {
                umur = Integer.parseInt(input.nextLine());
                if (umur <= 0) {
                    System.out.print("Umur harus lebih dari 0. Input ulang: ");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.print("Input tidak valid. Masukkan angka untuk umur: ");
            }
        }

        System.out.print("Input Gender (L/P): ");
        gender = input.nextLine().toUpperCase();
        while (!gender.equals("L") && !gender.equals("P")) {
            System.out.print("Input tidak valid. Masukkan L atau P: ");
            gender = input.nextLine().toUpperCase();
        }

        System.out.print("Input Reguler (A/B/CK/CS): ");
        reguler = input.nextLine().toUpperCase();
        while (!reguler.equals("A") && !reguler.equals("B") &&
               !reguler.equals("CK") && !reguler.equals("CS")) {
            System.out.print("Input tidak valid. Masukkan A, B, CK, atau CS: ");
            reguler = input.nextLine().toUpperCase();
        }

        // Memberikan pilihan kepada pengguna
        System.out.print("Apakah Anda ingin melihat data yang telah Anda masukkan? (Y/T): ");
        pilihan = input.nextLine().toUpperCase();

        if (pilihan.equals("Y")) {
            // Menampilkan data yang telah diinputkan
            System.out.println("\nData Mahasiswa:");
            System.out.println("Nama: " + nama);
            System.out.println("NIM: " + nim);
            System.out.println("Program Studi: " + programStudi);
            System.out.println("Umur: " + umur);
            System.out.println("Gender: " + (gender.equals("L") ? "Laki-laki" : "Perempuan"));
            System.out.println("Reguler: " + reguler);
        } else {
            System.out.println("Data tidak ditampilkan.");
        }

        input.close();
    }
}
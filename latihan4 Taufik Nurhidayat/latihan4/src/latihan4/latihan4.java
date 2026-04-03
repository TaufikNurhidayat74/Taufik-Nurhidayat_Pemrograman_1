package latihan4;
//menghitung nilai total mahasiswa 
import java.util.Scanner;

public class latihan4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        float bobot_kehadiran, realisasi, bobot_tugas, uts, uas, total;

        System.out.print("Masukkan nilai Kehadiran : ");
        bobot_kehadiran = input.nextFloat();

        System.out.print("Masukkan nilai Realisasi : ");
        realisasi = input.nextFloat();

        System.out.print("Masukkan nilai Tugas     : ");
        bobot_tugas = input.nextFloat();

        System.out.print("Masukkan nilai UTS       : ");
        uts = input.nextFloat();

        System.out.print("Masukkan nilai UAS       : ");
        uas = input.nextFloat();

        // Perhitungan
        if (realisasi != 0) {
            total = (bobot_kehadiran / realisasi * 10) + bobot_tugas + uts + uas;
            System.out.println("Total: " + total);
        } else {
            System.out.println("Realisasi tidak boleh 0!");
        }

        input.close();
    }
}
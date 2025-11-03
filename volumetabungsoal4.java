package latihanukl;
//latihan utk menghitung volume tabung
//soal sedang 4
import java.util.Scanner;
public class volumetabungsoal4 {
    static double volumeTabung(double r, double t) {
        double phi = 3.14;
        double volume = phi * r * r * t;
        return volume;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jari jari tabung (dalam cm): ");
        double jariJari = input.nextDouble();
        System.out.println("Masukkan tinggi tabung (dalam cm): ");
        double tinggi = input.nextDouble();

        double volume = volumeTabung(jariJari, tinggi);

        System.out.println("Jari jari tabung: " + jariJari + " cm");
        System.out.println("Tinggi tabung: " + tinggi + " cm");
        System.out.println("Volume tabung: " + volume + " cm^3");
        input.close();
    }
}

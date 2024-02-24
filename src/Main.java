import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama Casis: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin (L/P): ");
        String jenisKelaminInput = scanner.nextLine();
        char jenisKelamin = jenisKelaminInput.charAt(0);

        System.out.print("Masukkan data lahir (Tahun-Bulan-Hari): ");
        String dataLahirInput = scanner.nextLine();
        LocalDate dataLahir = LocalDate.parse(dataLahirInput);

        LocalDate today = LocalDate.now();
        Period period = Period.between(dataLahir, today);
        int umur = period.getYears();

        System.out.println("\n------ Output ------");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Umur: " + umur);
    }
}
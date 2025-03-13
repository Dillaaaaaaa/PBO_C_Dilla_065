
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //untuk membaca input dari pengguna

        System.out.println("Pilih login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan: "); // untuk menampilkan pilihan login
        int pilihan = scanner.nextInt(); // membaca input pilihan pengguna (1/2)
        scanner.nextLine();

        String tigaDigitNIM = "065"; // variable string validasi login admin

        if (pilihan == 1) { // untuk mengecek apakah pengguna memilih login sebagai admin
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            if (username.equals("Admin" + tigaDigitNIM) && password.equals("Password" + tigaDigitNIM)) {
                System.out.println("Login Admin berhasil!");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }

        } else if (pilihan == 2) {
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            String namaValid = "umi fadilah";
            String nimValid = "202410370110065";

            if (nama.equals(namaValid) && nim.equals(nimValid)) {
                System.out.println("Login Mahasiswa berhasil!");
                System.out.println("Nama: " + nama);
                System.out.println("NIM: " + nim);
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }

        } else {
            System.out.println("Pilihan tidak valid.");
        }
        scanner.close();
    }
}
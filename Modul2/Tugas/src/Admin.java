public class Admin { // mendefinisikan class untuk admin
    private String username; // variabel privat untuk menyimpan  data login admin
    private String password;

    public Admin(String username, String password) { //konstruktor untuk menginisialisasi objek
        this.username = username;
        this.password = password;
    }

    public void login(String inputUsername, String inputPassword) { //validasi login mahasiswa
        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Login Admin berhasil!");
        } else {
            System.out.println("Username atau password salah!");
        }
    }
}
// Class induk
class ItemPerpustakaan {
    String judul;
    int tahunTerbit;

    public ItemPerpustakaan(String judul, int tahunTerbit) {
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    public void displayInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Tahun Terbit: " + tahunTerbit);
    }
}

// Subclass Buku
class Buku extends ItemPerpustakaan {
    String pengarang;
    int jumlahHalaman;

    public Buku(String judul, int tahunTerbit, String pengarang, int jumlahHalaman) {
        super(judul, tahunTerbit);
        this.pengarang = pengarang;
        this.jumlahHalaman = jumlahHalaman;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah Halaman: " + jumlahHalaman);
    }
}

// Subclass Majalah
class Majalah extends ItemPerpustakaan {
    String edisi;
    String bulanTerbit;

    public Majalah(String judul, int tahunTerbit, String edisi, String bulanTerbit) {
        super(judul, tahunTerbit);
        this.edisi = edisi;
        this.bulanTerbit = bulanTerbit;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Edisi: " + edisi);
        System.out.println("Bulan Terbit: " + bulanTerbit);
    }
}

// Class Main
public class Main {
    public static void main(String[] args) {
        Buku buku = new Buku("Belajar Java", 2021, "Andi", 250);
        Majalah majalah = new Majalah("Tech Monthly", 2022, "Vol. 5", "Maret");

        System.out.println("Informasi Buku:");
        buku.displayInfo();
        System.out.println();

        System.out.println("Informasi Majalah:");
        majalah.displayInfo();
    }
}
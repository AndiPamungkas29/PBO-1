import java.util.Scanner;

class Main {
    //data buku
    public static String[] idBuku = new String[]{"343c-e343-2023", "e343-2023-343e", "d343-0343-2023"};
    public static String[] namaBuku = new String[]{"Laskar", "Pemrograman", "title"};
    public static String[] author = new String[]{"Rudi", "Andi", "Reza"};
    public static String[] category = new String[]{"Romance", "Alogaritma", "Sejarah"};
    public static int[] stock = new int[]{3, 2, 5};

    void menuUtama() {
        System.out.println("\n==== Perpustakaan UMM ====");
        System.out.println("1. Login sebagai siswa");
        System.out.println("2. Login sebagai admin");
        System.out.println("3. Keluar");
        System.out.print("Pilihan Anda: ");
    }

    void menuStudent() {
        System.out.println("\n==== Menu Siswa ====");
        System.out.println("1. Buku terpinjam");
        System.out.println("2. Pinjam buku");
        System.out.println("3. Keluar");
        System.out.print("Pilihan Anda: ");
    }

    void menuAdmin() {
        System.out.println("\n==== Menu Admin ====");
        System.out.println("1. Tambahkan Siswa");
        System.out.println("2. Tampilkan Siswa Yang Terdaftar");
        System.out.println("3. Keluar");
        System.out.print("Pilihan Anda: ");
    }

    void displayBook() {
        System.out.println("===========================================================================================================================================");
        System.out.println("|| No. || Id Buku\t\t\t\t || Nama Buku\t\t\t\t || Author\t\t || Category\t\t || Stock\t || ");
        for (int i = 0; i < 3; i++) {
            System.out.printf("|| %d   || %s\t\t || %s\t\t || %s\t\t|| %s\t\t || %d\t\t || \n", i, idBuku[i], namaBuku[i], author[i], category[i], stock[i]);
        }
        System.out.println("===========================================================================================================================================");
    }


    public static void main(String[] args) {
        Student student = new Student();
        Admin admin = new Admin();
        Main main = new Main();
        mainMenu:
        while (true) {
            main.menuUtama();
            Scanner scanInt = new Scanner(System.in);
            int pilih = scanInt.nextInt();
            if (pilih == 1) {
                if (student.checkStudent() == 0) {
                    continue mainMenu;
                }
                int j = 0;
                while (true) {
                    main.menuStudent();
                    pilih = scanInt.nextInt();
                    if (pilih == 1) {
                        student.bukuTerpinjam();
                    } else if (pilih == 2) {
                        main.displayBook();
                        student.pinjamBuku(j);
                        j++;
                    } else {
                        break;
                    }
                }
            } else if (pilih == 2) {
                if (admin.checkAdmin() == 0) {
                    continue mainMenu;
                }
                while (true) {
                    main.menuAdmin();
                    pilih = scanInt.nextInt();
                    int i = 0;
                    if (pilih == 1) {
                        admin.addStudent(i);
                        i++;
                    } else if (pilih == 2) {
                        admin.dispayStudent(i);
                    } else {
                        break;
                    }
                }
            } else {
                break;
            }
        }
    }
}
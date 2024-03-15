import java.util.Scanner;

class Admin {
    Student student = new Student();
    public static String userx = "admin343";
    public static String passx = "admin343";

    int checkAdmin(){
        Scanner scanString = new Scanner(System.in);
        System.out.print("Enter your username (admin): ");
        String user = scanString.nextLine();
        System.out.print("Enter your password (admin): ");
        String pass = scanString.nextLine();
        if (user.equals(userx) && pass.equals(passx)) {
            System.out.println("Berhasil login sebagai Admin\n");
            return 1;
        }
        else {
            System.out.println("Admin Not Found\n");
            return 0;
        }
    }

    void addStudent(int i){
        Scanner scanString = new Scanner(System.in);
        System.out.print("Nama mahasiswa: ");
        Student.nama[i] = scanString.nextLine();

        System.out.print("Fakultas mahasiswa: ");
        Student.fakultas[i] = scanString.nextLine();

        System.out.print("NIM mahasiswa: ");
        Student.nim[i] = scanString.nextLine();
        while(true){
            if (String.valueOf(Student.nim[i]).length() != 15 ) {
                System.out.print("Nim Harus 15 Digit!!\n");
                System.out.print("NIM mahasiswa: ");
                student.nim[i] = scanString.nextLine();
            } else {
                break;
            }
        }

        System.out.print("Jurusan mahasiswa: ");
        Student.prodi[i] = scanString.nextLine();

        System.out.print("Data Mahasiswa berhasil ditambahkan.\n");
    }

    void dispayStudent(int i){
        System.out.println("Data mahasiswa ke " + (i+1));
        System.out.println("Nama: " + Student.nama[i]);
        System.out.println("Fakultas: " + Student.fakultas[i]);
        System.out.println("nim: " + Student.nim[i]);
        System.out.println("prodi: " + Student.prodi[i]);
    }

}


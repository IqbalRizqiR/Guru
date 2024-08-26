
import java.util.Scanner;

public class GuruDriver {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();
        System.out.print("Masukkan Mapel : ");
        String mapel = input.nextLine();
        System.out.print("Masukkan Status : ");
        String status = input.nextLine();
        System.out.print("Masukkan NIP : ");
        int nip = input.nextInt();

        Guru guru = new Guru(nip, nama, mapel, status);
        System.out.println("--------");
        guru.print();
        System.out.println("--------");
    }
}


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


        // Contoh nya
        Guru coba = new Guru();
        coba.setNama(nama);
        coba.setMapel(mapel);
        coba.setStatus(status);
        coba.setNip(nip);
        System.out.println("--------");
        coba.print();
        System.out.println("--------");

        Guru guru = new Guru(nip, nama, mapel, status);
        System.out.println("--------");
        guru.print();
        System.out.println("--------");
        Guru buPasha = new Guru(2232, "Pasha", "Produktif", "Tetap");
        Guru pakIlham = new Guru(3329, "Ilham", "Produktif", "Full-Time");
        Guru pakFirdausa = new Guru(4427, "Firdausa", "Produktif", "Full-Time");
        Guru pakThoriq = new Guru(5813, "Thoriq", "Olahraga", "Full-Time");
        buPasha.print();
        System.out.println("--------");
        pakIlham.print();
        System.out.println("--------");
        pakFirdausa.print();
        System.out.println("--------");
        pakThoriq.print();
    }
}

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class No4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<mahasiswa> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(new mahasiswa(2212341, "Sakura Pertiwi", "TIFRM22A", 160722));
        mahasiswaList.add(new mahasiswa(2212342, "Jessica Hariyah", "TIFRM22A", 160722));
        mahasiswaList.add(new mahasiswa(2212343, "Latif Hidayanto", "TIFRM22A", 160722));
        mahasiswaList.add(new mahasiswa(2212344, "Syahrini Usamah", "TIFRM22A", 160722));
        mahasiswaList.add(new mahasiswa(2212345, "Puput Laksmiwati", "TIFRM22A", 160722));

        Scanner valueId = new Scanner(System.in);
        Scanner valueName = new Scanner(System.in);
        Scanner valueKelas = new Scanner(System.in);
        Scanner valueTanggal = new Scanner(System.in);
        Scanner value = new Scanner(System.in);
        System.out.println("Masukan Data Mahasiswa Untuk Ditambahkan");
        System.out.print("Masukan Id Mahasiswa : ");
        int id = valueId.nextInt();
        System.out.print("Masukan Nama Mahasiswa : ");
        String name = valueName.nextLine();
        System.out.print("Masukan Kelas Mahasiswa : ");
        String kelas = valueKelas.nextLine();
        System.out.print("Masukan Tanggal : ");
        int tanggal = valueTanggal.nextInt();

        mahasiswaList.add(new Mahasiswa(id, name, kelas, tanggal));

        mahasiswaList.forEach(mahasiswa -> System.out.println(mahasiswa.toString()));

        System.out.println("Masukan Data Mahasiswa Untuk Dihapus");
        System.out.print("Masukan Nama Mahasiswa : ");
        String nameRemove = value.nextLine();
        mahasiswaList.removeIf(mahasiswa -> mahasiswa.getName().contains(nameRemove));
        mahasiswaList.forEach(mahasiswa -> System.out.println(mahasiswa.toString()));

    }

}
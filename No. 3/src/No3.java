import java.util.ArrayList;
import java.util.List;

public class No3 {

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

        mahasiswaList.forEach(mahasiswa -> System.out.println(mahasiswa.toString()));
        System.out.println("Panjang Data Mahasiswa -> " + mahasiswaList.size());
        mahasiswaList.remove(0);

        mahasiswaList.forEach(mahasiswa -> System.out.println(mahasiswa.toString()));
        System.out.println("Panjang Data Mahasiswa -> " + mahasiswaList.size());
    }

}
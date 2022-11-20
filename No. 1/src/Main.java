public class Main {
    public static void main(String[] args) {
        int[] angka = { 23, 50, 34, 78, 90, 1, 34, 56, 99, 16, 7, 79, 19, 76, 55 };

        System.out.print("Bilangan Genap  :  ");
        for (int i = 0; i < angka.length; i++){
            if (angka [i] % 2 == 0) {
                System.out.print(angka[i] + " ");
            }
        }
        System.out.println("");
        System.out.print("Bilangan Ganjil :  ");
        for (int i = 0; i < angka.length; i++){
            if (angka [i] % 2!= 0){
                System.out.print(angka[i] + " ");
            }
        }
        System.out.println("");
    }
}

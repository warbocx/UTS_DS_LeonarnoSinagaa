import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] nilai = new int[10];

        Scanner inputangka = new Scanner(System.in);

        System.out.println("Input Angka untuk diurutkan");

        for (int i = 0; i < nilai.length; i++) {
                System.out.print("Input Angka ke-" + (i + 1) + " : ");
                nilai[i] = inputangka.nextInt();
        }
        bubbleSort(nilai);
        System.out.println("Urutan Angka : " + Arrays.toString(nilai));
        }

        static void bubbleSort(int array[]) {
            int size = array.length;

            for (int i = 0; i < size - 1; i++) {
                for (int j = 0; j < size - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }

    }
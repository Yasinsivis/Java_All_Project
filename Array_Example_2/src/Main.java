import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //0 dan büyük ama dizideki en küçük sayıyı bulan metot
    public static int minFind(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        System.out.println("Lütfen Bir Sayı Giriniz:");
        int number = scanner.nextInt();
        int[] max = new int[8];
        int[] min = new int[8];
        int[] maxControl = new int[8];
        int[] minControl = new int[8];
        int controlMin = 0;
        int controlMax = 0;

        //Min Değerini bulmak için oluşturduğumuz algoritma
        for (int i = 0; i < list.length; i++) {
            if (number > list[i]) {
                min[i] = list[i];
                for (int j = 0; j < min.length; j++) {
                    minControl[j] = number - min[j];
                }
            }
        }
        
        for (int k = 0; k < list.length; k++) {
            if (number < list[k]) {
                max[k] = list[k];
                for (int m = 0; m < max.length; m++) {
                    maxControl[m] = max[m] - number;
                }
            }
        }


        controlMax = minFind(maxControl) + number;
        controlMin = number - minFind(minControl);

        System.out.println("Girilen Sayıya Yakın En Küçük Sayı:" + controlMin);
        System.out.println("Girilen Sayıya Yakın En Büyük Sayı:" + controlMax);


    }
}
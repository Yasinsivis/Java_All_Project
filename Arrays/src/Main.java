//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static int[] reverse(int[] arr){
        int[] reverse = new int[arr.length];
        for (int i=0,j= arr.length - 1; i< arr.length;  i++ , j--){
            reverse[i]=arr[j];
        }
        return reverse;
    }

    public static void main(String[] args) {
        int[] list = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] newList=reverse(list);
        printArray(newList);

    }
}

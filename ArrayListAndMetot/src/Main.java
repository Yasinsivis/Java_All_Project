//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
      int[] liste = {1,2,3,4};
      HelperArray helper = new HelperArray();
      helper.print(liste);
        System.out.println(Arrays.toString(liste)); //Static bir metot oluşturmadan da oluşturabiliriz. Arraylar hazır metotlar ile yapılabilir.
    }
}
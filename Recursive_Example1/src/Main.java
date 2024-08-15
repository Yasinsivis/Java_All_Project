import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
   static Scanner scanner = new Scanner(System.in);

    public static int  GetNumbers(int Base, int Power){
        int  result=0;
        for(int i=1; i<=Power; i++)
        {
            result = (Base*Base)*Base;
        }
        return result;

    }
    public static void main(String[] args) {
        //Tanımlar
        int Taban=0 ,Us=0 , result=0;

        System.out.println("Lütfen Taban Değerini Giriniz:");
        Taban = scanner.nextInt();
        System.out.println("Lütfen Üs Değerini Giriniz: ");
        Us= scanner.nextInt();

        result=GetNumbers(Taban,Us);
        System.out.println("İşlem Sonucu:"+result);
    }
}
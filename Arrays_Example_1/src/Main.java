//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     double[] liste = {1.0 , 2.0 , 3.0 , 4.0 , 5.0};
     double sum=0.0;
     for(int i=0; i< liste.length; i++){
         sum+=1.0/liste;
     }
     double hermonic = liste.length/sum;
        System.out.println(hermonic);
    }
}
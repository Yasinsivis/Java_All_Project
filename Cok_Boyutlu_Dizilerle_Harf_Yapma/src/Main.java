//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[][] Letter = new String[6][4];
        for (int i = 0; i < Letter.length; i++) {
            for (int j = 0; j < Letter[i].length; j++) {
                if ((i == 0 || i == 3) || i == 5) {
                    Letter[i][j] = " * ";
                } else if (j == 0 || j == 5) {
                    Letter[i][j] = " * ";
                } else {
                    Letter[i][j] = "   ";
                }
            }
        }
        for (String[] row : Letter) {
            for (String col : row) {
                System.out.println(col);
            }
            System.out.println();
        }
    }
}
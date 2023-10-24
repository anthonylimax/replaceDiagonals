import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        matriz = MatrizConstructor(matriz);
        showMatriz(matriz);
        matriz = alternMatriz(matriz);
        System.out.println("\n");
        showMatriz(matriz);
    }
    public static int[][] alternMatriz(int[][] matriz){
        int[] MainDiagonal = new int[matriz[0].length];
        int[] SecondDiagonal = new int[matriz[0].length];
        for(int i = 0; i < matriz[0].length; i++){
            MainDiagonal[i] = matriz[i][i];
        }
        int counter = 0;
        for(int i = matriz[0].length - 1; i >= 0 ; i--){
            SecondDiagonal[counter] = matriz[i][counter];
            matriz[i][counter] = MainDiagonal[counter];
            counter++;
        }
        for(int i = 0; i < matriz[0].length; i++){
            matriz[i][i] = SecondDiagonal[i];
        }
        return matriz;



    }

    public static void showMatriz(int[][] matriz){
        for (int[] element : matriz) {
            for (int number : element){
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    public static int[][] MatrizConstructor(int[][] matriz){
        Random r = new Random();
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                matriz[i][j] = r.nextInt(1, 10);
            }
        }
        return matriz;
    }

}

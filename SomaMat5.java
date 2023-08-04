import java.util.Scanner;
public class SomaMat5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int linha, coluna, num =0,soma = 0;
        linha = scan.nextInt();
        coluna =scan.nextInt();
        int[][] matrizNumeros = new int[linha][coluna];
        for(int i = 0;i<linha;i++){
            for(int j = 0; j<coluna;j++){
                num  = scan.nextInt();
                matrizNumeros[i][j] = num;
            }
        }
        for(int k = 0; k<linha; k++){
            for(int l = 0; l<coluna; l++){
                soma = soma + matrizNumeros[k][l];
            }
        }
        System.out.println("Somatorio da Matriz: " + soma);

    }
}

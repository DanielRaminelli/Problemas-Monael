import java.util.Scanner;
public class SomaVet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, num = 0,soma = 0;
        n = scan.nextInt();
        if(n ==0){
            return;
        }
        int[] listaNum = new int[n];

        for(int i = 0; i < n; i++){
            num = scan.nextInt();
            listaNum[i] = num;
        }
        for(int j = 0; j<n;j++){
            soma += listaNum[j];
        }
        System.out.println(soma);
    }
}

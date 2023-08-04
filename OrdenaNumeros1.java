import java.util.Scanner;
import java.util.Arrays;
public class OrdenaNumeros1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int repet,num,j = 0;
        repet = scan.nextInt();
        if(repet == 0){
            System.exit(0);
        }
        int[] listaValores = new int[repet];
        for(int i = 0; i<listaValores.length;i++){
            num = scan.nextInt();
            listaValores[i] = num;
        }
        Arrays.sort(listaValores);

        for( j= 0 ;j<listaValores.length - 1;j ++){
            System.out.print(listaValores[j] + " ");
        }    
        System.out.println(listaValores[j]);
    }
}
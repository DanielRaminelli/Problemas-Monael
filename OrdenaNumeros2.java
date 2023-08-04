import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
public class OrdenaNumeros2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int repet,num,j = 0,cont = 0;
        repet = scan.nextInt();
        if(repet == 0){
            System.exit(0);
        }
        int[] listaValores = new int[repet];
        int[] listaInversa = new int[repet];
        for(int i = 0; i<listaValores.length;i++){
            num = scan.nextInt();
            listaValores[i] = num;
        }
        Arrays.sort(listaValores);
                
        for(int k = repet - 1; k >= 0; k-- ){
            listaInversa[cont] = listaValores[k];
            cont++;
        }

        for(j= 0 ;j<listaInversa.length - 1;j ++){
            System.out.print(listaInversa[j] + " ");
        }    
        System.out.println(listaInversa[j]);
    }
}

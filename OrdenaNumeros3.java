import java.util.Arrays;
import java.util.Scanner;

public class OrdenaNumeros3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int repet,num,j = 0,cont = 0;
        String ordem;
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
        ordem = scan.next();
        if(ordem.equals("crescente")){

            Arrays.sort(listaValores);

            for( j= 0 ;j<listaValores.length - 1;j ++){
                System.out.print(listaValores[j] + " ");
            }    
            System.out.println(listaValores[j]);
        }else if(ordem.equals("decrescente")){
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

}


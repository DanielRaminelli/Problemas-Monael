import java.util.Scanner;
public class Procon {
    public static void main(String[] args) {
        int a = 0;
        double p,p2,i=0,j=0,b,c = 98,d=100;
        Scanner myObj = new Scanner(System.in);
        a = myObj.nextInt();
        while(a != 0){
            if(a > 58){
                j++;
            }
            i++;
            a = myObj.nextInt();
        }

        p = (c/d)*i;
        if(j >= p){
            System.out.println("Lote Aprovado");
        }else{
            System.out.println("Lote Rejeitado");
        }
    }
}

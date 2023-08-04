import java.util.Scanner;
import java.util.Arrays;
public class Achei {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numDeNumeros,numeroDeTestes,teste;
        boolean testador = true;
        numDeNumeros = scan.nextInt();
        int[]arrayDeNumeros = new int[numDeNumeros];
        for(int i = 0; i<numDeNumeros;i++){
            if(scan.hasNext()){
                arrayDeNumeros[i] = scan.nextInt();
            }            
        }
        numeroDeTestes = scan.nextInt();
        int[]arrayDeTestes = new int[numeroDeTestes];
        for(int tester :arrayDeTestes){
            teste = scan.nextInt();
        }
    


    }
    
}

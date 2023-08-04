import java.util.Scanner;
import java.util.ArrayList;

public class Discagem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String numero = "",numeroFinal2="",numeroFinal3 = "";
        String[] separado = new String[2];
        int i = 0;
        ArrayList<String>numeroFinal = new ArrayList<>();
        ArrayList<String>listaDeNumeros = new ArrayList<>();
        while(scan.hasNext()){
            numero = scan.nextLine();
            separado = numero.split("-");
            char[]separado2 = separado[1].toCharArray();
            for(char letra:separado2){
                if(letra == 'A'||letra == 'B'||letra == 'C'){
                    numeroFinal.add(i,"2");
                }
                else if(letra == 'D'||letra == 'E'||letra == 'F'){
                    numeroFinal.add(i,"3");
                }
                else if(letra == 'G'||letra == 'H'||letra == 'I'){
                    numeroFinal.add(i,"4");
                }
                else if(letra == 'J'||letra == 'K'||letra == 'L'){
                    numeroFinal.add(i,"5");
                }
                else if(letra == 'M'||letra == 'N'||letra == 'O'){
                    numeroFinal.add(i,"6");
                }
                else if(letra == 'P'||letra == 'Q'||letra == 'R' || letra == 'S'){
                    numeroFinal.add(i,"7");
                }
                else if(letra == 'T'||letra == 'U'||letra == 'V'){
                    numeroFinal.add(i,"8");
                }
                else if(letra == 'W'||letra == 'X'||letra == 'Y'||letra == 'Z'){
                    numeroFinal.add(i,"9");
                }
            }
            for(String letra2:numeroFinal){
                numeroFinal2 = numeroFinal2 + letra2;
            }
            numeroFinal3 = separado[0] + numeroFinal2;
            listaDeNumeros.add(numeroFinal3);
            numeroFinal.clear();
            numeroFinal2 = "";
            numeroFinal3 = "";

        }
        for(String numbers:listaDeNumeros){
            System.out.println(numbers);
        }
        scan.close();
        

    }
}

import java.util.Scanner;
public class Procon2 {
    public static void main(String[] args) {

        int qtd,qtdMaior = 0, total = 0;

        Scanner scan = new Scanner(System.in);
        qtd = scan.nextInt();
        while(qtd != 0)
        {
            if(qtd > 58)
            {
                qtdMaior++;
            }
            total++;
            qtd = scan.nextInt();
        }
        if((qtdMaior*100.f)/total >= 98.f){
            System.out.println("Lote Aprovado");
        }else{
            System.out.println("Lote Rejeitado");
        }

    }
}

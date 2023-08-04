import java.util.Scanner;

public class Citacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        nome = scan.nextLine();
        System.out.println(obterCitacao(nome));

    }public static String obterCitacao(String nome){
        String abrev = "", cit = "";
        int i;
        boolean primeira = true;
        for (i = 0; i < nome.length(); i++) {
            if(nome.charAt(i) == ' '){
                if(primeira){
                    abrev = abrev + cit.charAt(0);
                    primeira = false;
                }else{
                     abrev = abrev + ". " + cit.charAt(0);
                }
                cit ="";
            }else{
                cit = cit + nome.charAt(i);
            }
        }return cit + ", " + abrev + ". ";
    }
}

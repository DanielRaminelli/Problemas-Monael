import java.util.Scanner;
public class Jokenpo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0,i=0;
        String jog1,jog2;
        n = scan.nextInt();
        for(i=0;i<n;i++){
            jog1 = scan.next();
            jog2 = scan.next();
            System.out.println(juizJokenpo(jog1,jog2));
        }

    }public static String juizJokenpo(String j1, String j2) {
        if(j1.compareTo("pedra")==0 && j2.compareTo("tesoura") == 0|| j1.compareTo("tesoura")==0 && j2.compareTo("papel") == 0 || j1.compareTo("papel")==0 && j2.compareTo("pedra")== 0 ){
            return "jogador 1";
        }else if (j2.compareTo("pedra")== 0 && j1.compareTo("tesoura")== 0 || j2.compareTo("tesoura")==0 && j1.compareTo("papel") == 0|| j2.compareTo("papel")==0 && j1.compareTo("pedra")==0){
            return "jogador 2";
        }else{
            return "empate";
        } 
    }
}

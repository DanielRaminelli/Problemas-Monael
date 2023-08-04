import java.util.Scanner;
public class AbaixoDaMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numAlunos,contador=0;
        numAlunos = scan.nextInt();
        float[][] matrizAlunos = new float[numAlunos][3];
        float notaAluno,soma=0,divisor;
        for(int i = 0;i<numAlunos;i++){
            for(int j = 0; j<3;j++){
                notaAluno = scan.nextFloat();
                matrizAlunos[i][j] = notaAluno;
            }
        }

        for(int i = 0;i<3;i++){
            soma = 0;
            for(int j = 0; j<numAlunos;j++){
                soma = soma + matrizAlunos[j][i];
            }
            divisor = soma/numAlunos;
            contador = 0;
            for(int k  = 0;k<numAlunos;k++){
                if(matrizAlunos[k][i]< divisor){
                    contador++;
                }
            }
            System.out.println("Na "+ (i+1)  + "a. atividade " + contador+" alunos tiveram nota abaixo da media.");
        }

    }
    
}
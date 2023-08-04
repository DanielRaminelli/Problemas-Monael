import java.util.Scanner;

public class Xopi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        for (int i = 0; i < n; i++) {
            String nomeModificado = scanner.nextLine();
            String sobrenomeModificado = scanner.nextLine();

            String nomeOriginal = reconstruirNomeOriginal(nomeModificado);
            String sobrenomeOriginal = reconstruirSobrenomeOriginal(sobrenomeModificado);

            System.out.println(nomeOriginal + " " + sobrenomeOriginal);
        }
    }

    private static String reconstruirNomeOriginal(String nomeModificado) {
        StringBuilder nomeOriginal = new StringBuilder();

        for (int i = 0; i < nomeModificado.length(); i += 2) {
            nomeOriginal.append(nomeModificado.charAt(i));
        }

        return nomeOriginal.toString();
    }

    private static String reconstruirSobrenomeOriginal(String sobrenomeModificado) {
        StringBuilder sobrenomeOriginal = new StringBuilder();

        for (int i = 1; i < sobrenomeModificado.length(); i += 2) {
            sobrenomeOriginal.append(sobrenomeModificado.charAt(i));
        }

        return sobrenomeOriginal.toString();
    }
}

import java.util.Scanner;

public class Cobol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] words = line.split("-");
            
            boolean hasCOBOL = false;
            for (String word : words) {
                char firstChar = Character.toUpperCase(word.charAt(0));
                char lastChar = Character.toUpperCase(word.charAt(word.length() - 1));
                
                if ((firstChar == 'C' || firstChar == 'c') && (lastChar == 'L' || lastChar == 'l')) {
                    hasCOBOL = true;
                    break;
                }
            }
            
            if (hasCOBOL) {
                System.out.println("GRACE HOPPER");
            } else {
                System.out.println("BUG");
            }
        }
        
        scanner.close();
    }
}

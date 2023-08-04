import java.util.Scanner;

public class EliminaVogais
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String palavra;

        while (scan.hasNext())
        {
            palavra = scan.next();
            System.out.println(contaVogais(palavra) + " " + eliminaVogais(palavra));
        }


    }

    public static int contaVogais(String s)
    {
        int i, qtd =0;
        for(i=0; i<s.length(); i++)
        {
            if(ehVogal(s.charAt(i)))
            {
                qtd = qtd + 1;
            }
        }
        return qtd;
    }

    public static String eliminaVogais(String s)
    {
        String strRet = "";
        int i;

        for(i=0; i<s.length(); i++)
        {
            if(!ehVogal(s.charAt(i)))
            {
                strRet = strRet + s.charAt(i);
            }
        }
        return strRet;
    }

    public static boolean ehVogal(char c)
    {
        return Character.toUpperCase(c) == 'A' || Character.toUpperCase(c) == 'E' || Character.toUpperCase(c) == 'I' || Character.toUpperCase(c) == 'O' || Character.toUpperCase(c) == 'U';
    }


}
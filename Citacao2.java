import java.util.Scanner;

public class Citacao2 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String cit="", abrev="", str;

        int i;
        boolean primeiro = true;

        str = scan.nextLine();

        for(i=0; i<str.length();i++)
        {
            if(str.charAt(i) == ' ')
            {   
                if(primeiro)
                {
                    abrev = abrev + cit.charAt(0);
                    primeiro = false;
                }
                else
                {
                    abrev = abrev + ". " + cit.charAt(0);
                }
                cit = "";
            }
            else
            {
                cit = cit + str.charAt(i);
            }
        }

        System.out.println(cit + ", " + abrev + ".");

    }
}
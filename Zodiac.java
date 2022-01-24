import java.util.InputMismatchException;
import java.util.Scanner;

public class Zodiac {
    public static void main(String[] args)
    {
        String[] zodiacArr = new String[]{"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep"};
        Scanner input = new Scanner(System.in);
        int year;
        boolean flag = false;
        System.out.print("Please enter the year: ");
        while(!flag)
        {
            try
            {
                flag = true;
                year = input.nextInt();
                System.out.println(zodiacArr[year%12]);
            }
            catch(InputMismatchException e)
            {
                flag = false;
                input.nextLine();
                System.out.println("Enter a positive integer.");
            }
        }
    }
}

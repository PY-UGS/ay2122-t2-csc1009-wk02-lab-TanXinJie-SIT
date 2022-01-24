import java.util.Scanner;

public class AverageTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        float[] floatValue = new float[3];
        System.out.print("Enter three numbers: ");
        floatValue[0] = input.nextFloat();
        floatValue[1] = input.nextFloat();
        floatValue[2] = input.nextFloat();
        float sum = 0;
        for (float i : floatValue)
        {
            sum += i;
        }
        float avg = sum / floatValue.length;
        System.out.print("The average of ");
        for (float i : floatValue)
        {
            System.out.print(i + " ");
        }
        System.out.println("is " + avg);
    }
}

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        int celciusTemp;
        int convertedCToF;

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the degrees in Celsius: ");
        if(in.hasNextInt())
        {
            celciusTemp = in.nextInt();
            convertedCToF = (celciusTemp * 9/5) + 32;
            System.out.println(convertedCToF + " fahrenheit!");
        }
        else {
            System.out.println("Bad input");
        }
        }

    }
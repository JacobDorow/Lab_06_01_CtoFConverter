import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        double celciusTemp;
        double convertedCToF;

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the degrees in Celsius: ");
        if(in.hasNextDouble())
        {
            celciusTemp = in.nextDouble();
            convertedCToF = (celciusTemp * 9/5) + 32;
            System.out.println(convertedCToF + " Fahrenheit!");
            in.nextLine();
        }
        else {
            System.out.println("Bad input");
            System.exit(0);
        }
        }

    }
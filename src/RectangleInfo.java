import java.sql.SQLOutput;
import java.util.Scanner;

public class RectangleInfo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double length = 0.0;
        double width = 0.0;
        double area = 0.0;
        double perimeter = 0.0;
        double hypotenuse = 0.0;
        boolean done = false;
        String trash = " ";



        do
        {
            System.out.print("Enter the width: ");
            if(in.hasNextDouble())
            {
                width = in.nextDouble();
                in.nextLine();
                if(width <= 0)
                {
                    System.out.println("Width needs to be greater than 0");
                }else
                {
                    done = true;
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Illegal number: " + trash + " please entre a valid input");
            }
        }while(!done);

        done = false;

        do
        {
            System.out.print("Enter the length: ");
            if(in.hasNextDouble())
            {
                length = in.nextDouble();
                in.nextLine();
                if(length <= 0)
                {
                    System.out.println("Length needs to be greater than 0");
                }else
                {
                    done = true;
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Illegal number: " + trash + " please entre a valid input");
            }
        }while(!done);

        area = length * width;
        perimeter = 2 * (length * width);
        hypotenuse = Math.sqrt(length*length + width*width);

        System.out.printf("For a rectangle with a length %.2f and width %.2f%n ", length, width);
        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Perimeter: %.2f%n", perimeter);
        System.out.printf("Hypotenuse: %.2f%n", hypotenuse);
    }
}

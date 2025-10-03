import java.util.Scanner;

public class FuelCosts
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double tankSize = 0.0; //size of the tank in gallons
        double mpg = 0.0;     //miles per gallon
        double pricePerGal = 0.0;   // price per gallon
        double miles100Cost = 0.0; // cost to drive 100 miles
        double fullTankDistance = 0.0; // distance on a full tank

        boolean done = false;
        String trash = " ";

        do {
            System.out.print("Enter the size of the gas tank in gallons: ");
            if(in.hasNextDouble())
            {
                tankSize = in.nextDouble();
                in.nextLine(); // clear the newline from the buffer
                if (tankSize <= 0)
                {
                    System.out.println("Tank size must be greater than 0. Please re-enter.");
                } else
                {
                    done = true;
                }
            }
            else // Not a number
            {
                trash = in.nextLine();
                System.out.println("Illegal number: " + trash + "Please enter a valid number.");
            }
        } while (!done);

        done = false; // reset for next input

        do {
            System.out.print("Enter the size of the miles per gallon: ");
            if(in.hasNextDouble())
            {
                mpg = in.nextDouble();
                in.nextLine(); // clear the newline from the buffer
                if (mpg <= 0)
                {
                    System.out.println("MPG must be greater than 0. Please re-enter.");
                } else
                {
                    done = true;
                }
            }
            else // Not a number
            {
                trash = in.nextLine();
                System.out.println("Illegal number: " + trash + "Please enter a valid number.");
            }
        } while (!done);

        done = false; // reset for next input

        do {
            System.out.print("Enter the price per gallon: ");
            if(in.hasNextDouble())
            {
                pricePerGal = in.nextDouble();
                in.nextLine(); // clear the newline from the buffer
                if (pricePerGal <= 0)
                {
                    System.out.println("Price per gallon must be greater than 0. Please re-enter.");
                } else
                {
                    done = true;
                }
            }
            else // Not a number
            {
                trash = in.nextLine();
                System.out.println("Illegal number: " + trash + "Please enter a valid number.");
            }
        } while (!done);

//        double miles100Cost = 0.0; // cost to drive 100 miles
//        double fullTankDistance = 0.0; // distance on a full tank

        miles100Cost = (100 / mpg) * pricePerGal;
        fullTankDistance = tankSize * mpg;

        System.out.printf("The cost to drive 100 miles is $%.2f\n", miles100Cost);
        System.out.printf("The distance on a full tank is %.2f miles\n", fullTankDistance);





    }
}

import java.util.Random;
import java.util.Scanner;

public class HighLow
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int targetNum = 0;
        int guessNum = 0;

        targetNum = rand.nextInt(10) + 1;
        boolean done = false;
        String trash = " ";

        do
        {
            System.out.print("Enter a guess 1-10: ");
            if (in.hasNextInt())
            {
                guessNum = in.nextInt();
                in.nextLine();

                if (guessNum < 1 || guessNum > 10)
                {
                    System.out.println("Your number is outside of the range");
                } else if (guessNum < targetNum)
                {
                    System.out.println("Too low. Target is " + targetNum);
                } else if (guessNum > targetNum)
                {
                    System.out.println("Too high. Target is " + targetNum);
                } else
                {
                    System.out.println("Congrats you got it correct, you guessed " + targetNum + " correctly");
                    done = true;
                }
            }
            else
            {
                trash =  in.nextLine();
                System.out.println("Enter a valid input");
            }
        }while(!done);
    }

}

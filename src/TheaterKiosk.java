import java.util.Scanner;

public class TheaterKiosk {
    void main()
    {

        Scanner in = new Scanner(System.in);

        int age = 0;
        final int AGE_Cut_OFF = 21;
        String trash = "";

        IO.print("Enter your age, Must be 21 to see this film!: ");
        if (in.hasNextInt()) //tells if safe
        {
            age = in.nextInt();
            in.nextLine();

            if (age >= AGE_Cut_OFF) {
                IO.println("You get a wrist band!");
            } else {
                IO.println("You are too young for this film!");
            }
        }
        else
    {
            trash = in.nextLine(); //if not safe
            IO.println("You must enter a valid age not: " + trash);
        }
    }
}

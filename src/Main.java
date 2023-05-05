import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner enter = new Scanner(System.in);

        System.out.print("Please enter you name: ");
        String name = enter.nextLine();
        System.out.println("You name is: " + "Pavel");
        System.out.print("Please enter you surname: ");
        String surname = enter.nextLine();
        System.out.println("You surname is: " + "Firsov");
        System.out.print("Please enter you age: ");
        String age = enter.nextLine();
        System.out.println("You age is: " + "37");
        System.out.print("Please enter you height: ");
        String height = enter.nextLine();
        System.out.println("You height is: " + "180");
        System.out.print("Please enter you weight: ");
        String weight = enter.nextLine();
        System.out.println("You weight is: " + "79");


    }
}
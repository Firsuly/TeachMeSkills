import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        getMonthNumber();
    }
    public static void getMonthNumber() {
        Scanner count = new Scanner(System.in);

        System.out.print("Please enter month number: ");

        int month = count.nextInt();

        System.out.print("You season is: ");

        switch (month) {
            case 12: case 1: case 2:
                System.out.println("winter");

                break; case 3: case 4: case 5:
                System.out.println("spring");

                break; case 6: case 7: case 8:
                System.out.println("summer");

                break; case 9: case 10: case 11:
                System.out.println("autumn");
                break;
            default:
                System.out.println("This is unknown month... ");
                break;
        }


    }
}
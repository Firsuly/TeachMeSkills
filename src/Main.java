import java.util.Scanner;

class Main {
    public static void main(String[] args) { // Функции пульта управления

        //getPersonalData();
        //convertToChar();
        getMassIndex();
    }

    public static void getPersonalData()
    {
        Scanner enter = new Scanner(System.in);

        System.out.print("Please enter you name: ");
        String name = enter.nextLine();

        System.out.print("Please enter you surname: ");
        String surname = enter.nextLine();

        System.out.print("Please enter you age: ");
        int age = enter.nextInt();

        System.out.print("Please enter you height: ");
        int height = enter.nextInt();

        System.out.print("Please enter you weight: ");
        Double weight = enter.nextDouble();


        System.out.println("You name is: " + name);
        System.out.println("You surname is: " + surname);
        System.out.println("You age is: " + age);
        System.out.println("You height is: " + height);
        System.out.println("You weight is: " + weight);


    }

    public static void convertToChar()
    {
        Scanner convert = new Scanner(System.in);

        System.out.print("Please enter you symbol: ");
        char symbol = (char) convert.nextInt();
        System.out.println("You have entered the symbol: " + symbol);
        System.out.println("This symbol numeric is: " + (int) symbol);

    }

    public static void getMassIndex()
    {
    Scanner BMI = new Scanner(System.in);

        System.out.println("BMI we count by the formula BMI = kg/m2 ");

        System.out.print("Please enter you weight: ");
        double weight = BMI.nextDouble();

        System.out.print("Please enter you height: ");
        int height = BMI.nextInt();

        System.out.print("You BodyMassIndex is: " + weight /(height * height / 10000));
        double formula = BMI.nextDouble();

      BMI.close(); //закрыл ресурс

        // вроде все ошибки исправил


    }
}


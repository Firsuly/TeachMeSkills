import java.util.Scanner;

class Main {
    public static void main(String[] args) { // Функции пульта управления

        getScanner();
        getVariables();
        getMassIndex();
    }

    public static void getScanner() {
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

        enter.close(); // закрыл ресурс
    }

    public static void getVariables()
    {
        char mySymbol = 'C';
        char mySymbola = 'a';
        System.out.println("My letter C - " + (int)mySymbol);
        System.out.println("My letter a - " + (int)mySymbola);
    }

    public static void getMassIndex()
    {
        System.out.println("BMI we count by the formula BMI = kg/m2 ");

        /* Я конечно написал эту формулу согласно заданию, но судя по всему она не правильная,
        нашел другую формулу в инете и рассчет сделал по ней*/

       float weight = 79;
       float hight = 1.8F;

        System.out.println(weight/(hight + hight));
        System.out.println("This is you Body Mass Index - are you okay!");

    }
}


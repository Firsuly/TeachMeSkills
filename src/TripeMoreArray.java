import java.util.Scanner;
public class TripeMoreArray {
    public static void main(String[] args) {

        getNumbersArray();
        allSideCube();

    }

    public static void getNumbersArray() {
        Scanner enter = new Scanner(System.in);
        System.out.print("Please enter the number in console: ");
        int number = enter.nextInt();

    }
    public static void allSideCube()
    {
        int[][][] names = new int[][][]{
                {
                        {3, 6, 9},
                        {12, 15, 18},
                        {21, 24, 27}
                }
        };

        for (int a = 0; a < names.length; a++)
        {
            for (int b = 0; b < names[a].length; b++)
            {
                for (int c = 0; c < names[a][b].length; c++)
                {

                    names[a][b][c] = names[a][b][c] + 3;

                    System.out.print(names[a][b][c] + " ");
                }
                System.out.println();
            }
        }
    }
}


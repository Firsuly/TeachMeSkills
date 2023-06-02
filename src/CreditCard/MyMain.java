package CreditCard;

import java.util.Scanner;

public class MyMain {

public static void main(String[] args) {
    {
        BankCard card1 = new BankCard("Filipp Kirkorov", "3451 2375 4719 3524", 1177);
        BankCard card2 = new BankCard("Alla Pugacheva", "2543 5378 9367 8514", 1520.7);
        BankCard card3 = new BankCard("Maxim Galkin", "1345 2765 429 0376", 973.5);

        System.out.println();
        System.out.println("Initial cards info:");
        System.out.println(card1);
        System.out.print("Balance after replenishment: ");

        card1.addCurrentAmount(23);
        card1.getData();


        System.out.println();
        System.out.println("Initial cards info:");
        System.out.println(card2);
        System.out.print("Balance after replenishment: ");

        card2.addCurrentAmount(79.3);
        card2.getData();


        System.out.println();
        System.out.println("Initial cards info:");
        System.out.println(card3);
        System.out.print("Balance after replenishment: ");

        card3.outCurrentAmount(73.5);
        card3.getData();
}

    }
}


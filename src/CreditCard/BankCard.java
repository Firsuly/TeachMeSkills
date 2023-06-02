package CreditCard;

public class BankCard {

    private String name;
    private String cardNumbers;
    private double currentAmount;


    public BankCard(String name,String cardNumbers,double currentAmount) {
        this.name = name;
        this.cardNumbers = cardNumbers;
        this.currentAmount = currentAmount;
    }

    void addCurrentAmount(double sumToAdd) {
        this.currentAmount += sumToAdd;
    }

    void outCurrentAmount(double sumToAdd) {
        this.currentAmount -= sumToAdd;
    }

    @Override
    public String toString() {
        return "You Card name is: " + this.name + "\n" +
                "You Card Numbers is: " + this.cardNumbers + "\n" +
                "You Card Current Amount is: " + currentAmount + "\n";
    }
        void getData()
    {
        System.out.println("You Card name is: " + this.name);
        System.out.println("You Card Numbers is: " + this.cardNumbers);
        System.out.println("You Card Current Amount is: " + this.currentAmount);
}
}

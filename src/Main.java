public class Main {
    public static void main(String[] args) {
        int balanceInitial = 100;
        int bonusCost = 100;
        int payment = 1100;

        int bonus = payment / bonusCost;
        if (payment <= 1000) {
            bonus = 0;
        }
        int balance = balanceInitial + payment + bonus;
        System.out.println("Баланс счета " + balance + " рублей");

    }
}

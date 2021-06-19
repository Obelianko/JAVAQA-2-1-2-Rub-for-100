public class Main {
    public static void main(String[] args) {
        int accountBalance = 100;
        int topUpBalance = 1100;
        int bonus;

        if (topUpBalance > 1000) {
            bonus = topUpBalance / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Начисленные бонусы:" + bonus);
        int totalBalance = accountBalance + topUpBalance + bonus;
        System.out.println("Балланс счета:" + totalBalance);

    }
}



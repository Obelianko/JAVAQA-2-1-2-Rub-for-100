public class Main {
## Расчет бонусов "Получи рубль за каждые 100 рублей"

    public static void main(String[] args) {

        int accountBalance = 100;

        int topUpBalance = 1000;

        int bonus = topUpBalance / 100;


        if (topUpBalance >= 1000)

        { System.out.println("Начисленные бонусы:" + bonus);


        } else {

            bonus = 0;

            System.out.println("Начисленные бонусы:" + 0);

        }


        int totalBalance = accountBalance + topUpBalance + bonus;

        System.out.println("Балланс счета:" + totalBalance);


        }};


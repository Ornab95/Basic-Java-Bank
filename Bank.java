package Java_OOPs.ARNAB_Bank;

import java.util.Scanner;

public class Bank {

    public void WidrowMoney(Client x, int Money) {
        double deposit = x.getDeposit();
        if (deposit > Money) {
            deposit = deposit - Money;
            x.setDeposit(deposit);
            System.out.println("\nWidrow Complete: " + Money);
            System.out.println("\nRest amount: " + deposit);
        } else {
            System.out.println("You don't have enought Money, That mean you are poor like me");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Client Arnab = new Client();
        Bank ab = new Bank();
//        System.out.println("Enter Your Name");
//        String ab2 = in.nextLine();
//
//        System.out.println("Enter your ID For Setup");
//        int ab1 = in.nextInt();
//
//        System.out.println("Enter Your Mobile No");
//        int ab3 = in.nextInt();
//        System.out.println("Enter Your deposit Amount");
//        double ab4 = in.nextDouble();

        Arnab.setId(1);

        Arnab.setName("Arnab Biswass");

        Arnab.setMobile_no(01727);

        Arnab.setDeposit(0000.00);

        System.out.println(Arnab.getDeposit());
        ab.WidrowMoney(Arnab, 10000);
        System.out.println(Arnab.getDeposit());

    }

}

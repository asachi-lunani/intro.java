package com.marion;

public class TestAccounts {
    public static void main(String[] args) {
        Account acc1= new Account("Marion","001",3000);
        Account acc2= new Account("Tisha","002",30000);
        Account acc3= new Account("Lucricia","003",6000);
        Account acc4= new Account("Mercelene","004",52000);
        Account acc5= new Account("Sammy","005",15000);
        System.out.println(acc1.getBalance());
        acc1.setBalance(6500);
        System.out.println(acc1.getBalance());

        acc2.deposit(1000);
        acc2.printDetails();
        acc2.withdraw(300);
        acc2.printDetails();

        String name ="John";
        name.toLowerCase();
        //primitive
        int x=10;
        double z=88;
        boolean finished=true;


        Account[] accounts={acc1,acc2,acc3,acc4,acc5};

        for (Account k : accounts)
        {

            k.withdraw(100);
            k.printDetails();
        }






    }
}

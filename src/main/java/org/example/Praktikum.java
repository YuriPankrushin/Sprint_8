package org.example;

public class Praktikum {

    public static void main(String[] args) {
        /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */
        Account account1 = new Account("Юрий Панкрушин");
        Account account2 = new Account(" Юр ");
        Account account3 = new Account(" Юрий ПанкрушинПанкру ");
        Account account4 = new Account(" Юрий Панкрушин Панкрушин ");
        account1.checkNameToEmboss();
        account2.checkNameToEmboss();
        account3.checkNameToEmboss();
        account4.checkNameToEmboss();
    }
}
package org.example;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        String nameTrim = name.trim();
        return (nameTrim.length() - nameTrim.replaceAll(" ", "").length() == 1) && name.length() >= 3 && name.length() <= 19;
    }

}

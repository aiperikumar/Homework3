package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Доброо пожаловать!");
        String[] names = new String[3];
        names[0]= "Доброе утро, Белла!";
        names[1]= "Добрый день, Эдвард!";
        names[2]= "Добрый вечер, Джейкоб!";

        for (String name:names) {
            System.out.println(name);
        }

    }
}

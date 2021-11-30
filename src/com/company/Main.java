package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Запись
        PersonData personData = new PersonData("Егор", "Хмелевский", 2001, "Не скажу, 404");
        new WriteFile(personData, "C:\\MyPrograms\\Serialization\\person.ser");

        // считывание
        System.out.println("Сериализация. Чтение файла с одним человеком");
        new ReadFile("C:\\MyPrograms\\Serialization\\person.ser");

        // обычная запись и чтение файла

        PersonData personData1 = new PersonData("Анастасия", "Косицына", 2001, "Не скажу, 404");
        ArrayList people = new ArrayList();
        people.add(personData);
        people.add(personData1);

        PeopleData peopleData = new PeopleData(people);
        peopleData.writeFile("C:\\MyPrograms\\Serialization\\");
        System.out.println("\nОбычное чтение файла с людьми");
        peopleData.readFile("C:\\MyPrograms\\Serialization\\");
    }
}

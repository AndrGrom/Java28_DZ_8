package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Барак", "Обама", new Address("Нью Джерси", "Новый дом", 39));
        Person p2 = new Person("Джордж", "Буш", new Address("ЛосАнджелес", "Казино", 21));
        Person p3 = new Person("Билл", "Клинтон", new Address("Моника", "Левинский", 88));

        Person p4 = new Person(null, "Байден", new Address("Вашингтон", "Белый дом", 1));
        Person p5 = new Person("Джо", null, new Address("Вашингтон", "Белый дом", 1));
        Person p6 = new Person("Джо", "Байден", null);

        List<Person> personList = new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5, p6));
        List<String> personStr = personList.stream().filter(T -> T.getFirstName() != (null) && T.getLastName() != null &&
                T.getAddress() != null).sorted().map(T -> T.toString()).collect(Collectors.toUnmodifiableList());
        personStr.stream().forEach(System.out::println);
    }
}

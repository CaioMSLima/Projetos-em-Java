package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Caio");
        list.add("Kauã");
        list.add("Josefa");
        list.add("Francisco");
        list.add(2, "kell");

        System.out.println(list.size());
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("--------------------");
        System.out.println("Index of Josefa: " + list.indexOf("Josefa"));
        System.out.println("Index of: " + list.indexOf("Luiza"));

        System.out.println("-------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'k').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }
        System.out.println("---------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);
    }
}


package HW4;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Задание 1
        List<String> words = new ArrayList<>();

        words.add("Привет");
        words.add("Мир");
        words.add("Привет");
        words.add("Джава");
        words.add("Привет");
        words.add("Идея");
        words.add("Привет");
        words.add("Кто-нибудь");
        words.add("Привет");
        words.add("Пока");

        Set<String> uniqueWords = new LinkedHashSet<>(words);
        System.out.println(uniqueWords);

        for (String str : uniqueWords){
            System.out.println("Слово " + str + " повторяется " + Collections.frequency(words, str) + " раз");
        }


        //задание 2

        Phones phones = new Phones();

        phones.add("Иванов", "1321567523", "345435345");
        phones.add("Петров", "132132423", "1231225673");
        phones.add("Сидоров", "1368762123", "123808981223");
        phones.add("Пупкин", "132198097823", "12378971223");
        phones.add("Иванов","1321567523", "12312565423");

    }
}

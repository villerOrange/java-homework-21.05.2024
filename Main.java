package org.example.hw_21_05_2024;

//Создайте строку через new - I study Basic Java!
//Напишите метод, который принимает в качестве параметра строку, передайте в этот метод строку, которую создали в п.1
//Распечатать пред-последний символ строки. Используем метод String.charAt().
//Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
//Вырезать строку Java c помощью метода String.substring().
//Заменить все символы “а” на “о”.
//Преобразуйте строку к верхнему регистру.
//Преобразуйте строку к нижнему регистру.



public class Main {
    public static void main(String[] args) {
        // Создание строки
        String myString = new String("I study Basic Java!");

        // Вызов метода для работы со строкой
        processString(myString);
    }

    public static void processString(String str) {
        // Печатаем предпоследний символ строки
        System.out.println("Предпоследний символ: " + str.charAt(str.length() - 2));

        // Проверяем содержание подстроки "Java"
        if (str.contains("Java")) {
            System.out.println("Строка содержит 'Java'");
        } else {
            System.out.println("Строка не содержит 'Java'");
        }

        // Вырезаем подстроку "Java"
        int startIndex = str.indexOf("Java");
        String javaSubstr = str.substring(startIndex, startIndex + 4);
        System.out.println("Вырезанная подстрока: " + javaSubstr);

        // Заменяем все 'a' на 'o'
        String replacedString = str.replace('a', 'o');
        System.out.println("Строка после замены 'a' на 'o': " + replacedString);

        // Преобразование строки к верхнему регистру
        String upperString = str.toUpperCase();
        System.out.println("Строка в верхнем регистре: " + upperString);

        // Преобразование строки к нижнему регистру
        String lowerString = str.toLowerCase();
        System.out.println("Строка в нижнем регистре: " + lowerString);
    }
}

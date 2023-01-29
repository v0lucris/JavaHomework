Урок 1. Знакомство с языком программирования Java

Task1
Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 300].

Task2
Реализуйте алгоритм сортировки пузырьком для сортировки массива

Task3
Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.

Урок 2. Почему вы не можете не использовать API
Обязательная!
public class Task0 {
//Напишите программу, которая принимает с консоли число в формате byte и записывает его в файл ”result.txt”.
//Требуется перехватить все возможные ошибки и вывести их в логгер.
//
//После написания, попробуйте подать на вход числа 100 и 200 и проследите разницу в результате
public static void main(String[] args) {

}

public String findJewelsInStones(String jewels, String stones){

    return "";
}
}
Не обязательная, но будет не лишним.
public class Task1 {
// Напишите программу, которая
// 1) по указанной строке URL скачивает файл и возвращает строковое содержимое файла
// 2) изменяет строковое содержимое файла подставляя по маске "%s" ваше имя
// 3) сохраняет файл локально
// 4) читает сохраненный файл и выводит содержимое в логгер
// 5) удаляет сохраненный файл
public static void main(String[] args) {
String fileUrl = "https://raw.githubusercontent.com/aksodar/JSeminar_2/master/src/main/resources/example.txt";

}

public String download(String url, String localFilename) {

    return "";
}

public String change(String name, String fileContent) {

    return "";
}

public void read(String localFilename){

}

public void saveOnLocal(String fileName, String fileContent) {

}

public boolean removeFromLocale(String fileName) {

    return false;
}
}

Урок 3. Коллекции JAVA: Введение
import java.util.ArrayList;
import java.util.List;
public class Homework {
// Пусть дан произвольный список целых чисел
public static void main(String[] args) {

}

// Нужно удалить из него четные числа
public List<Integer> removeEvenValue(List<Integer> list){

    return new ArrayList<>();
}

// Найти минимальное значение
public Integer getMin(List<Integer> list){

    return 0;
}

// Найти максимальное значение
public Integer getMax(List<Integer> list){

    return 0;
}

// Найти среднее значение
public Integer getAverage(List<Integer> list){

    return 0;
}
}

Урок 4. Хранение и обработка данных ч1: приоритетные коллекции
Основной зал - задача 2. Задача 3 по желанию.
Зал1,Зал3 - Задача 3 и HomeWork
Зал2 - Задача 2 и Задача3. HomeWork - по желанию
Кто не был на семинаре - Задача 1, Задача 2 - остальное по желанию.
Задачи дублирую -->
public class Task1 {
// Дан Deque состоящий из последовательности цифр.
// Необходимо проверить, что последовательность цифр является палиндромом
public static void main(String[] args) {
Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1,2,3,4,5,6));

}


public boolean checkOn(Deque<Integer> deque){

    return false;
}
}
public class Task2 {
//Даны два Deque представляющие два неотрицательных целых числа. Цифры хранятся в обратном порядке,
// и каждый из их узлов содержит одну цифру.
// Сложите два числа и верните сумму в виде связанного списка.
public static void main(String[] args) {
Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1,2,3));
Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5,4,7));
// result [6,6,0,1]

}


public Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {

    return new ArrayDeque<>();
}
}
public class Task3 {
//Дана строка содержащая только символы '(', ')', '{', '}', '[' и ']', определите,
// является ли входная строка логически правильной.
// Входная строка логически правильная, если:
// 1) Открытые скобки должны быть закрыты скобками того же типа.
// 2) Открытые скобки должны быть закрыты в правильном порядке. Каждая закрывающая скобка имеет соответствующую
// открытую скобку того же типа.
// ()[] = true
// () = true
// {[()]} = true
// ()() = true
// )()( = false

public static void main(String[] args) {

}

public boolean validate(Deque<Integer> deque){

    return false;
}
}
public class Homework {
//Даны два Deque представляющие два целых числа. Цифры хранятся в обратном порядке,
// и каждый из их узлов содержит одну цифру.
public static void main(String[] args) {
Homework hw = new Homework();
hw.multiple(new ArrayDeque<>(Arrays.asList(5,2)), new ArrayDeque<>(Arrays.asList(4)));
// result [0,0,1]
hw.sum(new ArrayDeque<>(Arrays.asList(5,-2)), new ArrayDeque<>(Arrays.asList(5)));
// result [0,-2]
}

// Умножьте два числа и верните произведение в виде связанного списка.
public Deque<Integer> multiple(Deque<Integer> d1, Deque<Integer> d2){

    return new ArrayDeque<>();
}

// Сложите два числа и верните сумму в виде связанного списка. Одно или два числа должны быть отрицательными
public Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2){

    return new ArrayDeque<>();
}
}

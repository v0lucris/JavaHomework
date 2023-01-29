//Task1 Заполните массив случайным числами и выведите максимальное,
// минимальное и среднее значение.
// Для генерации случайного числа используйте метод Math.random(),
// который возвращает значение в промежутке [0, 300].
//

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            int a = 0; // Начальное значение диапазона - "от"
            int b = 300; // Конечное значение диапазона - "до"
            array[i] = a + (int) (Math.random() * b); // Генерация чисел
            System.out.println(array[i]);
        }
        int max = array[0]; // Массив не должен быть пустым
        int min = array[0];
        int avg = 0;
        for (int i = 0; i < array.length; i++) {
            if(max < array[i])
                max = array[i];
            if(min > array[i])
                min = array[i];
            avg += array[i]/array.length;
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);

    }
}

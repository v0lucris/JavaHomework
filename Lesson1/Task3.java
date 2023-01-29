//Task3
//        Напишите программу,которая выводит на консоль простые числа в промежутке от [2, 100].
//        Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы
public class Task3 {
    public static void main(String [] args) {
        int a = 2, b = 100;
        System.out.println("Простые числа в промежутке [2, 100]: ");
        for(int i = a; i <= b; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int x) {
        if (x < 2) return false;
        int temp;
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
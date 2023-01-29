//Task2
//Реализуйте алгоритм сортировки пузырьком для сортировки массива

public class Task2 {
    public static void main(String[] args) {

        int[] array = {2, 1, 7, 9, 44};
        bubleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\n");

        }
    }

    public static void bubleSort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] < array[i]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }

    }
}
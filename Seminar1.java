import java.util.Arrays;

public class Seminar1 {
    //Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
    //Если длина массива меньше некоторого заданного минимума, метод возвращает -1,
    // в качестве кода ошибки, иначе - длину массива.

    public static int task0(int[] arr) {
        int min = 5;
        return arr.length < min ? -1 : arr.length;
    }

//    Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
//    Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
//    если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
//    если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
//    если вместо массива пришел null, метод вернет -3
//    придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.
//    Напишите метод, в котором реализуйте взаимодействие с пользователем. То есть, этот метод запросит искомое число
//    у пользователя, вызовет первый, обработает возвращенное значение и покажет читаемый результат пользователю.
//    Например, если вернулся -2, пользователю выведется сообщение: “Искомый элемент не найден”.

    public static int task1(int[] arr, int n) {
        if (arr == null) {
            return -3;
        }
        int min = 5;//заданный минимум
        if (arr.length < min) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -2;
    }

    public static void messanger(int n) {
        switch (n) {
            case -3 -> System.out.println("The array is null");
            case -2 -> System.out.println("The element has been not found");
            case -1 -> System.out.println("The Array isn`t long enough");
            default -> System.out.println("The number has position " + n);
        }
    }
//    Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
//    Необходимо посчитать и вернуть сумму элементов этого массива.
//    При этом накладываем на метод 2 ограничения: метод может работать только с квадратными массивами
//    (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1.
//    Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.

    public static int task2(int[][] arr) {
        if (arr == null) throw new RuntimeException("The array is null");
        if (arr.length != arr[0].length) throw new RuntimeException("The array is not squared");
        int sum = 0;
        for (int[] row : arr) {
            for (int i : row) {
                if (i != 0 && i != 1) throw new RuntimeException("The element has to be 0 or 1");
                sum += i;
            }
        }
        return sum;
    }

    //    Реализуйте метод, принимающий в качестве аргументов двумерный массив.
//    Метод должен проверить что длина строк и столбцов с одинаковым индексом одинакова,
//    детализировать какие строки со столбцами не требуется.
    public static boolean task8(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
           if (arr.length != arr[i].length) return false;
        } return true;
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 7, 8};
        int[][] arr2 = null;
        //messanger(task1(arr,8));
        int[][] arr3 = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };
        //System.out.println(task2(arr3));

        System.out.println(task8(arr3));
    }
}
package HW2;

public class Task2 {
    //Задание 2
    //Если необходимо, исправьте данный код
    public static void main(String[] args) {


        int i = 8;
        int d = 0;
        int[] intArray = {11,7,3};

        if (d == 0) {
            System.out.println("Division by zero.");
        } else if (i >= intArray.length) {
            System.out.println("Wrong index");
        } else {
            double catchedRes1 = (double) intArray[i] / d;

        }


    }
}

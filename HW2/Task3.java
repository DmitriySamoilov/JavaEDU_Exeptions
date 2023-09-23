package HW2;
import java.io.*;
public class Task3 {
    //Задание 3
    //Дан следующий код, исправьте его там, где требуется

    public static void main(String[] args)  {
        int a = 90;
        int b = 3;
        if (b!=0){System.out.println(a / b);}else {System.out.println("Division by zero.");}

        int[] abc = { 1, 2 };
        int i = 3;
        if (i < abc.length) {abc[i] = 9;} else {System.out.println("Wrong index");}

        try {
            printSum(23, 234);
        } catch (FileNotFoundException ex) {
            System.out.println("There is no such file.");
        } catch (Exception ex) {
            System.out.println("Something went wrong ...");
        }
    }
    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }

}

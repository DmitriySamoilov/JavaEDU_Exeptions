package HW2;
//Задание4
//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

public class Task4 {
    public static void main(String[] args) {
        String str = "";
        try {
            doSomethig(str);
        }catch (EmptyStringExeption e){
            System.out.println("Empty string isn`t permitted");
        }
    }

    public static void doSomethig(String str) throws EmptyStringExeption {
        if (str.isEmpty()) throw new EmptyStringExeption();
    }

    public static class EmptyStringExeption extends Exception {
    }

}


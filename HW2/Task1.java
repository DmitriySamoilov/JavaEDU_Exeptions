package HW2;

import java.io.*;

//Задание 4(презентация).
//Исправьте код, примените подходящие способы обработки исключений.

public class Task1 {
    public static void main(String[] args) {
        InputStream inputStream;
        String[] strings = {"asdf", "asdf"};
        int i = 1;
        if (i < strings.length) {
            String strings1 = strings[i];
        } else {
            System.out.println("Wrong index");
        }
        if (i != 0) {
            int a = 1 / i;
        } else {
            System.out.println("Division by zero.");
        }
        try {
            test();
            inputStream = new FileInputStream("sdafgdsaf");
        } catch (FileNotFoundException e) {
            System.out.println("Wrong file name");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Я все равно выполнился");
        }
        System.out.println("Я жив!");
    }

    public static void test() throws IOException {
        File file = new File("1");
        file.createNewFile();
        FileReader reader = new FileReader(file);
        reader.read();
        //test();

    }
}


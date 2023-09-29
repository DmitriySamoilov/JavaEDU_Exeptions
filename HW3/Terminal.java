package HW3;
//Напишите приложение, которое будет запрашивать у пользователя следующие данные в произвольном порядке,
// разделенные пробелом: Фамилия Имя Отчество датарождения номертелефона пол


import java.util.*;

abstract class Terminal {
    public static String[] terminalInput(String message) {

        System.out.print(message);
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(" ");

        scanner.close();

        return input;
    }
}

package HW3;

// Приложение должно проверить введенные данные по количеству. Если количество не совпадает с требуемым,
// вернуть код ошибки, обработать его и показать пользователю сообщение, что он ввел меньше и больше данных,
// чем требуется.
abstract class ExceptionCodeRunner {
    public static void runCode(String code) {

        switch (code) {
            case "200" -> {}
            case "300" -> {System.out.println("Fewer elements than necessary. Please try again!");
            }
            case "350" -> System.out.println("More elements than needed. Please, try again!");
            default -> System.out.println("UnknownError");
        }

    }
}

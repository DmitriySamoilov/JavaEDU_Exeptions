package HW3;
// Приложение должно проверить введенные данные по количеству. Если количество не совпадает с требуемым,
// вернуть код ошибки, обработать его и показать пользователю сообщение, что он ввел меньше и больше данных,
// чем требуется.


abstract class PersonInputSizeChecker {
    public static String check(String[] input) {
        String exceptionCode;

        if (input.length == 6) {
            exceptionCode = "200";// 200 - Enough_elements_exception code
        } else if (input.length < 6) {
            exceptionCode = "300";// 300 - Less_elements_than_need_exception code
        } else {
            exceptionCode = "350";// 350 - More_elements_than_need_exception code
        }
        return exceptionCode;
    }
}

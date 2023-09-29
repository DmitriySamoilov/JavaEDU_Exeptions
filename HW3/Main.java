package HW3;


public class Main {
    public static void main(String[] args) {
        boolean flag = true;

        String[] input = null;
        //Блок кода с кодами ошибок. Хотя здесь было бы удобнее применить throws exception, но строго следую заданию
        input = Terminal.terminalInput("Введите через пробел: ФИО Дату рождения (ДД.ММ.ГГГГ) Телефон(только цифры) Пол(f/m):");                                           //Ask the user on Terminal
        String exceptionCode = PersonInputSizeChecker.check(input);
        ExceptionCodeRunner.runCode(exceptionCode);

        //Блок кода с обработкой Exceptions
        try {
            Person person = new Person(PersonInputStringsParser.parse(input));
            System.out.println("The information is valid.");
            System.out.println(person);
            FileWriterPerson.write(person);

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println("Something went wrong. Please, try again!");
        }

    }
}

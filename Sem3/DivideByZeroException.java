package Sem3;//Создайте класс исключения, который будет выбрасываться при делении на 0.
// Исключение должно отображать понятное для пользователя сообщение об ошибке.

public class DivideByZeroException extends Exception{
    DivideByZeroException(){

        super ("Divide by zero");
    }
}

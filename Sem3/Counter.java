package Sem3;

import java.io.IOException;
//Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение внутренней int переменной на 1.
// Сделайте так, чтобы с объектом такого типа можно было работать в блоке try-with-resources.
// Подумайте, что должно происходить при закрытии этого ресурса? Напишите метод для проверки, закрыт ли ресурс.
// При попытке вызвать add() у закрытого ресурса, должен выброситься IOException
public class Counter implements AutoCloseable {
    private int count = 0;
    private boolean close = false;

    public void add() throws IOException {
        if (close) {
            throw new IOException("The object is closed");
        } else
            count++;
    }

    @Override
    public void close() throws Exception {
        count = 0;
        close = true;
    }

    public boolean isClosed() {
        return close;
    }
}

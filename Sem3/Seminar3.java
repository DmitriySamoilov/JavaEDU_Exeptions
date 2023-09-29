package Sem3;

import Sem3.DivideByZeroException;

import java.io.FileReader;
import java.io.IOException;

public class Seminar3 {
    public static void main(String[] args) throws DivideByZeroException {
        throw new DivideByZeroException();




//        try (Sem3.Counter count = new Sem3.Counter();){
//            count.add();
//            count.close();
//            count.add();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//            System.out.println("Add into closed object is not permitted");
//        }catch (Exception e){
//            e.printStackTrace();
//        }
    }
    //Создайте метод doSomething(), который может быть источником одного из типов checked exceptions
    // (тело самого метода прописывать не обязательно). Вызовите этот метод из main и обработайте в нем исключение,
    // которое вызвал метод doSomething().
    public static void doSomething() throws IOException {
        FileReader in = new FileReader("");
    }


}


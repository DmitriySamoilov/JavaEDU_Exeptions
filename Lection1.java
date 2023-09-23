import java.io.File;
public class Lection1 {
    public static long getFileSize(File file){
        if (!file.exists()){ return -1L;}
        return file.length();
    }

    public static void a(){
        b();
    }
    public static void b(){
        c();
    }
    public static void c(){
        int [] arr =new int[10];
        System.out.println(arr[100]);//ArrayIndexOutOfBoundsException
    }

    public static int divide (int a, int b){
        if (b == 0) {
            throw new RuntimeException("Divide by zero not permitted");
        }
        return a/b;
    }

    public static void main(String[] args) {
        //System.out.println(getFileSize(new File("C:\\Users\\DDDok\\Desktop\\Литература Компьютерные науки\\АлгоритмыСтруктура данных\\Рафгарден. Совершенный алгоритм. Основы.pdf")));

        //System.out.print(10/0);//ArithmeticException

        //a();

        System.out.println(divide(100,0));

        }
    }

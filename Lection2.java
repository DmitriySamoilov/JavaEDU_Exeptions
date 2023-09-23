import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lection2 {
    public static void main(String[] args) {
        FileReader test = null;
        try{
            test = new FileReader("test");
            test.read();
        }catch(RuntimeException | IOException e){
            System.out.println("Catch exception: " + e.getClass().getSimpleName());
        }finally {
            if (test != null) {
                try {
                    test.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

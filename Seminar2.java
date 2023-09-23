import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Seminar2 {


    public static void main(String[] args) {
        File file = new File("1.txt");
        FileWriter fileWriter = null;
        HashMap<String, String> map;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write("Анна=4\n");
            fileWriter.write("Елена=5\n");
            fileWriter.write("Марина=6\n");
            fileWriter.write("Владимир=?\n");
            fileWriter.write("Константин=?\n");
            fileWriter.write("Иван=4\n");

        } catch (IOException e) {
            System.out.println("Write process problem");
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        map = read(file);
        change(map);
        write(map,file);

    }

    public static HashMap<String, String> read(File file) {
        HashMap<String, String> map = new HashMap<>();
        try  {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while((line = reader.readLine()) != null){
                map.put(line.split("=")[0],line.split("=")[1]);
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return map;


    }

    public static void change(HashMap<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals("?")) {
                entry.setValue(String.valueOf(entry.getKey().length()));
            }
        }

    }

    public static void write(HashMap<String, String> map, File file) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                fileWriter.write(entry.getKey() + "=" + entry.getValue()+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

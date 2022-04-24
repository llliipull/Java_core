package HW5;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class Data implements Serializable {

    private Map<String, ArrayList<String>> map;
    private File file;
    private BufferedReader reader;

    public Data (Map<String, ArrayList<String>> map, File file){
        this.map = map;
        this.file = file;
        this.map.put("Value 1", new ArrayList<>(Arrays.asList("\n100", "200")));
        this.map.put("Value 2", new ArrayList<>(Arrays.asList("123", "\n300")));
        this.map.put("Value 3", new ArrayList<>(Arrays.asList("400", "500")));
    }

    public void save(){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(this.file))){
            writer.write(String.valueOf(map.keySet()).replace(",", ";")
                    .replace("[","").replace("]",""));
            writer.write(map.values().toString().replace(",", ";")
                    .replace("]","").replace("[",""));
        } catch (IOException e){
            e.getCause();
        }
    }

    public Map<String, ArrayList<String>> read(File file){
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            String str;
            while ((str = reader.readLine()) != null){
                System.out.println(str);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
}

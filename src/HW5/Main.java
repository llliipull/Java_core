package HW5;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        File file = new File("src/HW5/file.csv");
        Map<String, ArrayList<String>> map = new LinkedHashMap<>();

        Data data = new Data(map, file);
        data.save();
        data.read(file);
        }



}


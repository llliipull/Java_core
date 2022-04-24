package HW4;

import java.util.*;

public class Phones {

    private Map<String, List<String>> phones = new HashMap<>();


    public void add(String name, String ... phoneNumber){
        phones.put(name, new ArrayList<>(Arrays.asList(phoneNumber)));
    }

}

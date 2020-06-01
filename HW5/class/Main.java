package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Minoofam on 8/10/2019.
 */
public class Main {
    public static void main(String[] args) {
        Map map = new HashMap ();
        map.put("name","amirhadi");
        map.put("name","reza");
        map.put("family","bahadori");
       System.out.println(map.get("family"));

        Set set =map.keySet();
        for (Object o : set) {
            System.out.println(o);
        }
        Collection vset =map.values();
        for (Object s : vset)
            System.out.println(s);

    }
}

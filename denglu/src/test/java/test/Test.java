package test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    @org.junit.Test
    public void testMapList() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("aaa", "bbb");
        map.put("ccc", "ddd");
        for (Map.Entry entry : map.entrySet()) {
            String str = entry.getKey() + "+++" + entry.getValue();
            System.out.println(str);
        }
    }

    @org.junit.Test
    public void testList() {
        List<String> list = new ArrayList<>();

        list.add("aaa+++bbb");
        list.add("ccc+++ddd");
        Map<String, String> map = new HashMap<>();
        for (String xxx : list) {
            String[] dd = xxx.split("\\+++");
            map.put(dd[0], dd[1]);
        }
    }
}

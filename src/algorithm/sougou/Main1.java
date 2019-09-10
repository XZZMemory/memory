package algorithm.sougou;

import java.util.*;

public class Main1 {
    //使用动态规划
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.valueOf(in.nextLine());
        LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>(16, 0.75f, true);
        LinkedHashMap<String, Integer> result = new LinkedHashMap<String, Integer>();
        while (in.hasNext()) {
            String str = in.nextLine();
            String[] data = str.split(" ");
            String key = data[0];
            int value = Integer.valueOf(data[1]);
            if (map.containsKey(key)) {
                if (map.get(key) < value) {
                    map.put(key, value);
                }
            } else {
                if (map.size() == n) {
                    Set<String> keys = map.keySet();
                    for (String currentKey : keys) {
                        map.put(currentKey, map.get(currentKey));
                        map.remove(currentKey);
                        break;
                    }
                }
                map.put(key, value);
            }
        }
        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}

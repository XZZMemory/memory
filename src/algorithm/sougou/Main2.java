package algorithm.sougou;

import other.dynamicProxy.cglib.Hacker;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int line = in.nextInt();
        Map<Integer, Set<Integer>> map = new HashMap<>();
        while (line > 0) {
            String dtr = in.nextLine();
            String[] data = dtr.split(" ");
            int key = Integer.valueOf(data[1]);
            Set<Integer> value = new HashSet<>();
            int sum = Integer.valueOf(data[0]);
            for (int i = 2; i < data.length; i++) {
                value.add(Integer.valueOf(data[i]));
            }
            --line;
        }
        Set<Integer> set = new HashSet<>();
        set.add(0);
        while (!isEmpty(map)) {
            Set<Integer> t = new HashSet<>();
            for (int data : set) {
                //渲染节点，优先渲染有子节点的节点
                int j = k;// 可以渲染几个节点
                for (int child : map.get(data)) {
                    if (k > 0 && !map.get(child).isEmpty()) {
                        t.add(child);
                        k--;
                        map.get(data).remove(child);
                    }
                }
                while (k > 0 && (!map.get(data).isEmpty())) {
                   /* ma
                    t.add(child);
                    k--;
                    map.get(data).remove(child);*/
                }
                for (int c : t) {
                    set.add(c);
                    t.remove(c);
                }
            }
        }


    }

    public static boolean isEmpty(Map<Integer, Set<Integer>> map) {
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            if (!map.get(key).isEmpty()) {
                return false;
            }
        }
        return true;
    }
}

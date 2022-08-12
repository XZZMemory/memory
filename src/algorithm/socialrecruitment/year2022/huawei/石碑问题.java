package algorithm.socialrecruitment.year2022.huawei;

import java.util.*;

/**
 * description:memory
 *
 * @author xiaozhenzhen001
 * @date 2022/7/24
 */
public class 石碑问题 {
    public static Set<String> res = new HashSet<>();

    // 获取输入并转成数组
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = Integer.valueOf(in.nextLine());

        String sb = in.nextLine();
        String[] s = sb.split(" ");

        backTrack(s, 0);
        List<String> trueStr = new LinkedList<>(res);
        trueStr.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        trueStr.stream().forEach(e -> {
            System.out.println(e);
        });

    }

    public static void backTrack(String[] str, int index) {
        if (index == str.length) {
            StringBuffer sb = new StringBuffer();
            Arrays.stream(str).forEach(s -> sb.append(s));
            res.add(sb.toString());
            return;
        }
        for (int i = index; i < str.length; i++) {
            swap(str, i, index);
            backTrack(str, index + 1);
            swap(str, i, index);

        }
    }


    public static void swap(String[] str, int left, int right) {
        String temp = str[left];
        str[left] = str[right];
        str[right] = temp;
    }


}

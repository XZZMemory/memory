package algorithm.socialrecruitment.year2022.cider;

import java.util.LinkedList;
import java.util.List;

/**
 * description:memory
 *
 * @author xiaozhenzhen001
 * @date 2022/8/6
 */
public class 根据字符串找字典序 {
    public static void main(String[] args) {
        根据字符串找字典序 demo = new 根据字符串找字典序();
        int[][] res = demo.convert(new String[]{"ccda", "cba", "cdc", "bade", "bef", "df"});

    }

    int[][] convert(String[] str) {
        int[][] edge = new int[26][26];
        for (int i = 0; i < str.length - 1; i++) {
            compare(str[i], str[i + 1], edge);
        }

//        /**
//         * ["ccda",  "cba", "cdc", "bade", "bef", "df"]
        // c->b->d



//         */
//        // edge[i][j] 表示按照字典序i在j前面.表示图，如果i到任意j都不可达，则说明是游离节点
//        if (!convert(str, 0, edge)) {
//            // 不存在字典序
//            return null;
//        }
        return edge;
    }

    void compare(String a, String b, int[][] edge) {
        int index = 0;
        while (index < a.length() && index < b.length() && a.charAt(index) == a.charAt(index)) {
            ++index;
        }
        edge[a.charAt(index) - 'a'][b.charAt(index) - 'a'] = 1;
        // f 加入一个set
    }




    int[][] compare(String[] str) {
        for (int i = 0; i < str.length - 1; i++) {


        }

        /**
         * ["ccda",  "cba", "cdc", "bade", "bef", "df"]
         */
        // edge[i][j] 表示按照字典序i在j前面.表示图，如果i到任意j都不可达，则说明是游离节点
        int[][] edge = new int[26][26];
        if (!convert(str, 0, edge)) {
            // 不存在字典序
            return null;
        }
        return edge;
    }

    // 判断字符串数组str中当前第index位字符顺序
    boolean convert(String[] str, int index, int[][] edge) {
        char pre = str[0].charAt(index);
        // 1.根据所有元素第一位字符判断字典序
        for (int i = 1; i < str.length; i++) {
            if (str[i].charAt(index) == pre) {
                continue;
            }
            // 2.如果与之前判断结果相反（存在矛盾），则不成立.  正常应该是 pre-> str[i].charAt(index)
            if (edge[str[i].charAt(index) - 'a'][pre - 'a'] == 1) {
                // 说明不存在字典序，直接返回
                return false;
            }
            // 说明成立
            edge[pre - 'a'][str[i].charAt(index) - 'a'] = 1;
            // 更新pre
            pre = str[i].charAt(index);
        }
        // 3.如果第一位元素相等，则继续判断第二位字典序
        // 将index位置相同的元素继续比较


        List<String> sameChar = new LinkedList<>();
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() <= index + 1) {
                continue;
            }

            // 当前str[i] 后续还有元素，则继续比较
            if (sameChar.isEmpty()) {
                sameChar.add(str[i]);
                continue;
            }
            if (sameChar.get(0).charAt(index) == sameChar.get(i).charAt(index)) {
                sameChar.add(str[i]);
                continue;
            }
            // 只有一个字符串无法比较
            if (sameChar.size() == 1) {
                continue;
            }
            // 说明不存在字典序，直接返回
            if (!convert(sameChar.toArray(new String[sameChar.size()]), index + 1, edge)) {
                return false;
            }
            sameChar = new LinkedList<>();


        }
        return true;


    }
}


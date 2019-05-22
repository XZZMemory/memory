package other;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author memory
 * @date 2019/5/17
 */
public class Test2 {
    public static void main(String[] args) {
        Test2 test = new Test2();
        //test.getChinese(21001);
        Date date=new Date();
        System.out.println(date);
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("格式化后的时间是："+df.format(date)+"毫秒数： "+df.format(System.currentTimeMillis()));
    }

    public void getChinese(int questNum) {
        String questString = String.valueOf(questNum);

        int[] num = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String chinese[] = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        Map<Integer, String> numToChin = getNumToChin();
        Map<Integer, String> wei = getFlag();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < questString.length(); i++) {
            char c = questString.charAt(i);
            /** 连续两个0，则直接跳过*/
            if (c == '0' && ((i + 1 < questString.length() && (questString.charAt(i + 1) == '0')) || i == questString.length() - 1)) {
                continue;
            } else {
                if (c == '0') {
                    sb.append(numToChin.get('0'));
                } else {
                    sb.append(numToChin.get(Integer.valueOf(c)));
                    if (i != questString.length() - 1) {
                        sb.append(wei.get(i));
                    }
                }
            }
        }
        System.out.println("MainActivity" + "getChinese: " + sb);
        System.out.print(sb);
    }

    public Map<Integer, String> getNumToChin() {
        Map<Integer, String> map = new HashMap<>();
        String chinese[] = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};

        for (int i = 0; i < chinese.length; i++) {
            map.put(i, chinese[i]);
        }
        return map;
    }

    public Map<Integer, String> getFlag() {
        String dw[] = {"个", "拾", "百", "仟", "万"};
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < dw.length; i++) {
            map.put(i, dw[i]);
        }
        return map;
    }

}

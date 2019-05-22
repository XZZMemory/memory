package other;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author memory
 * @date 2019/5/10
 */
public class 计算两个日期间隔多少天 {
    public static void main(String[] args) {
        /**
         * 距离某一天有几天，思路：转换为时间戳格式，毫秒数，二者相减，求出天数。
         */
        List<?> list = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dstr = "2019-05-19 11:08:08 ";
        java.util.Date date = new Date();
        try {
            date = sdf.parse(dstr);
        } catch (Exception e) {
            e.printStackTrace();
        }
        long s1 = date.getTime();//将时间转为毫秒
        long s2 = System.currentTimeMillis();//得到当前的毫秒
        long day = (s2 - s1) / 1000 / 60 / 60 / 24;
        if (day >= 0) {
            day++;
            System.out.println("距现在已有" + day + "天，你得抓紧时间学习了");
        } else {
            System.out.println("还未到日期");
        }

        String time = "2019-05-17 15:01:01";
        long nowTime = System.currentTimeMillis(); // 获取当前时间的毫秒数
        String msg = null;
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 指定时间格式
        Date setTime = null; // 指定时间
        try {
            setTime = sdf2.parse(time); // 将字符串转换为指定的时间格式
        } catch (ParseException e) {

            e.printStackTrace();
        }
        long reset = setTime.getTime(); // 获取指定时间的毫秒数
        long dateDiff = nowTime - reset;
        if (dateDiff < 0) {
            msg = "输入的时间不对";
        } else {
            long dateTemp1 = dateDiff / 1000; // 秒
            long dateTemp2 = dateTemp1 / 60; // 分钟
            long dateTemp3 = dateTemp2 / 60; // 小时
            long dateTemp4 = dateTemp3 / 24; // 天数
            long dateTemp5 = dateTemp4 / 30; // 月数
            long dateTemp6 = dateTemp5 / 12; // 年数
            if (dateTemp6 > 0) {
                msg = dateTemp6 + "年前";
            } else if (dateTemp5 > 0) {
                msg = dateTemp5 + "个月前";
            } else if (dateTemp4 > 0) {
                msg = dateTemp4 + "天前";
            } else if (dateTemp3 > 0) {
                msg = dateTemp3 + "小时前";
            } else if (dateTemp2 > 0) {
                msg = dateTemp2 + "分钟前";
            } else if (dateTemp1 > 0) {
                msg = "刚刚";
            }
        }
        System.out.println(msg);
        double a = 89;
        System.out.println("不知道这个函数干啥用的" + Double.isNaN(a));
        try {
            Class c = Class.forName("java.lang.String");
            String s = (String) c.newInstance();
            System.out.println("类加载器"+c.getClassLoader());
            System.out.println("字段："+c.getFields());
        }catch ( Exception e){
            e.printStackTrace();
        }
    }
}

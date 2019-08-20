package other.timedtask;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class MyTimerTask extends TimerTask {

    SimpleDateFormat sf = new SimpleDateFormat("yy-MM-dd  HH:mm:ss");

    @Override
    public void run() {
        System.out.println("Timer task started at:" + sf.format(new Date()));
        completeTask();
        System.out.println("Timer task finished at:" + sf.format(new Date()));
    }

    private void completeTask() {
        try {
            //assuming it takes 20 secs to complete the task
            Thread.sleep(20 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        TimerTask timerTask = new MyTimerTask();
        //running timer task as daemon thread
        Timer timer = new Timer(true);// 守护进程；后台程序
        /**
         * Timer类包含几个schedule（）方法，用于安排任务在给定日期或延迟一段时间后运行一次。
         * 有几个scheduleAtFixedRate（）方法以一定的间隔定期运行任务。
         */
        timer.scheduleAtFixedRate(timerTask, 0, 10 * 1000);
        System.out.println("TimerTask started");
        //cancel after sometime
        try {
            Thread.sleep(1 * 60 * 1000);//睡眠两分钟
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        timer.cancel();
        System.out.println("TimerTask cancelled");
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

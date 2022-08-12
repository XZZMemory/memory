package algorithm.socialrecruitment.year2022.向量栈;

import java.util.HashMap;
import java.util.Map;

/**
 * description:code
 *
 *
 我们希望实现会议计划程序。它为传入的会议预订时间段。会议占用一个或多个连续的时间段，并且从不与任何其他会议重叠。最初有 N 个可用时隙：0、1、2、...、N-1。


 安排会议 - 给定会议持续时间 D，安排者将预订 D 连续的可用时间段，如果没有此类时间段，则拒绝会议。
 给定已安排的会议，调度程序将释放为此会议预订的所有时间段。
 *
 * @author xiaozhenzhen001
 * @date 2022/7/23
 */
public class Meeting {
    public static void main(String[] args) {
        Meeting meeting = new Meeting();
        int meetingId1 = meeting.schedule(1);
        int meetingId2 = meeting.schedule(3);
        meeting.cancel(meetingId1);

        int meetingId3 = meeting.schedule(3);

    }

    // 会议是否被占用
    public static int[] meeting = new int[24];

    // 会议室长度 key：会议Id，value：会议长度
    public static Map<Integer, Integer> map = new HashMap<>();


    /**
     * 定会议室
     *
     * @return
     */
    public int schedule(int segment) {
        // 1.寻找可用时间段
        int i = 0;
        int curSeg = 0;
        while (true) {
            curSeg = 0;
            int j = i;
            for (; j < meeting.length && curSeg < segment; j++) {
                if (meeting[j] == 1) {
                    break;
                }
                ++curSeg;
            }
            if (curSeg == segment) {
                break;
            }
            i = j + 1;
        }

        // 找到会议室
        if (segment == curSeg) {
            for (int k = 0; k < segment; k++) {
                meeting[k + i] = 1;
            }
            map.put(i, segment);

            // 2.存储会议信息
            return i;

        }
        // 表示没订到会议室
        return -1;
    }

    public boolean cancel(int meetingId) {
        if (meeting[meetingId] == 0) {
            // 说明当前无会议室
            return false;
        }
        // 释放会议室
        int segment = map.get(meetingId);
        map.remove(meetingId);
        for (int k = 0; k < segment; k++) {
            meeting[k + meetingId] = 0;
        }
        return true;
    }
}

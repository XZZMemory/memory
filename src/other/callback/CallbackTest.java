package other.callback;

public class CallbackTest {
    public static void main(String[] args) {
        /**
         * 回调的核心就是回调方将本身即this传递给调用方，
         * 这样调用方就可以在调用完毕之后告诉回调方它想要知道的信息。
         * 双向调用的关系
         * 我的理解，回调方：Student
         * 调用方： Teacher
         * 回调：解耦，解耦
         */
        Student student = new Michael();
        Teacher teacher = new Teacher(student);
        teacher.askQuestion();
    }
    /**
     * 运行结果：  知道了，你的答案是：5
     */
}

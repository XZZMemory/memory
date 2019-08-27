package other.callback;

public class Michael implements Student {
    @Override
    public void resolveQuestion(Callback callback) {
        //模拟思考
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        callback.tellAnswer(5);
    }
}

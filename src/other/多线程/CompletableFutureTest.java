package other.多线程;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

/**
 * description:memory
 *
 * @author xiaozhenzhen001
 * @date 2022/1/26
 */
public class CompletableFutureTest {
    public static void main(String[] args) throws Exception {
        CompletableFuture<String> completableFuture=new CompletableFuture();
        new Thread(){
            @Override
            public void run(){
                System.out.println(Thread.currentThread());
                System.out.println("线程1执行");
                completableFuture.complete("执行结果");

            }
        }.start();
        System.out.println(completableFuture.get());
        CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread());
                System.out.println("线程1执行");

            }
        });

//
//        public CompletableFuture<Void> asyncRunStage (Executor e, Runnable f){
//            if (f == null) throw new NullPointerException();
//            CompletableFuture<Void> d = new CompletableFuture<Void>();
//            e.execute(new CompletableFuture.AsyncRun(d, f));
//            return d;
//        }
    }
}

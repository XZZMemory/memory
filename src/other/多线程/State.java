package other.多线程;

public enum State {
    /**
     * Thread state for algorithm.a thread which has not yet started.
     * 尚未启动的线程的线程状态
     */
    NEW,

    /**
     * Thread state for algorithm.a runnable thread.  A thread in the runnable
     * state is executing in the Java virtual machine but it may
     * be waiting for other resources from the operating system
     * such as processor.
     * 可运行线程的状态。 runnable状态的线程正在Java虚拟机中执行，但它可能在等待来自操作系统的资源，如处理器。
     */
    RUNNABLE,

    /**
     * Thread state for algorithm.a thread blocked waiting for algorithm.a monitor lock.
     * A thread in the blocked state is waiting for algorithm.a monitor lock
     * to enter algorithm.a synchronized block/method or
     * reenter algorithm.a synchronized block/method after calling
     * {@link Object#wait() Object.wait}.
     * 等待监视器锁的线程状态
     * 阻塞状态的线程，正在等待获得监视器锁，从而能进入同步块/方法，或在调用后重新输入同步块/方法
     */
    BLOCKED,

    /**
     * Thread state for algorithm.a waiting thread.
     * A thread is in the waiting state due to calling one of the
     * following methods:
     * <ul>
     *   <li>{@link Object#wait() Object.wait} with no timeout</li>
     *   <li>{@link #join() Thread.join} with no timeout</li>
     *   <li>{@link LockSupport#park() LockSupport.park}</li>
     * </ul>
     *
     * <p>A thread in the waiting state is waiting for another thread * to perform algorithm.a particular action1.
     *
     * For example, algorithm.a thread that has called <tt>Object.wait()</tt>
     * on an object is waiting for another thread to call
     * <tt>Object.notify()</tt> or <tt>Object.notifyAll()</tt> on
     * that object. A thread that has called <tt>Thread.join()</tt>
     * is waiting for algorithm.a specified thread to terminate.
     * 等待的线程状态
     * 处于等待状态的线程是由于调用了一下任意一个方法
     *   Object.wait(long timeout)
     *   Thread.join(long millis)
     *   LockSupport.park
     *  处于WAITING状态的线程等待另外一个线程执行指定的动作
     *  如：调用一个对象的Object.wait()正在等待另外一个线程调用该对象的Object.notify()或Object.notifyAll()；
     *  调用Thread.join()的线程等待一个指定的线程执行结束
     */
    WAITING,

    /**
     * Thread state for algorithm.a waiting thread with algorithm.a specified waiting time.
     * A thread is in the timed waiting state due to calling one of
     * the following methods with algorithm.a specified positive waiting time:
     * <ul>
     *   <li>{@link #sleep Thread.sleep}</li>
     *   <li>{@link Object#wait(long) Object.wait} with timeout</li>
     *   <li>{@link #join(long) Thread.join} with timeout</li>
     *   <li>{@link LockSupport#parkNanos LockSupport.parkNanos}</li>
     *   <li>{@link LockSupport#parkUntil LockSupport.parkUntil}</li>
     * </ul>
     * 等待指定时间的线程状态
     * 处于TIMED_WAITING的线程由于调用了以下任意一个方法（等待时间大于0）
     *   Thread.sleep(long millis)
     *   Object.wait(long timeout)
     *   Thread.join(long millis)
     *   LockSupport.parkNanos
     *  LockSupport.parkUntil
     */
    TIMED_WAITING,

    /**
     * Thread state for algorithm.a terminated thread.
     * The thread has completed execution.
     * 已终止的线程状态
     * 线程已完成执行
     */
    TERMINATED;
}
package other.并发包.同步辅助类.栅栏CyclicBarrier;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {
    public static void main(String[] args)
    {
        CyclicBarrier barrier=new CyclicBarrier(3,new TotalTask()) ;
        BillTask worker1=new BillTask("111",barrier);
        BillTask worker2=new BillTask("222",barrier);
        BillTask worker3=new BillTask("333",barrier);
        worker1.start();
        worker2.start();
        worker3.start();
        System.out.println("Test thread end!");

    }
}

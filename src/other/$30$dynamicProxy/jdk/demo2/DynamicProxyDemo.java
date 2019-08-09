package other.$30$dynamicProxy.jdk.demo2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 网址：https://www.cnblogs.com/rinack/p/7742682.html
 * */
public class DynamicProxyDemo {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        ClassLoader classLoader = electricCar.getClass().getClassLoader();
        Class<?>[] implClass = electricCar.getClass().getInterfaces();
        InvocationHandler invocationHandler = new InvocationHandlerImpl(electricCar);
        Object o = Proxy.newProxyInstance(classLoader, implClass, invocationHandler);
        Vehicle vehicle = (Vehicle) o;
        vehicle.drive();
        Recharge recharge = (Recharge) o;
        recharge.recharge();
    }
}

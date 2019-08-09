package other.$30$dynamicProxy.jdk.demo2;

public class ElectricCar implements Recharge, Vehicle {
    @Override
    public void recharge() {
        System.out.println("Electric Car is Recharging...");
    }

    @Override
    public void drive() {
        System.out.println("Electric Car is Moving silently...");
    }
}

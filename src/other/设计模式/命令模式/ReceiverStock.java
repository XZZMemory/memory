package other.设计模式.命令模式;

public class ReceiverStock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("ReceiverStock [ Name: " + name + ",Quantity: " + quantity + " ] bought");
    }

    public void sell() {
        System.out.println("ReceiverStock [ Name: " + name + ", Quantity: " + quantity + " ] sold");
    }
}

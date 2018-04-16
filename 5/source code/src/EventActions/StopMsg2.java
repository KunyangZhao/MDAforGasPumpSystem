package EventActions;

public class StopMsg2 extends AbstractStopMsg {
    @Override
    //one of the concrete implementations of displayMenu function, called by gasPump-2
    public void stopMsg() {
        System.out.println("Gas pumping is stopped!");
        System.out.println("Input 10 to print receipt and return cash, or input 11 to return cash directly without receipt!");

    }
}

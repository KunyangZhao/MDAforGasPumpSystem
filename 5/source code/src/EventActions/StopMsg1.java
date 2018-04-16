package EventActions;

public class StopMsg1 extends AbstractStopMsg {
    @Override
    //one of the concrete implementations of displayMenu function, called by gasPump-1;
    public void stopMsg() {
        System.out.println("Gas pumping is stopped!");
    }
}

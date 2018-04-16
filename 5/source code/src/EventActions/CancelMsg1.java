package EventActions;

public class CancelMsg1 extends AbstractCancelMsg {
    @Override
    //one of the concrete implementations of cancelMsg function, called by gasPump-1
    public void cancelMsg() {
        System.out.println("Transaction is cancelled! ");
    }
}

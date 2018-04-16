package EventActions;

public class CancelMsg2 extends AbstractCancelMsg {
    @Override
    //one of the concrete implementations of cancelMsg function, called by gasPump-2
    public void cancelMsg() {
        System.out.println("Transaction is cancelled! ");
    }
}

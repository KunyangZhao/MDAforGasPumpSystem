package EventActions;

public class RejectMsg1 extends AbstractRejectMsg {
    @Override
    //one of the concrete implementations of displayMenu function, called by gasPump-1;
    public void rejectMsg() {
        System.out.println("Failed! Your credit card is rejected.");
    }
}

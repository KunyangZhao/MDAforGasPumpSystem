package EventActions;

public class PayMsg2 extends AbstractPayMsg {
    //one of the concrete implementations of displayMenu function, called by gasPump-2;
    @Override
    public void payMsg() {
        System.out.println("Welcome to the GasPump-2 application!");
        System.out.println("Please select your payment type, \nInput 2 to select paying by cash!");
    }
}

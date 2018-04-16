package EventActions;

public class PayMsg1 extends AbstractPayMsg {
    @Override
    //one of the concrete implementations of displayMenu function, called by gasPump-1;
    public void payMsg() {
        System.out.println("Welcome to the GasPump-1 application!");
        System.out.println("Please select your payment type, \nInput 2 to select paying by credit card!");

    }
}

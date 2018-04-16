package EventActions;

import Data.Data;
import Data.DataForGasPump2;

public class PrintReceipt2 extends AbstractPrintReceipt {

    public PrintReceipt2(Data data) {
        super(data);
    }
    //one of the concrete implementations of displayMenu function, called by gasPump-2
    @Override
    public void printReceipt() {
    	//call the data from the data storage class for gasPump-2, in order to display the gas type, the total price and the amount of pumped gas;
        DataForGasPump2 d = (DataForGasPump2) data;
        System.out.println("---------------------Receipt----------------------");
        System.out.println("You pumped " + d.getL() + " liters of " + d.getGasType() + " gas.");
        System.out.println("The total price is " + d.getTotal() + " dollars.");
        System.out.println("---------------------------------－-----－---------");
    }
}

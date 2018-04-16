package EventActions;

import Data.Data;
import Data.DataForGasPump1;

public class PrintReceipt1 extends AbstractPrintReceipt {

    public PrintReceipt1(Data data) {
        super(data);
    }
    //one of the concrete implementations of displayMenu function, called by gasPump-1;
    @Override
    public void printReceipt() {
    	//call the data from the data storage class for gasPump-1, in order to display the gas type, the total price and the amount of pumped gas;
        DataForGasPump1 d = (DataForGasPump1) data;
        System.out.println("---------------------Receipt----------------------");
        System.out.println("You pumped "+d.getG() + " gallons of " + d.getGasType() + " gas.");
        System.out.println("The total price is " + d.getTotal() + " dollars.");
        System.out.println("---------------------------------－-----－---------");
    }
}

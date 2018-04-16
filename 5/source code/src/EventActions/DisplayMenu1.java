package EventActions;

import Data.Data;
import Data.DataForGasPump1;

public class DisplayMenu1 extends AbstractDisplayMenu {

    public DisplayMenu1(Data data) {
        super(data);
    }

    //one of the concrete implementations of displayMenu function, called by gasPump-1
    @Override
    public void displayMenu() {
    	//call the data from the data storage class for gasPump-1, in order to display the unite price of the gas;
        DataForGasPump1 d = (DataForGasPump1) data;
        System.out.println("Approverd!");
        System.out.println("Please select gas type:");
        System.out.println(
                "Input 5 to select Regular Gas, it is " + d.getrPrice() + " dollars per gallon. " + "\nInput 6 to select Super Gas, it is " + d.getsPrice() + " dollars per gallon.");
        System.out.println("input 7 to cancel the transaction.");
    }
}

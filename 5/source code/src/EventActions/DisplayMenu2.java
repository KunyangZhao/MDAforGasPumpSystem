package EventActions;

import Data.Data;
import Data.DataForGasPump2;

public class DisplayMenu2 extends AbstractDisplayMenu {

    public DisplayMenu2(Data data) {
        super(data);
    }
    //one of the concrete implementations of displayMenu function, called by gasPump-2;
    @Override
    public void displayMenu() {
    	//call the data from the data storage class for gasPump-2, in order to display the unite price of the gas;
        DataForGasPump2 d = (DataForGasPump2) data;
        System.out.println("Approverd!");
        System.out.println("Please select gas type:");
        System.out.println(
                "Input 3 to select Regular Gas, it is " + d.getrPrice() + " dollars per liter. \nInput 4 to select Super Gas, it is " + d.getsPrice() + " dollars per liter.  \nInput 5 to select Premium Gas, it is " + d.getpPrice() + " dollars per liter.");
        System.out.println("input 6 to cancel the transaction.");
    }
}

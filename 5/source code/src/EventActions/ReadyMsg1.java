package EventActions;

import Data.Data;
import Data.DataForGasPump1;

public class ReadyMsg1 extends AbstractReadyMsg {

    public ReadyMsg1(Data data) {
        super(data);
    }
    //one of the concrete implementations of displayMenu function, called by gasPump-1;
    @Override
    public void readyMsg() {
    	//call the data from the data storage class for gasPump-1, in order to display the selected gas type;
        DataForGasPump1 d = (DataForGasPump1) data;
        System.out.println("Ready to pump gas!");
        System.out.println("Input 9 to pump 1 gallon of " + d.getGasType() + " gas.");
        System.out.println("Input 10 to stop.");
    }
}

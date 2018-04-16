package EventActions;

import Data.Data;
import Data.DataForGasPump2;

public class ReadyMsg2 extends AbstractReadyMsg {

    public ReadyMsg2(Data data) {
        super(data);
    }
    //one of the concrete implementations of displayMenu function, called by gasPump-2;
    @Override
    public void readyMsg() {
    	//call the data from the data storage class for gasPump-2, in order to display the selected gas type;
        DataForGasPump2 d = (DataForGasPump2) data;        
        System.out.println("Ready to pump gas!");
        System.out.println("Input 8 to pump 1 liter of " + d.getGasType() + " gas.");
        System.out.println("Input 9 to stop.");
    }
}

package EventActions;

import Data.Data;
import Data.DataForGasPump1;

public class StoreData1 extends AbstractStoreData {

    public StoreData1(Data data) {
        super(data);
    }
    //one of the concrete implementations of displayMenu function, called by gasPump-1
    @Override
    public void storeData() {
    	//call the data from the data storage class for gasPump-1;
        DataForGasPump1 d = (DataForGasPump1) data;
        //set the unit price for each gas type in the activation phase.
        d.setrPrice(d.temp_a);   
        d.setsPrice(d.temp_b);
        System.out.println("Set gas prices successfully, GasPump1 is Ready!");
    }
}

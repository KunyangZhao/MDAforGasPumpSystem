package EventActions;

import Data.Data;
import Data.DataForGasPump2;

public class StoreData2 extends AbstractStoreData {

    public StoreData2(Data data) {
        super(data);
    }
    //one of the concrete implementations of displayMenu function, called by gasPump-2
    @Override
    public void storeData() {
    	//call the data from the data storage class for gasPump-2;
        DataForGasPump2 d = (DataForGasPump2) data;
        //set the unit price for each gas type in the activation phase.
        d.setpPrice(d.temp_c);
        d.setrPrice(d.temp_a);   
        d.setsPrice(d.temp_b);
        System.out.println("Set gas prices successfully, GasPump2 is Ready!");
    }
}

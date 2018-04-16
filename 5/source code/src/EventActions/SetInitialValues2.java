package EventActions;

import Data.Data;
import Data.DataForGasPump2;

public class SetInitialValues2 extends AbstractSetInitialValues {

    public SetInitialValues2(Data data) {
        super(data);
    }
    //one of the concrete implementations of displayMenu function, called by gasPump-2
    //This function set the amount of gas and the total price to 0;
    @Override
    public void setInitialValues() {
    	//call the data from the data storage class for gasPump-2, set the amount and the total price to 0;
        DataForGasPump2 d = (DataForGasPump2) data;
        d.setL(0);
        d.setTotal(0); 
    }
}

package EventActions;

import Data.Data;
import Data.DataForGasPump1;

public class SetInitialValues1 extends AbstractSetInitialValues {

    public SetInitialValues1(Data data) {
        super(data);
    }
    //one of the concrete implementations of displayMenu function, called by gasPump-1;
    //This function set the amount of gas and the total price to 0;
    @Override
    public void setInitialValues() {
    	//call the data from the data storage class for gasPump-1, set the amount and the total price to 0;
        DataForGasPump1 d = (DataForGasPump1) data;
        d.setG(0);
        d.setTotal(0); 
    }
}

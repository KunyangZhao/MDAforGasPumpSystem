package EventActions;

import Data.Data;
import Data.DataForGasPump2;

public class PumpGasUnit2 extends AbstractPumpGasUnit {

    public PumpGasUnit2(Data data) {
        super(data);
    }
    //one of the concrete implementations of displayMenu function, called by gasPump-2
    //This function does the calculation to the data when pumping gas/
    @Override
    public void pumpGasUnit() {
    	//call the data from the data storage class for gasPump-2, in order to acquire the gas amount, the unit price of choice gas and store new amount and total price;
        DataForGasPump2 d = (DataForGasPump2) data;
        int l = d.getL();
        //add one gallon of gas
        l++;
        d.setL(l);
        float p = d.getPrice(); 
        //calculate the total price of the pumped gas
        d.setTotal(p*l);
    }
}

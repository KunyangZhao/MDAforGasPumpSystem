package EventActions;

import Data.Data;
import Data.DataForGasPump1;

public class PumpGasUnit1 extends AbstractPumpGasUnit {

    public PumpGasUnit1(Data data) {
        super(data);
    }
    //one of the concrete implementations of displayMenu function, called by gasPump-1;
    //This function does the calculation to the data when pumping gas,
    @Override
    public void pumpGasUnit() {
    	//call the data from the data storage class for gasPump-1, in order to acquire the gas amount, the unit price of choice gas and store new amount and total price;
        DataForGasPump1 d = (DataForGasPump1) data;
        int g = d.getG();
        //add one gallon of gas
        g++;
        d.setG(g);
        float p = d.getPrice(); 
        //calculate the total price of the pumped gas
        d.setTotal(p*g);
    }
}

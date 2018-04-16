package EventActions;

import Data.Data;
import Data.DataForGasPump1;

public class SetPrice1 extends AbstractSetPrice {

    public SetPrice1(Data data) {
        super(data);
    }
    //one of the concrete implementations of displayMenu function, called by gasPump-1;
    @Override
    public void setPrice(int g) {
    	//call the data from the data storage class for gasPump-1;
        DataForGasPump1 d = (DataForGasPump1) data;
        //according to the users' choice, set the unit price and type name;
        if (g == 1) { // Regular gas
            d.setPrice(d.getrPrice());
            d.setGasType("Regular");
        } else if (g == 2) { // Super gas
            d.setPrice(d.getsPrice());
            d.setGasType("Super");
        }
        System.out.println("You choose "+d.getGasType() + " gas, the unit price is " + d.getPrice() + " dollars per gallon.");
        System.out.println("input 8 to start pumping!");
    }
}

package EventActions;

import Data.Data;
import Data.DataForGasPump2;

public class SetPrice2 extends AbstractSetPrice {

    public SetPrice2(Data data) {
        super(data);
    }
    //one of the concrete implementations of displayMenu function, called by gasPump-2
    @Override
    public void setPrice(int g) {
    	//call the data from the data storage class for gasPump-2;
        DataForGasPump2 d = (DataForGasPump2) data;
        //according to the users' choice, set the unit price and type name
        if (g == 1) { // Regular gas
            d.setPrice(d.getrPrice());
            d.setGasType("Regular");
        } else if (g == 2) { // Super gas
            d.setPrice(d.getsPrice());
            d.setGasType("Super");
        }else if (g == 3) { // Premium gas
            d.setPrice(d.getpPrice());
            d.setGasType("Premium");
        }
        System.out.println("You choose "+d.getGasType() + " gas, the unit price is " + d.getPrice() + " dollars per gallon.");
        System.out.println("input 7 to start pumping!");
    }
}

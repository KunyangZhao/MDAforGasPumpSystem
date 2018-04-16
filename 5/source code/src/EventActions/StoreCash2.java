package EventActions;

import Data.Data;
import Data.DataForGasPump2;

public class StoreCash2 extends AbstractStoreCash {

    public StoreCash2(Data data) {
        super(data);
    }
    //one of the concrete implementations of displayMenu function, called by gasPump-2
    @Override
    public void storeCash() {
    	//call the data from the data storage class for gasPump-2;
        DataForGasPump2 d = (DataForGasPump2) data;
        d.setCash(d.temp_cash);
        System.out.println("Cash amount: " + d.getCash()+" dollars.");
    }
}

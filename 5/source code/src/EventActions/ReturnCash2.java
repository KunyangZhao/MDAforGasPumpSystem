package EventActions;

import Data.Data;
import Data.DataForGasPump2;

public class ReturnCash2 extends AbstractReturnCash {

    public ReturnCash2(Data data) {
        super(data);
    }
    //one of the concrete implementations of displayMenu function, called by gasPump-2;
    @Override
    public void returnCash() {
    	//call the data from the data storage class for gasPump-2, in order to acquire the initial cash and the total price;
        DataForGasPump2 d = (DataForGasPump2) data;
        //calculate the remaining cash, by the difference between the initial cash and the total price;
        float remainingCash = d.getCash() - d.getTotal();
        if (remainingCash > 0) {
            System.out.println("Cash return: " + remainingCash + " dollars.");
        } else {
            System.out.println("You have no more cash.");
        }
    }
}

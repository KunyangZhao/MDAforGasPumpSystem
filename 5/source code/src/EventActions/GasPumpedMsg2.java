package EventActions;

import Data.Data;
import Data.DataForGasPump2;

public class GasPumpedMsg2 extends AbstractGasPumpedMsg {

    public GasPumpedMsg2(Data data) {
        super(data);
    }
    //one of the concrete implementations of displayMenu function, called by gasPump-2;
    @Override
    public void gasPumpedMsg() {
    	//call the data from the data storage class for gasPump-2, in order to display gas type and the amount of pumped gas;
        DataForGasPump2 d = (DataForGasPump2) data;        
        System.out.println("1 liter of " + d.getGasType() + " gasoline is pumped!");
        System.out.println("The total amount of gas that pumped already is " + d.getL()+" liters.");
        System.out.println("Enter 8 to continue pumping. \nEnter 9 to stop pumping.");
    }
}

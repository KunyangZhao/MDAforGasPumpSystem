package EventActions;

import Data.Data;
import Data.DataForGasPump1;

public class GasPumpedMsg1 extends AbstractGasPumpedMsg {

    public GasPumpedMsg1(Data data) {
        super(data);
    }
    //one of the concrete implementations of displayMenu function, called by gasPump-1
    @Override
    public void gasPumpedMsg() {
    	//call the data from the data storage class for gasPump-1, in order to display gas type and the amount of pumped gas;
        DataForGasPump1 d = (DataForGasPump1) data;
        System.out.println("1 gallon of " + d.getGasType() + " gasoline is pumped!");
        System.out.println("The total amount of gas that pumped already is " + d.getG()+" gallons.");
        System.out.println("Enter 9 to continue pumping. \nEnter 10 to stop pumping.");
    }

}

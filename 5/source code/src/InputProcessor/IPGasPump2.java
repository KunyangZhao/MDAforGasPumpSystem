package InputProcessor;

import Data.DataForGasPump2;

//The input processor for GasPump1, which is the direct descendants of the abstract class.
public class IPGasPump2 extends InputProcessor {
    //The Input Processor inherits StateMachine object from its superclass.
	//constructor
    public IPGasPump2() {
        super();
    }
    public void Activate(int a, int b, int c) {
        if (a > 0 && b > 0 && c > 0) {
        	//call the data from the data storage class for gasPump-2
            DataForGasPump2 d = (DataForGasPump2) data;
        	d.temp_a = a;
            d.temp_b = b;
            d.temp_c = c;
            model.activate();
            System.out.println("Input 1 to start transaction! ");
        } else {
            System.out.println("The unit price of each gas have to be larger than 0");
        }
    }

    public void Start() {
        model.start();
    }

    public void PayCash(float cash) {
        if (cash > 0) {
            DataForGasPump2 d = (DataForGasPump2) data;
            d.temp_cash = cash;
            model.payType(2);
        } else {
            System.out.println("Cash amount must be greater than 0");
        }
    }

    public void Cancel() {
        model.cancel();
    }

    public void Regular() {
        model.selectGas(1);
    }

    public void Super() {
        model.selectGas(2);
    }

    public void Premium() {
        model.selectGas(3);
    }

    public void StartPump() {
        model.startPump();
    }

    public void PumpLiter() {
        DataForGasPump2 d = (DataForGasPump2) data;
        if (d.cash < d.price * (d.L + 1)) {
            System.out.println("Your cash is not enough! The pumping is stopped!");
            model.stopPump();
        } else {
            model.pump();
        }
    }

    public void Stop() {
        model.stopPump();
    }

    public void Receipt() {
        model.receipt();
        System.out.println("Input 12 to end trasaction! ");
    }

    public void NoReceipt() {
        model.noReceipt();
        System.out.println("Input 12 to end trasaction! ");
    }
}

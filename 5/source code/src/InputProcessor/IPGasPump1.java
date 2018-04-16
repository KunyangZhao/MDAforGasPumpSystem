package InputProcessor;

import Data.DataForGasPump1;

//The input processor for GasPump1, which is the direct descendants of the abstract class.
public class IPGasPump1 extends InputProcessor {
    // The Input Processor inherits StateMachine object from its superclass.
	//constructor
    public IPGasPump1() {
        super();
    }

    public void Activate(float a, float b) {
        if (a > 0 && b > 0) {
        	//call the data from the data storage class for gasPump-1
            DataForGasPump1 d = (DataForGasPump1) data;
            d.temp_a = a;
            d.temp_b = b;
            model.activate();
            System.out.println("Input 1 to start transaction! ");
        } else {
            System.out.println("The unit price of each gas have to be larger than 0");
        }
    }

    public void Start() {
        model.start();
    }

    public void PayCredit() {
        model.payType(1);
        System.out.println("***verification***");
        System.out.println("Input 3 to approve ");
        System.out.println("Input 4 to reject ");
    }

    public void Approved() {
        model.approved();
    }

    public void Reject() {
        model.reject();
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

    public void StartPump() {
        model.startPump();
    }

    public void PumpGallon() {
        model.pump();
    }

    public void StopPump() {
        model.stopPump();
        model.receipt();
        System.out.println("Input 11 to end trasaction! ");
    }
}

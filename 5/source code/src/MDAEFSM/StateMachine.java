package MDAEFSM;

import OutputProcessor.OutputProcessor;

/*
    the EFSM class in the De-centralized State design pattern
    It is responsible for State transitions
*/

public class StateMachine {
    protected State s;
    protected State[] LS;
    private OutputProcessor op;

    public StateMachine() {
        LS = new State[8];
        //Pointer to the initial state
        LS[7] = new InitState(this);
        
        //Pointer to the S0 state
        LS[0] = new S0(this);
        
        //Pointer to the S1 state
        LS[1] = new S1(this);
        
        //Pointer to the S2 state
        LS[2] = new S2(this);
        
        //Pointer to the S3 state
        LS[3] = new S3(this);
        
        //Pointer to the S4 state
        LS[4] = new S4(this);
        
        //Pointer to the S5 state
        LS[5] = new S5(this);
        
        //Pointer to the S6 state
        LS[6] = new S6(this);
        
        //Pointer back to the initial state
        s = LS[7]; 
    }
    
    /*
        Getters and Setters
    */

    public OutputProcessor getOP() {
        return op;
    }

    public void setOP(OutputProcessor op) {
        this.op = op;
    }

    public void activate() {
        s.activate();
    }

    public void start() {
        s.start();
    }

    /*
        credit: t=1
        cash:   t=2
     */
    public void payType(int t) {
        s.payType(t);
    }

    public void approved() {
        s.approved();
    }

    public void reject() {
        s.reject();
    }

    public void cancel() {
        s.cancel();
    }

    /*
    Regular:    g=1
    Super:      g=2
    Premium:    g=3
 */
    public void selectGas(int g) {
        s.selectGas(g);
    }

    public void startPump() {
        s.startPump();
    }

    public void pump() {
        s.pump();
    }

    public void stopPump() {
        s.stopPump();
    }

    public void receipt() {
        s.receipt();
    }

    public void noReceipt() {
        s.noReceipt();
    }


}

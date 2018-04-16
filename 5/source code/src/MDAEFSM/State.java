package MDAEFSM;

/*
    This is the abstract superclass to define the initial operation for each events(print error)
    use the de-centralized State pattern;
    so that it will display an error message if the concrete state class calls the event function, that not override;
*/

public abstract class State {
    StateMachine model;

    public State(StateMachine model) {
        this.model = model;
    }

    void activate(){
        System.out.println("error message: can not impletment this operation in this state!");
    }
    
    void start(){
        System.out.println("error message: can not impletment this operation in this state");
    }

    /*
        credit: 	t=1
        cash:   	t=2
     */
    void payType(int t){
        System.out.println("error message: can not impletment this operation in this state");
    }
    
    void approved(){
        System.out.println("error message: can not impletment this operation in this state");
    }
    
    void reject(){
        System.out.println("error message: can not impletment this operation in this state");
    }
    
    /*
    	Regular:    g=1
    	Super:      g=2
    	Premium:    g=3
     */
    void selectGas(int g){
        System.out.println("error message: can not impletment this operation in this state");
    }
    
    void cancel(){
        System.out.println("error message: can not impletment this operation in this state");
    }
    
    void startPump(){
        System.out.println("error message: can not impletment this operation in this state");
    }
    
    void pump(){
        System.out.println("error message: can not impletment this operation in this state");
    }
    
    void stopPump(){
        System.out.println("error message: can not impletment this operation in this state");
    }
    
    void receipt(){
        System.out.println("error message: can not impletment this operation in this state");
    }
    
    void noReceipt(){
        System.out.println("error message: can not impletment this operation in this state");
    }

}

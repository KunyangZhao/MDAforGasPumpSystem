package InputProcessor;

import Data.Data;
import MDAEFSM.StateMachine;

/*
This is an abstract class that provides virtual methods 
that are to be implemented by the Input Processors of the two gasPumps, which are the direct descendants of the abstract class.
*/
public abstract class InputProcessor {
	//get the pointer to the Data store object and the MDA-EFSM object
	Data data;
    StateMachine model;

    public InputProcessor() {
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public StateMachine getModel() {
        return model;
    }

    public void setModel(StateMachine model) {
        this.model = model;
    }



}

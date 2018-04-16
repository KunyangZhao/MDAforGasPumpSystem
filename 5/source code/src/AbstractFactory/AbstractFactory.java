package AbstractFactory;

import Data.Data;
import InputProcessor.InputProcessor;
import MDAEFSM.StateMachine;
import OutputProcessor.OutputProcessor;

/*
    This is an abstract class that provides virtual methods via signatures,
	that are to be implemented by the concrete gasPump factory classes.
	
	Since we use the abstract factory design pattern, 
 	the client-aspects(gasPump applications) could just import the  AbstractFactory.AbstractFactory package,
  	we do not need to classify the specified gasPump factory!
*/

public abstract class AbstractFactory {

    public abstract Data getDataObj();

    public abstract InputProcessor getInputProcessor();

    public abstract StateMachine getStateMachine();

    public abstract OutputProcessor getOutputProcessor();

}
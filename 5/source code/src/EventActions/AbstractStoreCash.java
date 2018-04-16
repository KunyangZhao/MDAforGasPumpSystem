package EventActions;

import Data.Data;

//use strategy design patterns, so that the specified algorithm can be independently from clients that use it.
public abstract class AbstractStoreCash {
    Data data;
    //since the gasPump-1 does not support this function and gasPump-2 implements this function with parameter,
    //So, two constructors have to be declared in the super abstract class.
    public AbstractStoreCash() {
    }

    public AbstractStoreCash(Data  data) {
        this.data = data;
    }
    //encapsulate a group of individual factories that have a common theme without specifying their concrete classes.
    public abstract void storeCash();
}

package EventActions;

//use strategy design patterns, so that the specified algorithm can be independently from clients that use it.
public abstract class AbstractStopMsg {
    public AbstractStopMsg() {
    }
    //encapsulate a group of individual factories that have a common theme without specifying their concrete classes.
    public abstract void stopMsg();
}

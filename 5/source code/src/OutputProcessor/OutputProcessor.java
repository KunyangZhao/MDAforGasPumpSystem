package OutputProcessor;

import Data.Data;
import EventActions.*;

/*
	This class represents the Output Processor of the MDA and is the client of the various action strategies. 
	Each action having more than one strategy has an abstract class which is associated to the OP, 
	while actions having only one strategy are directly associated with the OP.
*/
public class OutputProcessor {
    private Data data;
    private AbstractCancelMsg cancelMsg;
    private AbstractDisplayMenu displayMenu;
    private AbstractGasPumpedMsg gasPumpedMsg;
    private AbstractPayMsg payMsg;
    private AbstractPrintReceipt printReceipt;
    private AbstractPumpGasUnit pumpGasUnit;
    private AbstractReadyMsg readyMsg;
    private AbstractRejectMsg rejectMsg;
    private AbstractReturnCash returnCash;
    private AbstractSetInitialValues setInitialValues;
    private AbstractSetPrice setPrice;
    private AbstractStopMsg stopMsg;
    private AbstractStoreCash storeCash;
    private AbstractStoreData storeData;

    public OutputProcessor() {
    }
    
    //use strategy design patterns, so that the specified algorithm(specified actions) can be independently from clients that use it.
    public void CancelMsg() {
        cancelMsg.cancelMsg();
    }

    public void DisplayMenu() {
        displayMenu.displayMenu();
    }

    public void GasPumpedMsg() {
        gasPumpedMsg.gasPumpedMsg();
    }

    public void PayMsg() {
       payMsg.payMsg();
    }

    public void PrintReceipt() {
        printReceipt.printReceipt();
    }

    public void PumpGasUnit() {
        pumpGasUnit.pumpGasUnit();
    }

    public void ReadyMsg() {
        readyMsg.readyMsg();
    }

    public void RejectMsg() {
        rejectMsg.rejectMsg();
    }

    public void ReturnCash() {
        returnCash.returnCash();
    }

    public void SetInitialValues() {
        setInitialValues.setInitialValues();
    }

    public void SetPrice(int g) {
        setPrice.setPrice(g);
    }

    public void StopMsg() {
        stopMsg.stopMsg();
    }

    public void StoreCash() {
        storeCash.storeCash();
    }

    public void StoreData() {
        storeData.storeData();
    }



    /*
        GETTERS AND SETTERS
    */


    public Data getData() {
        return data;
    }

    public void setCancelMsg(AbstractCancelMsg cancelMsg) {
        this.cancelMsg = cancelMsg;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void setDisplayMenu(AbstractDisplayMenu displayMenu) {
        this.displayMenu = displayMenu;
    }

    public void setGasPumpedMsg(AbstractGasPumpedMsg gasPumpedMsg) {
        this.gasPumpedMsg = gasPumpedMsg;
    }

    public void setPayMsg(AbstractPayMsg payMsg) {
        this.payMsg = payMsg;
    }

    public void setPrintReceipt(AbstractPrintReceipt printReceipt) {
        this.printReceipt = printReceipt;
    }

    public void setPumpGasUnit(AbstractPumpGasUnit pumpGasUnit) {
        this.pumpGasUnit = pumpGasUnit;
    }

    public void setReadyMsg(AbstractReadyMsg readyMsg) {
        this.readyMsg = readyMsg;
    }

    public void setRejectMsg(AbstractRejectMsg rejectMsg) {
        this.rejectMsg = rejectMsg;
    }

    public void setReturnCash(AbstractReturnCash returnCash) {
        this.returnCash = returnCash;
    }

    public void setSetInitialValues(AbstractSetInitialValues setInitialValues) {
        this.setInitialValues = setInitialValues;
    }

    public void setSetPrice(AbstractSetPrice setPrice) {
        this.setPrice = setPrice;
    }

    public void setStopMsg(AbstractStopMsg stopMsg) {
        this.stopMsg = stopMsg;
    }

    public void setStoreCash(AbstractStoreCash storeCash) {
        this.storeCash = storeCash;
    }

    public void setStoreData(AbstractStoreData storeData) {
        this.storeData = storeData;
    }

}

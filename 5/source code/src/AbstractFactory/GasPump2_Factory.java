package AbstractFactory;

import InputProcessor.IPGasPump2;
import InputProcessor.InputProcessor;
import MDAEFSM.StateMachine;
import OutputProcessor.OutputProcessor;
import Data.Data;
import Data.DataForGasPump2;
import EventActions.*;

/*
    Factory that produces the necessary driver objects for GasPump2
*/
public class GasPump2_Factory extends AbstractFactory {
	private StateMachine model;
	private OutputProcessor op;
    private DataForGasPump2 data;
    private IPGasPump2 ip;
    public GasPump2_Factory() {
        // create all the objects that the GasPump application needs
        data  = new DataForGasPump2();
        ip    = new IPGasPump2();
        model = new StateMachine();
        op    = new OutputProcessor();

        // set the InputProcessor's model object reference
        ip.setModel(model);
        // Both the InputProcessor and OutputProcessor need the data storage class for gasPump-1
        ip.setData(data);
        op.setData(data);

        // For each actions needed in the gasPump-1, set the OutputProcessor's action strategies
        // and also pass in the shared Data, if needed.
        // Since we use strategy design patterns, the specified algorithm can be independently from clients that use it. 
        AbstractCancelMsg cal_msg = new CancelMsg2();
        op.setCancelMsg(cal_msg);
        
        AbstractDisplayMenu display_menu = new DisplayMenu2(data);
        op.setDisplayMenu(display_menu);
        
        AbstractGasPumpedMsg gasPump_msg = new GasPumpedMsg2(data);
        op.setGasPumpedMsg(gasPump_msg);
        
        AbstractPayMsg pay_msg = new PayMsg2();
        op.setPayMsg(pay_msg);
        
        AbstractPrintReceipt printReceipt = new PrintReceipt2(data);
        op.setPrintReceipt(printReceipt);
        
        AbstractPumpGasUnit gasUnit = new PumpGasUnit2(data);
        op.setPumpGasUnit(gasUnit);
        AbstractReadyMsg ready_msg = new ReadyMsg2(data);
        op.setReadyMsg(ready_msg);
        
        AbstractRejectMsg reject_msg = new RejectMsg2();
        op.setRejectMsg(reject_msg);
        
        AbstractReturnCash returnCash = new ReturnCash2(data);
        op.setReturnCash(returnCash);
        
        AbstractSetInitialValues setInitial = new SetInitialValues2(data);
        op.setSetInitialValues(setInitial);
        
        AbstractSetPrice setPrice = new SetPrice2(data);
        op.setSetPrice(setPrice);
        
        AbstractStopMsg stop_msg = new StopMsg2();
        op.setStopMsg(stop_msg);
        
        AbstractStoreCash storeCash = new StoreCash2(data);
        op.setStoreCash(storeCash);
        
        AbstractStoreData storeData = new StoreData2(data);
        op.setStoreData(storeData);

        // set the EFSM model's OutputProcessor's object reference
        model.setOP(op);
    }

    @Override
    public Data getDataObj() {
        return this.data;
    }

    @Override
    public InputProcessor getInputProcessor() {
        return this.ip;
    }

    @Override
    public StateMachine getStateMachine() {
        return this.model;
    }

    @Override
    public OutputProcessor getOutputProcessor() {
        return this.op;
    }

}

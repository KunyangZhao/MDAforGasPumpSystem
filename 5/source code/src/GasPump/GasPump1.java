package GasPump;


import AbstractFactory.AbstractFactory;
import InputProcessor.IPGasPump1;

/*
 * the concrete class for GasPump-1 application
 * Since we use the abstract factory design pattern, 
 * we just import the  AbstractFactory.AbstractFactory package,
 * we do not need to classify the specified gasPump factory!
 */
public class GasPump1 {
    private IPGasPump1 ip;
    
    //constructor
    public GasPump1(AbstractFactory af) {
        this.ip = (IPGasPump1)af.getInputProcessor();
    }
    
    public void Activate(Float a, Float b) {
        ip.Activate(a, b);
    }

    public void Start() {
        ip.Start();
    }

    public void PayCredit() {
        ip.PayCredit();
    }

    public void Approve() {
        ip.Approved();
    }

    public void Reject() {
        ip.Reject();
    }

    public void Regular() {
        ip.Regular();
    }

    public void Super() {
        ip.Super();
    }

    public void Cancel() {
        ip.Cancel();
    }

    public void StartPump() {
        ip.StartPump();
    }

    public void PumpGallon() {
        ip.PumpGallon();
    }

    public void StopPump() {
        ip.StopPump();
    }

}

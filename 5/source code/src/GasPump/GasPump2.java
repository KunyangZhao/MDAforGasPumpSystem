package GasPump;

import AbstractFactory.AbstractFactory;
import InputProcessor.IPGasPump2;

/*
 * the concrete class for GasPump-2 application
 * Since we use the abstract factory design pattern, 
 * we just import the  AbstractFactory.AbstractFactory package,
 * we do not need to classify the specified gasPump factory!
 */
public class GasPump2 {
	private IPGasPump2 ip;
    public GasPump2(AbstractFactory af) {
        this.ip = (IPGasPump2)af.getInputProcessor();
    }
    public void Activate(Integer a, Integer b, Integer c) {
        ip.Activate(a, b, c);
    }

    public void Start() {
        ip.Start();
    }

    public void PayCash(Float cash) {
        ip.PayCash(cash);
    }

    public void Cancel() {
        ip.Cancel();
    }

    public void Regular() {
        ip.Regular();
    }

    public void Super() {
        ip.Super();
    }

    public void Premium() {
        ip.Premium();
    }

    public void StartPump() {
        ip.StartPump();
    }

    public void PumpLiter() {
        ip.PumpLiter();
    }

    public void Stop() {
        ip.Stop();
    }

    public void Receipt() {
        ip.Receipt();
    }

    public void NoReceipt() {
        ip.NoReceipt();
    }
}

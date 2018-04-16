package Data;


public class DataForGasPump1 extends Data {
	/*
	 * all the concrete data used by gasType-1;
	 */
	//The name of selected gas type 
    public String   gasType;
    //The price of regular gas
    public float    rPrice;
    
    //The price of super gas
	public float sPrice;
    
	//The price of selected gas
    public float    price;
    
    //The total number of gas that is pumped
    public int      G;
    
    //The total price of the pumped gas
    public float    total;

    // temporary variables
    public float temp_a;
    public float temp_b;
    
    /*
     * getters and setters
     */
	public String getGasType() {
		return gasType;
	}
	public void setGasType(String gasType) {
		this.gasType = gasType;
	}

	public void setrPrice(float rPrice) {
		this.rPrice = rPrice;
	}
	public float getsPrice() {
		return sPrice;
	}
	public void setsPrice(float sPrice) {
		this.sPrice = sPrice;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getG() {
		return G;
	}
	public void setG(int g) {
		G = g;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}

	public float getrPrice() {
		return rPrice;
	}
    
    
    

}

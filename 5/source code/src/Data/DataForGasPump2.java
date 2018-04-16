package Data;

public class DataForGasPump2 extends Data {
	/*
	 * all the concrete data used by gasType-2;
	 */
	//The name of selected gas type 
    public String   gasType;
    //The price of regular gas
    public int      rPrice;
    //The price of super gas
    public int      sPrice;
    //The price of premium gas
    public int      pPrice;
    
    //The amount of cash from the user
    public float    cash;
    
    //The price of selected gas
    public int      price;
    
    //The total number of gas that is pumped
    public int      L;
    
    //The total price of the pumped gas
    public float      total;

    // temporary variables
    public int temp_a;
    public int temp_b;
    public int temp_c;
    public float temp_cash;
    
    /*
     * getters and setters
     */
	public String getGasType() {
		return gasType;
	}
	public void setGasType(String gasType) {
		this.gasType = gasType;
	}
	public int getrPrice() {
		return rPrice;
	}
	public void setrPrice(int rPrice) {
		this.rPrice = rPrice;
	}
	public int getsPrice() {
		return sPrice;
	}
	public void setsPrice(int sPrice) {
		this.sPrice = sPrice;
	}
	public int getpPrice() {
		return pPrice;
	}
	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}
	public float getCash() {
		return cash;
	}
	public void setCash(float cash) {
		this.cash = cash;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getL() {
		return L;
	}
	public void setL(int l) {
		L = l;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
    
    
}

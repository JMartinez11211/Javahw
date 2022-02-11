package Getters_setters;

public class PcInfo {
	
	static int pcStock= 0;
	
	private  String name;
	private int year;
	private double cost;
	
	
	public PcInfo() {
		pcStock++;
		
	}
	
	public  static void totalPcStock()
    {
    	System.out.println("Total computers in stock: "+ pcStock);
    }
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
}

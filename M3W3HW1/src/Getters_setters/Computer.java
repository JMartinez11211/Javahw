package Getters_setters;

public class Computer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating POJOs or Beans
		PcInfo pc1 = new PcInfo();
		PcInfo pc2 = new PcInfo();
		PcInfo pc3 = new PcInfo();
		
		
		//Assigning or setting the properties
		
		pc1.setName("PowerSpec G511 Gaming PC");
		pc1.setCost(1299.99);
		pc1.setYear(2021);
		
		pc2.setName("PowerSpec G470 Gaming PC");
		pc2.setCost(3299.99);
		pc2.setYear(2022);
		
		pc3.setName("Dell XPS 8940 Gaming PC Platinum Collection");
		pc3.setCost(1549.99);
		pc3.setYear(2020);
		
		//Displaying or getting the properties
		
				PcInfo.totalPcStock();
				System.out.println();
		 
				System.out.println(pc1.getName());
				System.out.println("Priced at: $" +pc1.getCost());
				System.out.println("Year Model:  " +pc1.getYear());
				System.out.println();
				
				System.out.println(pc2.getName());
				System.out.println("Priced at: $" +pc2.getCost());
				System.out.println("Year Model:  " +pc2.getYear());
				System.out.println();
				
				System.out.println(pc3.getName());
				System.out.println("Priced at: $" +pc3.getCost());
				System.out.println("Year Model: " +pc3.getYear());
				System.out.println();
		     
				
			   
		
		
	}

}

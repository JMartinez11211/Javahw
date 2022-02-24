package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ComputerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext Context = SpringApplication.run(ComputerApplication.class, args);
	
	
	Desktop dt1 = Context.getBean(Desktop.class);
	
	dt1.setName("PowerSpec G439 Gaming PC");
	dt1.setOs("Windows");
	dt1.setPrice(2299.99);
	
	Laptop lptp1 = Context.getBean(Laptop.class);
	lptp1.setName("ASUS ROG Strix G17 G713QR-ES98Q 17.3");
	lptp1.setOs("Windows");
	lptp1.setPrice(1899.99);
	
	PcInfo pcinfo1= Context.getBean(PcInfo.class);
	PcInfo pcinfo2= Context.getBean(PcInfo.class);
	
	//pc1  info
	pcinfo1.setCpu("Intel Core i7 12th Gen 12700KF 3.6GHz Processor ");
	pcinfo1.setGpu("NVIDIA GeForce RTX 3070 Ti ");
	pcinfo1.setRam("32GB DDR4-3200 RAM ");
	
	//lptp1 info
	pcinfo2.setCpu("AMD Ryzen 9 5900HX 3.3GHz Processor ");
	pcinfo2.setGpu("NVIDIA GeForce RTX 3070 ");
	pcinfo2.setRam("32GB DDR4-3200 RAM ");
	
	dt1.display();
	dt1.setPcInfo(pcinfo1);
	dt1.getPcInfo().display();
	
	lptp1.display();
	lptp1.setPcInfo(pcinfo2);
	lptp1.getPcInfo().display();
	
	
	}

	
}

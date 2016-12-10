package com.alexchetcuti.azure.coursework;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Common.createVehiclesSpeedingTable();
		
		System.out.println("Vehicles Speeding Table created successfully!");
		
		boolean contVehiclesRead = true;
	    while(true)  {
	    	if (contVehiclesRead) {
	    		contVehiclesRead = Common.receiveVehicleSpeedingMessages();
	    	} else {
	            System.out.println("I'm tired, guess I'll sleep for 30 seconds!");
				contVehiclesRead = true;
	            try {
					Thread.sleep(30000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }
	    }
	}
}

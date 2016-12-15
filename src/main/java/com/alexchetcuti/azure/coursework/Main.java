package com.alexchetcuti.azure.coursework;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Common.createVehiclesSpeedingTable();
		System.out.println("Vehicles Speeding Table created successfully!");
		
		boolean contVehiclesRead = true;
		int timeSleep = 1000;
		int timeSleepMax = 128000;
	    while(true)  {
	    	if (contVehiclesRead) {
	    		contVehiclesRead = Common.receiveVehicleSpeedingMessages();
	    		if (contVehiclesRead) timeSleep = 1000;
	    	} else {
	            System.out.println("I'm tired, guess I'll sleep for " + timeSleep/1000 + " second"
	            		+ ((timeSleep/1000) > 1 ? "s" : "") + "!");
	            
	            if (timeSleep < timeSleepMax) {
	            	timeSleep  = timeSleep * 2;
	            }
				contVehiclesRead = true;
	            try {
					Thread.sleep(timeSleep);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }
	    }
	}
}

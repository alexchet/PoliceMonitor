package com.alexchetcuti.azure.coursework;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum VehicleType {
	CAR(1),
    TRUCK(2),
    MOTORCYCLE(3);
    
	private int value;
    private VehicleType(int value) {
    	this.value = value;
    }
    
    public int getValue() {
    	return value;
    }
    
    public static final List<VehicleType> VALUES =
    	    Collections.unmodifiableList(Arrays.asList(values()));
    public static final int SIZE = VALUES.size();
}

package com.alexchetcuti.azure.coursework;

import com.microsoft.azure.storage.table.TableServiceEntity;

public class VehicleEntity extends TableServiceEntity {
	
	public VehicleEntity() {
		
	}
	
	public VehicleEntity(String vehicleType, String regPlate, int velocity, int cameraUniqueID) {
		this.partitionKey = String.valueOf(cameraUniqueID);
		this.rowKey = regPlate;
		this.vehicleType = vehicleType;
		this.regPlate = regPlate;
		this.velocity = velocity;
		this.cameraUniqueID = cameraUniqueID;
	}
	
	public String toString()
	{
		return "Vehicle Type: " + this.getVehicleType().toString() + " | " +
				"Registration Plate: " + this.getRegPlate() + " | " +
				"Velocity: " + this.getVelocity() + " | " +
				"Camera Unique ID: " + this.getCameraUniqueID();
	}
	
	private String vehicleType;
	private String regPlate;
	private int velocity;
	private int cameraUniqueID;
	
	/**
	 * @return the vehicleType
	 */
	public String getVehicleType() {
		return vehicleType;
	}

	/**
	 * @param vehicleType the vehicleType to set
	 */
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	/**
	 * @return the regPlate
	 */
	public String getRegPlate() {
		return regPlate;
	}

	/**
	 * @param regPlate the regPlate to set
	 */
	public void setRegPlate(String regPlate) {
		this.regPlate = regPlate;
	}

	/**
	 * @return the velocity
	 */
	public int getVelocity() {
		return velocity;
	}

	/**
	 * @param velocity the velocity to set
	 */
	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}

	/**
	 * @return the cameraUniqueID
	 */
	public int getCameraUniqueID() {
		return cameraUniqueID;
	}

	/**
	 * @param cameraUniqueID the cameraUniqueID to set
	 */
	public void setCameraUniqueID(int cameraUniqueID) {
		this.cameraUniqueID = cameraUniqueID;
	}

}
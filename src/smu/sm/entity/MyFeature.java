package smu.sm.entity;

import java.io.Serializable;

public class MyFeature implements Serializable {
	private static final long serialVersionUID = -3740187548326167759L;

	private String feature;
	private int frequency;
	private double weight;
	
	public MyFeature(){}
	
	public MyFeature(String feature) {
		super();
		this.feature = feature;
	}
	
	public String getFeature() { return feature; }
	public void setFeature(String feature) { this.feature = feature; }
	
	public int getFrequency() { return frequency;}
	public void setFrequency(int frequency) { this.frequency = frequency; }

	public double getWeight() { return weight; }
	public void setWeight(double weight) { this.weight = weight; }
}

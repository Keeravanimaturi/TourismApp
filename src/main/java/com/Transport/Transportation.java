package com.Transport;

import java.time.LocalDateTime;

public class Transportation {
    private String source;
    private String destination;
    private LocalDateTime dateTime; 
    private double packagePrice,oneway;// This can be a string or a more structured date-time object
	public Transportation(String source, String destination, LocalDateTime dateTime,double packagePrice,double oneway) {
		this.source=source;
		this.destination=destination;
		this.dateTime=dateTime;
		this.packagePrice=packagePrice;
		this.oneway=oneway;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	public double getPackagePrice() {
		return packagePrice;
	}
	public void setPackagePrice(double packagePrice) {
		this.packagePrice = packagePrice;
	}
	public double getOneway() {
		return oneway;
	}
	public void setOneway(double oneway) {
		this.oneway = oneway;
	}    
	
}

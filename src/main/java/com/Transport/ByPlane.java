package com.Transport;

import java.time.LocalDateTime;

public class ByPlane extends Transportation {
	public ByPlane(String source, String destination, LocalDateTime dateTime,double PackagePrice) {
        super(source, destination, dateTime,PackagePrice);
    }
}

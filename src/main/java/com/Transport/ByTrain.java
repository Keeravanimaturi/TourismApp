package com.Transport;

import java.time.LocalDateTime;

public class ByTrain extends Transportation {
    
    public ByTrain(String source, String destination, LocalDateTime dateTime,double PackagePrice,double oneway) {
        super(source, destination, dateTime,PackagePrice,oneway);
    }
}
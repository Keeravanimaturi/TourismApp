package com.Transport;

import java.time.LocalDateTime;

public class ByBus  extends Transportation {
   
    public ByBus(String source, String destination, LocalDateTime dateTime,double PackagePrice,double oneway) {
        super(source, destination, dateTime,PackagePrice,oneway);
    }

}

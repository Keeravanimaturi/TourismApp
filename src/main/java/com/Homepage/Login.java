package com.Homepage;

import java.util.Random;
import java.util.Scanner;

public class Login {
	private int  otp;
	Scanner sc=new Scanner(System.in);
	 public int generate() {
	    	Random r=new Random();
	    	int otp =  r.nextInt(222222);
	        setOtp(otp);
			return otp; 
	    }
	    public void verify() {
	    	int sysotp=generate();
	    	System.out.println("OTP:"+sysotp);
	    	System.out.println("Enter OTP:");
	    	int no=sc.nextInt();
	    	    if (no==(sysotp)) { // Compare the contents of the lists using equals
	    	        System.out.println("Verified ......");
	    	    } else {
	    	        System.out.println("Verification failed.");
	    	    }    
	    }

		public int getOtp() {
			return otp;
		}

		public void setOtp(int otp) {
			this.otp = otp;
		}
		
}

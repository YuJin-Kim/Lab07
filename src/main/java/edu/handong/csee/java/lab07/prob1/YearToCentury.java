package edu.handong.csee.java.lab07.prob1;

/**
 * 
 * @author YuJin
 *
 */

public class YearToCentury {
	int year; // create 
	
	public YearToCentury() {
		// TODO Auto-generated constructor stub
		year=0;
	}
	
	public YearToCentury(int y) {
		year=y;
	}
	
	public int clac_century() {
		if (year%100==0)
			return year/100;
		else
			return year/100+1;
	}

}

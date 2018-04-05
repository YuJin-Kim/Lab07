package edu.handong.csee.java.lab07.prob1;

import java.util.Scanner;

/**
 * This class defines a YearToCentury_main. <br>
 * The YearToCentury_main class have no members.<br>
 * The YearToCentury_main class have no methods.<br>
 * YearToCentury_main is the class which main_controller by using YearToCentury object.<br>
 * 
 * @author YuJin
 *
 */

public class YearToCentury_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year; // create int type variable 'year'
		Scanner keyboard = new Scanner(System.in); // for scanner
		
		System.out.println("Input year:"); // print out ""
		year = keyboard.nextInt(); // input int type variable year by keyboard
		
		YearToCentury y = new YearToCentury(year); // create YearToCentury object 'y' and initialize value of year
		
		System.out.println(year+" is "+y.clac_century()+"th century."); // print out ""+return value of y.calc_century()
	}

}

package edu.handong.csee.java.lab07.prob3;

import java.util.Random; // Create random numbers from 0 to 100

/**
 * This class defines a Attendance_main. <br>
 * The Attendance_main class have no members.<br>
 * The Attendance_main class have no methods.<br>
 * Attendance_main is the class which main_controller by using Attendance object.<br>
 * 
 * @author YuJin
 *
 */

public class Attendance_main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Attendance s1 = new Attendance(); // create Attendance object 's1' without parameter
		Attendance s2 = new Attendance(); // create Attendance object 's2' without parameter
		Attendance s3 = new Attendance("Lucas", 1, "21833222", 0); // create Attendance object 's3' with four parameters
		Attendance s4 = new Attendance("Martha", 2, "21733444", 0); // create Attendance object 's4' with four parameters

		s1.set_name("Jess"); // execute s1.set_name() method
		s1.set_grade(4); // execute s1.set_grade() method
		s1.set_id("21400999"); // execute s1.set_id() method
		s1.set_absent(0); // execute s1.set_sbsent() method
		s2.set_name("Kent"); // execute s2.set_name() method
		s2.set_grade(2); // execute s2.set_grade() method
		s2.set_id("21700111"); // execute s2.set_id() method
		s2.set_absent(0); // execute s2.set_absent() method

		Random rnum = new Random(); // create Random object 'rnum'

		s1.set_absent(rnum.nextInt(10)); // execute s1.set_absent() method with random value(0~10)
		s2.set_absent(rnum.nextInt(10)); // execute s2.set_absent() method with random value(0~10)
		s3.set_absent(rnum.nextInt(10)); // execute s3.set_absent() method with random value(0~10)
		s4.set_absent(rnum.nextInt(10)); // execute s4.set_absent() method with random value(0~10)
		
		if(s1.get_absent() > 6) {
			System.out.println("I'm sorry " + s1.get_name() + ". You failed this course");
			System.out.println(s1.get_name() + "'s number of absence: " + s1.get_absent());
		}
		else
			System.out.println("Keep it up, " + s1.get_name());
		
		if(s2.get_absent() > 6) {
			System.out.println("I'm sorry " + s2.get_name() + ". You failed this course");
			System.out.println(s2.get_name() + "'s number of absence: " + s2.get_absent());
		}
		else
			System.out.println("Keep it up, " + s2.get_name());
		
		if(s3.get_absent() > 6) {
			System.out.println("I'm sorry " + s3.get_name() + ". You failed this course");
			System.out.println(s3.get_name() + "'s number of absence: " + s3.get_absent());
		}
		else
			System.out.println("Keep it up, " + s3.get_name());
		
		if(s4.get_absent() > 6) {
			System.out.println("I'm sorry " + s1.get_name() + ". You failed this course");
			System.out.println(s4.get_name() + "'s number of absence: " + s4.get_absent());
		}
		else
			System.out.println("Keep it up, " + s4.get_name());
		
	}

}

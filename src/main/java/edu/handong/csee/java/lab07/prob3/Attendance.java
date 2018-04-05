package edu.handong.csee.java.lab07.prob3;

/**
 * This class defines a Attendance object. <br>
 * The Attendance class have name, grade, student_id and absent members.<br>
 * The Attendance class have Attendance constructor, setter and getter methods.<br>
 * 
 * @author YuJin
 *
 */

public class Attendance {
	String name; // create String type member name
	int grade; // create int type member grade
	String student_id; // create String type member student_id
	int absent; // create int type member absent
	
	public Attendance() { // Attendance constructor
		// TODO Auto-generated constructor stub
		
		name="Null"; // put Null to name
		grade=0; // put zero to grade
		student_id="Null"; // put Null to student_id
		absent=0; // put zero to absent
	}
	
	public Attendance(String n, int g, String id, int a) { // Attendance constructor with parameters
		name=n; // put n to name
		grade=g; // put g to grade
		student_id=id; // put id to student_id
		absent=a; // put a to absent
	}
	
	public void set_name(String n) { // setting name method
		name=n; // put n to name
	}
	
	public void set_grade(int g) { // setting grade method
		grade=g; // put g to grade
	}
	
	public void set_id(String id) { // setting id method
		student_id=id; // put id to student_id
	}
	
	public void set_absent(int a) { // setting absent method
		absent=a; // put a to absent
	}
	
	public String get_name() { // getting name method
		return name; // return name
	}
	
	public int get_grade() { // getting grade method
		return grade; // return grade
	}
	
	public String get_id() { // getting id method
		return student_id; // return student_id
	}
	
	public int get_absent() { // getting absent method
		return absent; // return absent
	}

}

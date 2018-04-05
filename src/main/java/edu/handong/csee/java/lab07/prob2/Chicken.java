package edu.handong.csee.java.lab07.prob2;

/**
 * 
 * @author YuJin
 *
 */

public class Chicken {
	String name;
	double price;
	int star;
	
	public Chicken() {
		// TODO Auto-generated constructor stub
		name="";
		price=0;
		star=0;
	}
	
	public Chicken(String n, double p, int s) {
		name=n;
		price=p;
		star=s;
	}
	
	public void set_name(String n) {
		name=n;
	}
	
	public void set_star(int s) {
		star=s;
	}
	
	public void set_price(double p) {
		price=p;
	}
	
	public String get_name() {
		return name;
	}
	
	public int get_star() {
		return star;
	}
	
	public double get_price() {
		return price;
	}
}

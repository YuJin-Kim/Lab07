package edu.handong.csee.java.lab07.prob2;

/**
 * 
 * @author YuJin
 *
 */

public class Chicken_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chicken c1 = new Chicken("Cheese_mustard", 16000, 0);
		Chicken c2 = new Chicken("Honey_mustard", 16000, 0);
		Chicken c3 = new Chicken("Spicey_chicken", 16000, 0);

		c1.set_star(3);
		c2.set_star(4);
		c3.set_star(1);

		System.out.println(c1.get_name() + "'s rating is " + c1.get_star());
		System.out.println(c2.get_name() + "'s rating is " + c2.get_star());
		System.out.println(c3.get_name() + "'s rating is " + c3.get_star());
	}

}

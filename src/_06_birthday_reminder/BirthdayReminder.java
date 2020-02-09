
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "August 14th";
		String dadsBirthday = "August 13th";
		String myBirthday = "January 2nd";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String userBirthday = JOptionPane.showInputDialog("Type in mom, dad, Bani and so much more to figure out our brithdays");
		// 3. Print out what the user typed
		System.out.println(userBirthday);
		// 4. if user asked for "mom"
		if (userBirthday.equals("mom")) {
			System.out.println(momsBirthday);
		}
           //print mom's birthday
		// 5. if user asked for "dad"
		else if (userBirthday.equals("dad")) {
			System.out.println(dadsBirthday);
		}
			// print dad's birthday
		// 6. if user asked for your name
		else if (userBirthday.equals("Bani")) {
			System.out.println(myBirthday);
		}else { System.out.println("Sorry I dont remember that person's birthday");}
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}

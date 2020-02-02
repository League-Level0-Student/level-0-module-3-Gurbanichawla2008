package _05_horoscope;

import javax.swing.JOptionPane;

public class Horascope {
	public static void main(String[] args) {

		String starSign = JOptionPane.showInputDialog("Type in your star sign and i will tell u ur horascope");
		if (starSign.equals("Aries")) {
			JOptionPane.showMessageDialog(null, "Ur gonna lose ur job");
		}
		else if (starSign.equals("Taurus")) {
			JOptionPane.showMessageDialog(null, "Ur gonna stub ur toe today");
		}
		else if (starSign.equals("Gemini")) {
			JOptionPane.showMessageDialog(null, "Ur gonna get a good grade on ur next test");
		}
		else if (starSign.equals("Cancer")) {
			JOptionPane.showMessageDialog(null, "Ur gonna lose ur next game");
		}
		else if (starSign.equals("Leo")) {
			JOptionPane.showMessageDialog(null, "Ur gonna win $10");
		}
		else if (starSign.equals("Virgo")) {
			JOptionPane.showMessageDialog(null, "Ur crush is gonna hate u");
		}
		else if (starSign.equals("Libra")) {
			JOptionPane.showMessageDialog(null, "All ur friends parents are gonna hate u cuz ur a brat");
		}
		else if (starSign.equals("Scorpio")) {
			JOptionPane.showMessageDialog(null, "Ur gonna be loved so much by all ur friends cuz ur awsome!!");
		}
		else if (starSign.equals("Sagittarius")) {
			JOptionPane.showMessageDialog(null, "Ur gonna get food poisoning tonight");
		}
		else if (starSign.equals("Capricorn")) {
			JOptionPane.showMessageDialog(null, "We da best we dont need no horascope!!!");
		}
		else if (starSign.equals("Aquarius")) {
			JOptionPane.showMessageDialog(null, " Ur gonna lose yr pet!!!");
		}
		else if (starSign.equals("Pisces")) {
			JOptionPane.showMessageDialog(null, " U will win the oppertunity to go to a charter school!!!");

		} else {
			JOptionPane.showMessageDialog(null, " that aint a Zodiac sign");
		}
	}
}
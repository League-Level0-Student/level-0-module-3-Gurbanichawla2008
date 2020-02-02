package _04_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {

		String feelings = JOptionPane.showInputDialog("Are you happy? yes or no?");
		if (feelings.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing what ur doing");
		} else {
			String deppresed = JOptionPane.showInputDialog("Do you want to be happy? yes or no?");
			if (deppresed.equals("yes")) {
				JOptionPane.showMessageDialog(null, "change something");
			} else {
				JOptionPane.showMessageDialog(null, "Keep doing what ur doing");
			}

		}

	}
}

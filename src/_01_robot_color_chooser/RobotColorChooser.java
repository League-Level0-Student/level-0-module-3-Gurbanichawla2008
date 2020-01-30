//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.AWTException;
import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot bani = new Robot();
bani.setSpeed(100);
for (int b = 0; b < 5; b++) {
	

		// 3. Ask the user what color they would like the robot to draw
		String color = JOptionPane.showInputDialog("What color would you like the robot to draw, red,blue or green?");
		// 5. Use an if/else statement to set the pen color that the user requested
		bani.penDown();
		if (color.equals("red")) {
			bani.setPenColor(Color.red);
		}
		else if (color.equals("blue")) {
			bani.setPenColor(Color.blue);
		}
		else if (color.equals("green")) {
			bani.setPenColor(Color.green);
		} else {
			bani.setRandomPenColor();
			JOptionPane.showMessageDialog(null, "You didnt listen!!!!");
		}
		// 6. If the user doesn’t enter anything, choose a random color

		// 7. Put a loop around your code so that you keep asking the user for more
		// colors & drawing them

		// 4. Set the pen width to 10
		bani.setPenWidth(5);
		// 2. Make the robot draw a shape (this will take more than one line of code)
		for (int i = 200; i>0; i-=10) {
			bani.move(i);
			bani.turn(150);
		}
	}

	}
}

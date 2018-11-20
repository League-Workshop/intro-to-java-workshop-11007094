package section2;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class FourSquare {

	// 2. Create a new Robot

	void go() {
		// 4. Make the robot move as fast as possible

		// 5. Set the pen width to 5

		// 6. Use a for loop to repeat steps #7 to #8, four times...

		// 7. Set the pen color to random

		// 1. Call the drawSquare() method

		// 8. Turn the robot 90 degrees to the right

	}

	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		/* 3. Fill in the code to draw a square inside the method below. */

	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

	{
		Robot r2d2 = new Robot();
		r2d2.setRandomPenColor();
		r2d2.setPenWidth(5);
		r2d2.penDown();
		r2d2.setSpeed(200);
		r2d2.move(200);
		r2d2.setRandomPenColor();
		r2d2.turn(90);
		r2d2.move(200);
		r2d2.setRandomPenColor();
		r2d2.turn(90);
		r2d2.move(200);
		r2d2.setRandomPenColor();
		r2d2.turn(90);
		r2d2.move(200);
		r2d2.setRandomPenColor();
		r2d2.move(200);

		Robot c3po = new Robot();
		c3po.setSpeed(200);
		c3po.setRandomPenColor();
		c3po.setPenWidth(5);
		c3po.penDown();
		c3po.move(200);
		r2d2.turn(90);
		c3po.turn(270);
		r2d2.setRandomPenColor();
		r2d2.move(200);
		c3po.setRandomPenColor();
		c3po.move(200);
		r2d2.setRandomPenColor();
		r2d2.turn(180);
		Robot r3d2 = new Robot();
		r2d2.setRandomPenColor();
		r2d2.setPenWidth(5);
		r2d2.penDown();
		r2d2.setSpeed(200);
		r2d2.move(200);
		r2d2.setRandomPenColor();
		r2d2.turn(90);
		r2d2.move(200);
		r2d2.setRandomPenColor();
		r2d2.turn(90);
		r2d2.move(200);
		r2d2.setRandomPenColor();
		r2d2.turn(90);
		r2d2.move(200);
		r2d2.setRandomPenColor();
		r2d2.move(200);

		Robot c4po = new Robot();
		c4po.setSpeed(200);
		c4po.setRandomPenColor();
		c4po.setPenWidth(5);
		c4po.penDown();
		c4po.move(200);
		r2d2.turn(90);
		c4po.turn(270);
		r2d2.setRandomPenColor();
		r2d2.move(200);
		c4po.setRandomPenColor();
		c4po.move(200);
		r2d2.setRandomPenColor();
		r2d2.turn(180);
		Robot g3po = new Robot();
		g3po.setSpeed(200);
		g3po.setRandomPenColor();
		g3po.setPenWidth(5);
		g3po.penDown();
		g3po.move(200);
		g3po.turn(90);
		g3po.turn(270);
		g3po.setRandomPenColor();
		g3po.move(200);
		c4po.setRandomPenColor();
		c4po.move(200);
		r2d2.setRandomPenColor();
		r2d2.turn(180);

	}
}

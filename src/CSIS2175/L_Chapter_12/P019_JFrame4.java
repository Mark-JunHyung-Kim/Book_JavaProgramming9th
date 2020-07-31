package CSIS2175.L_Chapter_12;
//Date : 2020.07.30
//Name : Mark JunHyung Kim
//Chapter : Lecture#12 = Chapter#12
//Subject : P019 - JFrame4


import javax.swing.*;
import java.awt.*;				// import statement for the 'Font' class
public class P019_JFrame4 
{

	public static void main(String[] args) 
	{
		final int FRAME_WIDTH = 250;
		final int FRAME_HEIGHT = 100;
		Font headlineFont = new Font("Arial", Font.BOLD, 36);	// font object declared
		
		JFrame aFrame = new JFrame("Fourth Frame");
		
		aFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		aFrame.setVisible(true);
		aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel greeting = new JLabel("Good Day");
		greeting.setFont(headlineFont);							// new font applied to greeting
		aFrame.add(greeting);


	}

}

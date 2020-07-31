package CSIS2175.L_Chapter_12;
//Date : 2020.07.30
//Name : Mark JunHyung Kim
//Chapter : Lecture#12 = Chapter#12
//Subject : P017 - JFrame3

import javax.swing.*;
public class P017_JFrame3 
{

	public static void main(String[] args) 
	{
		final int FRAME_WIDTH = 250;
		final int FRAME_HEIGHT = 100;
		JFrame aFrame = new JFrame("Third Frame");
		
		aFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		aFrame.setVisible(true);
		aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel greeting = new JLabel("Good Day");
		aFrame.add(greeting);
	}

}

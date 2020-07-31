package CSIS2175.L_Chapter_12;
//Date : 2020.07.30
//Name : Mark JunHyung Kim
//Chapter : Lecture#12 = Chapter#12
//Subject : P015 - JFrame2

import javax.swing.*;
public class P015_JFrame2 
{

	public static void main(String[] args) 
	{
		JFrame.setDefaultLookAndFeelDecorated(true);	// 좀더 fancy한 프레임을 만들때..
		JFrame aFrame = new JFrame("Second Frame");
		aFrame.setSize(250, 100);
		aFrame.setVisible(true);
	}

}

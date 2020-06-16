package CSIS2175.ForMidTerm_Chap1_6;
//Date : 2020.06.16
//Name : Mark JunHyung Kim
//Chapter : For mid-term in S2020 (Chap#1 - #6)
//Subject : P167 - Compare Loop Times

import java.time.*;
public class P167_CompareLoopTimes {

	public static void main(String[] args) 
	{
		int startTime, endTime;
		final int REPEAT = 100_000;		// 십만임 (콤마대신 언더바)
		final int FACTOR = 1_000_000;
		
		System.out.println(REPEAT);
		
		LocalDateTime now;
		now = LocalDateTime.now();
		
		startTime = now.getNano();
		
		for(int x = 0; x <= REPEAT; ++x)
			for(int y = 0; y <= REPEAT; ++y);
		
		now = LocalDateTime.now();
		endTime = now.getNano();
		
		System.out.println("Time for loops starting from 0 : " + ((endTime - startTime) / FACTOR) + " milliseconds");
		
		now = LocalDateTime.now();
		startTime = now.getNano();
		
		for(int x = REPEAT; x >= 0; --x)
			for(int y = REPEAT; y >= 0; --y);
		
		now = LocalDateTime.now();
		endTime = now.getNano();
		
		System.out.println("Time for loops ending with 0 : " + ((endTime - startTime) / FACTOR) + " milliseconds");

	}

}
